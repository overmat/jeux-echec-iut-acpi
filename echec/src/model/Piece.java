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
	
	public boolean canMove(int startLigne, int startColonne, int dx, int dy) {
		Set cles = m_rules.keySet();
		Iterator it = cles.iterator();
		int tmp_dx, tmp_dy;
		tmp_dx = startLigne;
		tmp_dy = startColonne;
		Couple<Integer,Integer> destCouple = new Couple<Integer, Integer>(dx, dy);
		
		Movement rule;
		Boolean canMove = false;
		
		HashSet<Couple<Integer,Integer>> tmp_destinations = new HashSet<Couple<Integer, Integer>>();
		
		while (it.hasNext()){
		   String cle =(String) it.next();
		   boolean diagInfinite = cle.contains("*");
		   System.out.println("DŽpart : "+ startLigne + ";" + startColonne);
		   //System.out.println(this.m_allRules.getValueDeplacement(cle).getX().getM_y());
		   rule = this.m_allRules.getValueDeplacement(cle).getX();
		   if(rule.getM_z1() == 0 && rule.getM_z2() == 0) {
			   tmp_dx = startLigne + rule.getM_y();
			   tmp_dy = startColonne + rule.getM_x();
			   System.out.println("1." + tmp_dx + ";" + tmp_dy);
		   } else if(rule.getM_z1() != 0) {
			   tmp_dx = startLigne + rule.getM_z1();
			   tmp_dy = startColonne + rule.getM_z1();
			   //System.out.println("2." + tmp_dx + ";" + tmp_dy);
		   } else if(rule.getM_z2() != 0) {
			   tmp_dx = startLigne - rule.getM_z2();
			   tmp_dy = startColonne - rule.getM_z2();
			   System.out.println("3." + tmp_dx + ";" + tmp_dy);
		   }
		   
		   tmp_destinations.add(new Couple<Integer, Integer>(tmp_dx, tmp_dy));
		}
		
		Iterator<Couple<Integer,Integer>> ite = tmp_destinations.iterator();
		
		while (ite.hasNext() && !canMove) {
		 Couple<Integer,Integer> dest = ite.next();
		 if(dest.getX() == destCouple.getX() && dest.getY() == destCouple.getY())
			 canMove = true;
		}
		return canMove;
	}
	
	
}
