package model;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import java.util.Map.Entry;

public abstract class Piece {
	
	protected Rules m_allRules = Rules.getInstance();
	protected int m_x;
	protected int m_y;
	protected String m_color;
	protected boolean is_deleted;
	protected Map<String,Couple<Movement,Boolean>> m_rules;
	
	public Piece(int x, int y, String color)
	{
		m_x = x;
		m_y = y;
		m_color = color;
		is_deleted = false;

		m_rules = new HashMap<String,Couple<Movement,Boolean>>();
		this.addRules();
	}
	
	
	public abstract void addRules();
	
	public String getColor() {
		return m_color;
	}
	
	public boolean canMove(Grille grille, int startLigne, int startColonne, int dx, int dy) {
		System.out.println("B  "+dx+":"+dy);
		Set cles = m_rules.keySet();
		Iterator it = cles.iterator();
		int tmp_dx, tmp_dy;
		tmp_dx = startLigne;
		tmp_dy = startColonne;
		Couple<Integer,Integer> destCouple = new Couple<Integer, Integer>(dx, dy);
		
		Movement rule;
		Boolean canMove = false;
		
		HashSet<Couple<Integer,Integer>> tmp_destinations = new HashSet<Couple<Integer, Integer>>();
		int coef = 1;
		boolean canJump;
		while (it.hasNext()){
		   String cle =(String) it.next();
		   boolean infinite = cle.contains("*");
		   //System.out.println("infinite = " + infinite);
		   //System.out.println("DŽpart : x= "+ startLigne + "  y= " + startColonne);
		   //System.out.println(this.m_allRules.getValueDeplacement(cle).getX().getM_y());
		   rule = this.m_allRules.getValueDeplacement(cle).getX();
		   canJump = this.m_allRules.getValueDeplacement(cle).getY();
		   if(rule.getM_z1() == 0 && rule.getM_z2() == 0) {
			   
			   if(this.getColor() == "White") {
				   coef = -1;
			   }
			   
			   tmp_dx = startLigne + coef * rule.getM_y();
			   tmp_dy = startColonne + coef * rule.getM_x();
			   
			   if ( (infinite && 
					   ((
							   (rule.getM_y() == 7 || rule.getM_y() == -7) && dy==startColonne && dx!=startLigne) 
							   || ((rule.getM_x() == 9 || rule.getM_x() == -9) && dx==startLigne && dy!=startColonne))
					   ) && isDestAvailable(grille, startLigne, startColonne, dx, dy))
			   {
				   	return true;
			   }
			   
		   } else if(rule.getM_z1() != 0) {
			   tmp_dx = startLigne + rule.getM_z1();
			   tmp_dy = startColonne - rule.getM_z1();
			   
			   if ( infinite && (rule.getM_z1() == 7 || rule.getM_z1() == -7) && rule.getM_z2() == 0 ) 
			   {
				   if (((float)(dx-startLigne)/(float)(dy-startColonne)) == -1 && isDestAvailable(grille, startLigne, startColonne, dx, dy))
				   {
					   return true;
				   }
			   }
			   //System.out.println("2." + tmp_dx + ";" + tmp_dy);
		   } else if(rule.getM_z2() != 0) {
			   tmp_dx = startLigne + rule.getM_z2();
			   tmp_dy = startColonne + rule.getM_z2();
			   
			   if ( infinite && (rule.getM_z2() == 7 || rule.getM_z2() == -7) && rule.getM_z1() == 0 ) 
			   {
				   if (((float)(dx-startLigne)/(float)(dy-startColonne)) == 1 && isDestAvailable(grille, startLigne, startColonne, dx, dy))
				   {
					   return true;
				   }
			   }
			   //System.out.println("3." + tmp_dx + ";" + tmp_dy);
		   }
		   boolean canAdd = isDestAvailable(grille, startLigne, startColonne, tmp_dx, tmp_dy);
		  
		   if(canAdd) {
			   tmp_destinations.add(new Couple<Integer, Integer>(tmp_dx, tmp_dy));
		   }
	}
		
		Iterator<Couple<Integer,Integer>> ite = tmp_destinations.iterator();
		
		while (ite.hasNext() && !canMove) {
		 Couple<Integer,Integer> dest = ite.next();
		 if(dest.getX() == destCouple.getX() && dest.getY() == destCouple.getY())
			 canMove = true;
		}
		return canMove;
	}
	
	private boolean isDestAvailable(Grille grille, int startLigne, int startColonne, int destLigne, int destColonne) {
	   boolean canAdd = true;
	   if(destColonne == startColonne && destLigne != startLigne) {
		   int i = startLigne+1;
		   while(i < destLigne && canAdd) {
			   if(grille.hasPiece(i, destColonne)) {
				   canAdd = false;
			   }
			   i++;
		   }
	   } else if(destLigne == startLigne && destColonne != startColonne) {
		  System.out.println("A  "+destColonne+":"+startColonne);
		   if(destColonne > startColonne) {
			   int j = startColonne+1;
			   while(j < destColonne && canAdd) {
				   if(grille.hasPiece(destLigne, j)) {
					   canAdd = false;
				   }
				   j++;
			   }
		   }
		   else {
			   int j = startColonne-1;
		   
			   while(j > destColonne && canAdd) {
				   if(grille.hasPiece(destLigne, j)) {
					   canAdd = false;
				   }
				   j--;
			   }
		   }
	   }
		return canAdd;
	}
	
	
}
