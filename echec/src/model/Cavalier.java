package model;

import java.util.HashMap;

public class Cavalier extends Piece{
	
	Movement m;
	HashMap<Movement,Boolean> rules = new HashMap<Movement,Boolean>();
	
	public void createRules(){
		rules.put(new Movement(new Integer(1),new Integer(2),new Integer(0),new Integer(0)),true);
		rules.put(new Movement(new Integer(1),new Integer(-2),new Integer(0),new Integer(0)),true);
		rules.put(new Movement(new Integer(-1),new Integer(2),new Integer(0),new Integer(0)),true);
		rules.put(new Movement(new Integer(-1),new Integer(-2),new Integer(0),new Integer(0)),true);
		rules.put(new Movement(new Integer(2),new Integer(1),new Integer(0),new Integer(0)),true);
		rules.put(new Movement(new Integer(2),new Integer(-1),new Integer(0),new Integer(0)),true);
		rules.put(new Movement(new Integer(-2),new Integer(1),new Integer(0),new Integer(0)),true);
		rules.put(new Movement(new Integer(-2),new Integer(-1),new Integer(0),new Integer(0)),true);
		rules.put(new Movement(new Integer(-2),new Integer(-1),new Integer(0),new Integer(0)),true);
		rules.put(new Movement(new Integer(-2),new Integer(-1),new Integer(0),new Integer(0)),true);	
	}
	
	public Cavalier(int x, int y, String color) {
		super(x,y,color);
	}
}
