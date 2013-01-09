package model;

import java.util.HashMap;

public class Tour extends Piece{
	
	Movement m;
	HashMap<Movement,Boolean> rules = new HashMap<Movement,Boolean>();
	
	public Tour(int x, int y, String color) {
		super(x,y,color);
	}
}
