package model;

import javax.swing.event.EventListenerList;


import listerners.MovementEvent;
import listerners.MovementListener;


public class EchecModel {
	private EventListenerList listeners;
	
	private Grille m_grille;
	private EtatPartie m_etatPartie;
	
	private ResultMove resultMove;
	public EchecModel() {
		super();
		m_grille = new Grille(8,10);
		m_grille.initialisation();
		listeners = new EventListenerList();
		this.m_etatPartie = new EtatPartie("White");
		
	}
	
	public void addMouvementListener(MovementListener listener){
		listeners.add(MovementListener.class, listener);
	}
	
	public void tryToMove(int dx,int dy, int sx, int sy) {
		
		boolean moveMaybeValid = m_grille.getPiece(sx, sy).canMove(m_grille,sx, sy, dx, dy);
		boolean hasEated = false;
		boolean canMove = true;;
		if(moveMaybeValid) {
			Piece destPiece = null;
			if ( m_grille.hasPiece(dx, dy)) {
				 destPiece = m_grille.getPiece(dx, dy);
				hasEated = true;
			}
			
			m_grille.deplacerPiece(sx, sy, dx, dy);
			
			if(this.m_grille.isChess(this.m_etatPartie.getCurrentPlayer())) {
				m_grille.deplacerPiece(dx, dy, sx, sy);
				if(hasEated) {
					m_grille.getPieces()[dx][dy].setPiece(destPiece);
				}
				hasEated = false;
				canMove = false;
			} else {
				if(this.m_etatPartie.getCurrentPlayer() == "White") {
					this.m_etatPartie.setCurrentPlayer("Black");
					this.m_etatPartie.setBlackChess(this.m_grille.isChess("Black"));
					if(this.m_etatPartie.isBlackChess()) {
						System.out.println(m_grille.isChessMath("Black"));
					}
				} else {
					this.m_etatPartie.setCurrentPlayer("White");
					this.m_etatPartie.setWhiteChess(this.m_grille.isChess("White"));
					
					if(this.m_etatPartie.isWhiteChess()) {
						System.out.println(m_grille.isChessMath("White"));
					}
				}
			}
		} else {
			canMove = false;
		}
		
		this.resultMove = new ResultMove(sx,sy, dx, dy, hasEated, canMove,this.m_etatPartie.getCurrentPlayer());
		
		fireTriedToMove();
	}
	public EtatPartie getEtatPartie() {
		return this.m_etatPartie;
	}
	
	public Grille getGrille() {
		return m_grille;
	}
	private void fireTriedToMove() {
		// TODO Auto-generated method stub
		MovementListener[] listenerList = (MovementListener[])listeners.getListeners(MovementListener.class);
		
		for(MovementListener listener : listenerList){
			listener.resultMovement(new MovementEvent(this, this.resultMove));
		}
	}

}
