package model;

import java.util.HashMap;

public class Pion extends Piece {
	
	Movement m;
	HashMap<Movement,Boolean> rules = new HashMap<Movement,Boolean>();
	
	public Pion(int x, int y, String color){
		super(x, y, color);
		rules.put(new Movement(new Integer(0),new Integer(1),new Integer(0),new Integer(0)),false);
		rules.put(new Movement(new Integer(0),new Integer(2),new Integer(0),new Integer(0)),false);
		rules.put(new Movement(new Integer(1),new Integer(1),new Integer(0),new Integer(0)),false);
	}	
}
