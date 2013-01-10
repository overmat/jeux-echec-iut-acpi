package model;

public class Grille {
	
	private Case [][] m_grille;
	private int m_largeur;
	private int m_hauteur;
	private int m_nb_cases;
	
	public Grille(int largeur, int hauteur) {
		m_largeur = largeur;
		m_hauteur = hauteur;
		m_nb_cases = largeur * hauteur;
		
		m_grille = new Case[largeur][hauteur];
		
		for (int i = 0; i < largeur; i++)
		{
			for (int j = 0; j< hauteur; j++)
			{
				m_grille[i][j] = new Case();
			}
		}
	}
	
	public void initialisation(){
		
		for(int i = 0; i < 10; i++)//for(int i = 0; i < m_largeur; i++)
		{
			m_grille[1][i].setPiece(new Pion(i, 1, "Black"));
			m_grille[6][i].setPiece(new Pion(i, 6, "White"));
		}
		
		m_grille[0][0].setPiece(new Tour(0, 0, "Black"));
		m_grille[0][9].setPiece(new Tour(0, m_largeur-1, "Black"));
		m_grille[0][1].setPiece(new Cavalier(0, 1, "Black"));
		m_grille[0][8].setPiece(new Cavalier(0, m_largeur-2, "Black"));
		m_grille[0][2].setPiece(new Imperatrice(0, 2, "Black"));
		m_grille[0][7].setPiece(new Princesse(0, 3, "Black"));
		m_grille[0][3].setPiece(new Fou(0, 3, "Black"));
		m_grille[0][6].setPiece(new Fou(0, m_largeur-3, "Black"));
		m_grille[0][4].setPiece(new Reine(0, 3, "Black"));
		m_grille[0][5].setPiece(new Roi(0, 5, "Black"));
		
		m_grille[7][0].setPiece(new Tour(0, 0, "White"));
		m_grille[7][9].setPiece(new Tour(0, m_largeur-1, "White"));
		m_grille[7][1].setPiece(new Cavalier(0, 1, "White"));
		m_grille[7][8].setPiece(new Cavalier(0, m_largeur-2, "White"));
		m_grille[7][2].setPiece(new Imperatrice(0, 2, "White"));
		m_grille[7][7].setPiece(new Princesse(0, 3, "White"));
		m_grille[7][3].setPiece(new Fou(0, 3, "White"));
		m_grille[7][6].setPiece(new Fou(0, m_largeur-3, "White"));
		m_grille[7][4].setPiece(new Reine(0, 3, "White"));
		m_grille[7][5].setPiece(new Roi(0, 5, "White"));
		
		
	}

	
	public void deplacerPiece(int xD, int yD, int xF, int yF)
	{
		
			m_grille[xF][yF].setPiece(m_grille[xD][yD].getPiece());
			m_grille[xD][yD] = new Case();
		
	}
	
	public boolean hasPiece(int x, int y) {
		return m_grille[x][y].hasPiece();
	}
	
	public Piece getPiece(int x, int y)
	{
		return m_grille[x][y].getPiece();
	}
	
	public Case[][] getPieces() {
		return m_grille;
	}
	

}
