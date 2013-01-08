package model;

public class Grille {
	
	private Piece [] m_grille;
	private int m_largeur;
	private int m_hauteur;
	private int m_nb_cases;
	
	public Grille(int largeur, int hauteur) {
		m_largeur = largeur;
		m_hauteur = hauteur;
		m_nb_cases = largeur * hauteur;
		m_grille = new Piece[m_nb_cases];
	}
	
	public void initialisation(){
	}

}
