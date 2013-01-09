package model;

import java.util.HashMap;

public class Movement {

	Integer m_x;
	Integer m_y;
	Integer m_z1;
	Integer m_z2;
	
	Movement(int m_x, int m_y, int m_z1, int m_z2){
		this.m_x = m_x;
		this.m_y = m_y;
		this.m_z1 = m_z1;
		this.m_z2 = m_z2;
	}
	
	HashMap<Movement,Boolean> rule = new HashMap<Movement,Boolean>();
	
	public void createRules(){
		//pion
		rule.put(new Movement(new Integer(0),new Integer(1),new Integer(0),new Integer(0)),false);
		rule.put(new Movement(new Integer(0),new Integer(2),new Integer(0),new Integer(0)),false);
		rule.put(new Movement(new Integer(1),new Integer(1),new Integer(0),new Integer(0)),false);
		//cavalier
		rule.put(new Movement(new Integer(1),new Integer(2),new Integer(0),new Integer(0)),true);
		rule.put(new Movement(new Integer(1),new Integer(-2),new Integer(0),new Integer(0)),true);
		rule.put(new Movement(new Integer(-1),new Integer(2),new Integer(0),new Integer(0)),true);
		rule.put(new Movement(new Integer(-1),new Integer(-2),new Integer(0),new Integer(0)),true);
		rule.put(new Movement(new Integer(2),new Integer(1),new Integer(0),new Integer(0)),true);
		rule.put(new Movement(new Integer(2),new Integer(-1),new Integer(0),new Integer(0)),true);
		rule.put(new Movement(new Integer(-2),new Integer(1),new Integer(0),new Integer(0)),true);
		rule.put(new Movement(new Integer(-2),new Integer(-1),new Integer(0),new Integer(0)),true);
		rule.put(new Movement(new Integer(-2),new Integer(-1),new Integer(0),new Integer(0)),true);
		rule.put(new Movement(new Integer(-2),new Integer(-1),new Integer(0),new Integer(0)),true);
		//tour
		rule.put(new Movement(new Integer(0),new Integer(7),new Integer(0),new Integer(0)),false);
		rule.put(new Movement(new Integer(0),new Integer(-7),new Integer(0),new Integer(0)),false);
		rule.put(new Movement(new Integer(7),new Integer(0),new Integer(0),new Integer(0)),false);
		rule.put(new Movement(new Integer(-7),new Integer(0),new Integer(0),new Integer(0)),false);
		//fou
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(7),new Integer(0)),false);
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(7)),false);
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(-7),new Integer(0)),false);
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(-7)),false);
		//reine
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(7),new Integer(0)),false);
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(7)),false);
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(-7),new Integer(0)),false);
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(-7)),false);
		rule.put(new Movement(new Integer(0),new Integer(7),new Integer(0),new Integer(0)),false);
		rule.put(new Movement(new Integer(0),new Integer(-7),new Integer(0),new Integer(0)),false);
		rule.put(new Movement(new Integer(7),new Integer(0),new Integer(0),new Integer(0)),false);
		rule.put(new Movement(new Integer(-7),new Integer(0),new Integer(0),new Integer(0)),false);
		//roi
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(1),new Integer(0)),false);
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(1)),false);
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(-1),new Integer(0)),false);
		rule.put(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(-1)),false);
		rule.put(new Movement(new Integer(0),new Integer(1),new Integer(0),new Integer(0)),false);
		rule.put(new Movement(new Integer(0),new Integer(-1),new Integer(0),new Integer(0)),false);
		rule.put(new Movement(new Integer(1),new Integer(0),new Integer(0),new Integer(0)),false);
		rule.put(new Movement(new Integer(-1),new Integer(0),new Integer(0),new Integer(0)),false);
	}

}
