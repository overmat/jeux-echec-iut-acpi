package model;

import java.util.HashMap;

public class Movement {

	Integer m_x;
	Integer m_y;
	Integer m_z1;
	Integer m_z2;
	
	Movement(int m_x, int m_y, int m_z1, int m_z2){
		this.m_x = m_x; 	//axe horizontal : _
		this.m_y = m_y; 	//axe vertical  :  |
		this.m_z1 = m_z1; 	//diagonale 1   :  /
		this.m_z2 = m_z2; 	//diagonale 2   :  \
	}

	//mouvement vers le haut : 1h
	//mouvement vers le bas : 1b
	//mouvement vers la droite : 1d
	//mouvement vers la gauche : 1g
	//mouvement diagonale en haut à droite : D1 
	//mouvement diagonale en bas à gauche : d1
	//mouvement diagonale en bas à droite : D2
	//mouvement diagonale en haut à gauche : d2
	
	HashMap<Movement,Boolean> rule = new HashMap<Movement,Boolean>();
	
	public void createRules(){
		//pion
		rule.put(new Movement(new Integer(0),new Integer(1),new Integer(0),new Integer(0)),false); //1h
		rule.put(new Movement(new Integer(0),new Integer(2),new Integer(0),new Integer(0)),false); //2h
		//rule.put(new Movement(new Integer(1),new Integer(1),new Integer(0),new Integer(0)),false); //1h1d
		//cavalier
		rule.put(new Movement(new Integer(1),new Integer(2),new Integer(0),new Integer(0)),true); //1d2h
		rule.put(new Movement(new Integer(1),new Integer(-2),new Integer(0),new Integer(0)),true);//1d2b
		rule.put(new Movement(new Integer(-1),new Integer(2),new Integer(0),new Integer(0)),true);//1g2h
		rule.put(new Movement(new Integer(-1),new Integer(-2),new Integer(0),new Integer(0)),true);//1g2b
		rule.put(new Movement(new Integer(2),new Integer(1),new Integer(0),new Integer(0)),true);//2d1h
		rule.put(new Movement(new Integer(2),new Integer(-1),new Integer(0),new Integer(0)),true);//2d1bx²
		rule.put(new Movement(new Integer(-2),new Integer(1),new Integer(0),new Integer(0)),true);//2g1h
		rule.put(new Movement(new Integer(-2),new Integer(-1),new Integer(0),new Integer(0)),true);//2g1b
		//tour
		rule.put(new Movement(new Integer(0),new Integer(7),new Integer(0),new Integer(0)),false);//*h
		rule.put(new Movement(new Integer(0),new Integer(-7),new Integer(0),new Integer(0)),false);//*b
		rule.put(new Movement(new Integer(7),new Integer(0),new Integer(0),new Integer(0)),false);//*d
		rule.put(new Movement(new Integer(-7),new Integer(0),new Integer(0),new Integer(0)),false);//*g
		//fou
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(7),new Integer(0)),false);//*D1
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(7)),false);//*d1
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(-7),new Integer(0)),false);//*D2
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(-7)),false);//*d2
		//roi
		//rule.put(new Movement(new Integer(0),new Integer(1),new Integer(0),new Integer(0)),false);// redondance 1h
		rule.put(new Movement(new Integer(0),new Integer(-1),new Integer(0),new Integer(0)),false);// 1b
		rule.put(new Movement(new Integer(1),new Integer(0),new Integer(0),new Integer(0)),false);//1d
		rule.put(new Movement(new Integer(-1),new Integer(0),new Integer(0),new Integer(0)),false);//1g
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(1),new Integer(0)),false);//1D1
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(-1),new Integer(0)),false);//1d1
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(1)),false);//1D2
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(-1)),false);//1d2
	}
}
