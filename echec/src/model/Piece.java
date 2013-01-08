package model;

public abstract class Piece {
	
	private int m_x;
	private int m_y;
	private String m_color;
	private boolean is_deleted;
	
	
	public Piece(int x, int y, String color)
	{
		m_x = x;
		m_y = y;
		m_color = color;
		is_deleted = false;
	}
	
}
