package model;

public class Grille {
	
	private Piece [][] m_grille;
	private int m_largeur;
	private int m_hauteur;
	private int m_nb_cases;
	
	public Grille(int largeur, int hauteur) {
		m_largeur = largeur;
		m_hauteur = hauteur;
		m_nb_cases = largeur * hauteur;
		m_grille = new Piece[largeur][hauteur];
	}
	
	public void initialisation(){
		
		for(int i = 0; i < m_largeur; i++)
		{
			m_grille[i][1] = new Pion(i, 1, "Noir");
			m_grille[i][6] = new Pion(i, 1, "Blanc");
		}
		
		m_grille[0][0] = new Tour(0, 0, "Noir");
		m_grille[0][m_largeur-1] = new Tour(0, m_largeur-1, "Noir");
		m_grille[0][1] = new Cavalier(0, 1, "Noir");
		m_grille[0][m_largeur-2] = new Cavalier(0, m_largeur-2, "Noir");
		m_grille[0][2] = new Fou(0, 2, "Noir");
		m_grille[0][m_largeur-3] = new Fou(0, m_largeur-3, "Noir");
		m_grille[0][3] = new Reine(0, 3, "Noir");
		m_grille[0][4] = new Roi(0, 4, "Noir");
		
		m_grille[6][0] = new Tour(6, 0, "Noir");
		m_grille[6][m_largeur-1] = new Tour(6, m_largeur-1, "Noir");
		m_grille[6][1] = new Cavalier(6, 1, "Noir");
		m_grille[6][m_largeur-2] = new Cavalier(6, m_largeur-2, "Noir");
		m_grille[6][2] = new Fou(6, 2, "Noir");
		m_grille[6][m_largeur-3] = new Fou(6, m_largeur-3, "Noir");
		m_grille[6][3] = new Reine(6, 3, "Noir");
		m_grille[6][4] = new Roi(6, 4, "Noir");
		
		
	}
	

}
