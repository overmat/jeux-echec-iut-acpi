package model;
import java.util.HashSet;

public abstract class Piece {
	
	private int m_x;
	private int m_y;
	private String m_color;
	private boolean is_deleted;
	private HashSet rules;
	
	
	public Piece(int x, int y, String color)
	{
		m_x = x;
		m_y = y;
		m_color = color;
		is_deleted = false;
		rules = new HashSet();
	}
	
	public String getColor() {
		return m_color;
	}
	
}
