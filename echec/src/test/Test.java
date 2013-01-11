/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import model.Grille;

import org.junit.Before;

/**
 * @author Bob
 *
 */
public class Test {

	public Grille m_grille;
	
	@Before
	public void setUp() {
		m_grille = new Grille(8, 10);
		m_grille.initialisation();
	}
	
	@org.junit.Test
	public void DimensionGrille() {
		assertEquals(m_grille.getM_largeur(),8);
		assertEquals(m_grille.getM_hauteur(),10);
		assertEquals(m_grille.getM_nb_cases(),80);
	}
	
	@org.junit.Test
	public void nbPiece() {
		int nb_piece = 0 ;
		for(int i=0;i<8;i++){
			for(int j=0;j<10;j++){
				if(m_grille.hasPiece(i, j) == true)nb_piece+=1; 
			}
		}
		assertEquals(nb_piece,40);
	}
	
	@org.junit.Test
	public void pion(){
		for(int i = 0; i<10;i++){
		assertEquals(m_grille.getPiece(1, i).getClass().getSimpleName(),"Pion");
		assertEquals(m_grille.getPiece(6, i).getClass().getSimpleName(),"Pion");
		}
	}
	
	@org.junit.Test
	public void tour(){
		assertEquals(m_grille.getPiece(0, 0).getClass().getSimpleName(),"Tour");
		assertEquals(m_grille.getPiece(0, 9).getClass().getSimpleName(),"Tour");
		assertEquals(m_grille.getPiece(7, 0).getClass().getSimpleName(),"Tour");
		assertEquals(m_grille.getPiece(7, 9).getClass().getSimpleName(),"Tour");
	}

	@org.junit.Test
	public void fou(){
		assertEquals(m_grille.getPiece(0, 3).getClass().getSimpleName(),"Fou");
		assertEquals(m_grille.getPiece(0, 6).getClass().getSimpleName(),"Fou");
		assertEquals(m_grille.getPiece(7, 3).getClass().getSimpleName(),"Fou");
		assertEquals(m_grille.getPiece(7, 6).getClass().getSimpleName(),"Fou");
	}
	
	@org.junit.Test
	public void cavalier(){
		assertEquals(m_grille.getPiece(0, 1).getClass().getSimpleName(),"Cavalier");
		assertEquals(m_grille.getPiece(0, 8).getClass().getSimpleName(),"Cavalier");
		assertEquals(m_grille.getPiece(7, 1).getClass().getSimpleName(),"Cavalier");
		assertEquals(m_grille.getPiece(7, 8).getClass().getSimpleName(),"Cavalier");
	}
	
	@org.junit.Test
	public void roi(){
		assertEquals(m_grille.getPiece(0, 5).getClass().getSimpleName(),"Roi");
		assertEquals(m_grille.getPiece(7, 5).getClass().getSimpleName(),"Roi");
	}
	
	@org.junit.Test
	public void reine(){
		assertEquals(m_grille.getPiece(0, 4).getClass().getSimpleName(),"Reine");
		assertEquals(m_grille.getPiece(7, 4).getClass().getSimpleName(),"Reine");
	}
	
	@org.junit.Test
	public void Imperatrice(){
		assertEquals(m_grille.getPiece(0, 2).getClass().getSimpleName(),"Imperatrice");
		assertEquals(m_grille.getPiece(7, 2).getClass().getSimpleName(),"Imperatrice");
	}
	
	@org.junit.Test
	public void Princesse(){
		assertEquals(m_grille.getPiece(0, 7).getClass().getSimpleName(),"Princesse");
		assertEquals(m_grille.getPiece(7, 7).getClass().getSimpleName(),"Princesse");
	}
		
}
