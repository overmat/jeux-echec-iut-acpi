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
	
	public abstract boolean canMove(int sx,int sy,int ds,int dy);
	
	
}
