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
	
	HashMap<Integer, Movement> rule = new HashMap<Integer, Movement>();
	
	public void createRules(){
		//pion
		rule.put(0, new Movement(new Integer(0),new Integer(1),new Integer(0),new Integer(0)));
		rule.put(1, new Movement(new Integer(0),new Integer(2),new Integer(0),new Integer(0)));
		rule.put(2, new Movement(new Integer(1),new Integer(1),new Integer(0),new Integer(0)));
		//cavalier
		rule.put(3, new Movement(new Integer(1),new Integer(2),new Integer(0),new Integer(0)));
		rule.put(4, new Movement(new Integer(1),new Integer(-2),new Integer(0),new Integer(0)));
		rule.put(5, new Movement(new Integer(-1),new Integer(2),new Integer(0),new Integer(0)));
		rule.put(6, new Movement(new Integer(-1),new Integer(-2),new Integer(0),new Integer(0)));
		rule.put(7, new Movement(new Integer(2),new Integer(1),new Integer(0),new Integer(0)));
		rule.put(8, new Movement(new Integer(2),new Integer(-1),new Integer(0),new Integer(0)));
		rule.put(9, new Movement(new Integer(-2),new Integer(1),new Integer(0),new Integer(0)));
		rule.put(10, new Movement(new Integer(-2),new Integer(-1),new Integer(0),new Integer(0)));
		rule.put(10, new Movement(new Integer(-2),new Integer(-1),new Integer(0),new Integer(0)));
		rule.put(10, new Movement(new Integer(-2),new Integer(-1),new Integer(0),new Integer(0)));
		//tour
		rule.put(10, new Movement(new Integer(0),new Integer(7),new Integer(0),new Integer(0)));
		rule.put(10, new Movement(new Integer(0),new Integer(-7),new Integer(0),new Integer(0)));
		rule.put(10, new Movement(new Integer(7),new Integer(0),new Integer(0),new Integer(0)));
		rule.put(10, new Movement(new Integer(-7),new Integer(0),new Integer(0),new Integer(0)));
		//fou
		rule.put(10, new Movement(new Integer(0),new Integer(0),new Integer(7),new Integer(0)));
		rule.put(10, new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(7)));
		rule.put(10, new Movement(new Integer(0),new Integer(0),new Integer(-7),new Integer(0)));
		rule.put(10, new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(-7)));
		//reine
		rule.put(10, new Movement(new Integer(0),new Integer(0),new Integer(7),new Integer(0)));
		rule.put(10, new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(7)));
		rule.put(10, new Movement(new Integer(0),new Integer(0),new Integer(-7),new Integer(0)));
		rule.put(10, new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(-7)));
		rule.put(10, new Movement(new Integer(0),new Integer(7),new Integer(0),new Integer(0)));
		rule.put(10, new Movement(new Integer(0),new Integer(-7),new Integer(0),new Integer(0)));
		rule.put(10, new Movement(new Integer(7),new Integer(0),new Integer(0),new Integer(0)));
		rule.put(10, new Movement(new Integer(-7),new Integer(0),new Integer(0),new Integer(0)));
		//roi
		rule.put(10, new Movement(new Integer(0),new Integer(0),new Integer(1),new Integer(0)));
		rule.put(10, new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(1)));
		rule.put(10, new Movement(new Integer(0),new Integer(0),new Integer(-1),new Integer(0)));
		rule.put(10, new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(-1)));
		rule.put(10, new Movement(new Integer(0),new Integer(1),new Integer(0),new Integer(0)));
		rule.put(10, new Movement(new Integer(0),new Integer(-1),new Integer(0),new Integer(0)));
		rule.put(10, new Movement(new Integer(1),new Integer(0),new Integer(0),new Integer(0)));
		rule.put(10, new Movement(new Integer(-1),new Integer(0),new Integer(0),new Integer(0)));
	}

}
