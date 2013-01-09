package model;

import java.util.HashMap;

public class Reine extends Piece{
	
	Movement m;
	HashMap<Movement,Boolean> rules = new HashMap<Movement,Boolean>();
	
	public Reine(int x, int y, String color) {
		super(x,y,color);
	}
}
