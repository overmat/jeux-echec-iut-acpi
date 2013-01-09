package model;

import java.util.HashMap;

public class Fou extends Piece {
	
	Movement m;
	HashMap<Movement,Boolean> rules = new HashMap<Movement,Boolean>();
	
	public Fou(int x, int y, String color) {
		super(x,y,color);
	}
}
