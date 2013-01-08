package model;

public class Case {
	
	private Piece m_piece;
	
	public Case() {	
	}
	
	public boolean hasPiece()
	{
		if (m_piece == null)
			return false;
		return true;
	}
	
	public void setPiece(Piece p)
	{
		m_piece = p;
	}
	
	public Piece getPiece()
	{
		return m_piece;
	}
}
