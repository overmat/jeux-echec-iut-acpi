package model;
import java.util.HashSet;

public abstract class Piece {
	
	protected int m_x;
	protected int m_y;
	protected String m_color;
	protected boolean is_deleted;
	protected HashSet m_rules;
	
	
	public Piece(int x, int y, String color)
	{
		m_x = x;
		m_y = y;
		m_color = color;
		is_deleted = false;
		m_rules = new HashSet();
	}
	
	
	public abstract void addRules();
	
	public String getColor() {
		return m_color;
	}
	
	
}
