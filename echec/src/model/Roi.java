package model;

import java.util.HashMap;

public class Roi extends Piece{
	
	Movement m;
	HashMap<Movement,Boolean> rules = new HashMap<Movement,Boolean>();
	
	public Roi(int x, int y, String color) {
		super(x,y,color);
	}
}
