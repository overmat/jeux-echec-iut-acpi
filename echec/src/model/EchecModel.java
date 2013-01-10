package model;

import javax.swing.event.EventListenerList;


import listerners.MovementEvent;
import listerners.MovementListener;


public class EchecModel {
	private EventListenerList listeners;
	
	private Grille m_grille;
	public String resultButton;
	
	private ResultMove resultMove;
	public EchecModel() {
		super();
		m_grille = new Grille(8,10);
		m_grille.initialisation();
		listeners = new EventListenerList();
	}
	
	public void addMouvementListener(MovementListener listener){
		listeners.add(MovementListener.class, listener);
	}
	
	public void tryToMove(int dx,int dy, int sx, int sy) {
		
		boolean canMove = m_grille.getPiece(sx, sy).canMove(m_grille,sx, sy, dx, dy);
		boolean hasEated = false;
		
		if(canMove) {
			if ( m_grille.hasPiece(dx, dy)) {
				hasEated = true;
			}
			
			m_grille.deplacerPiece(sx, sy, dx, dy);
		}
		
		this.resultMove = new ResultMove(sx,sy, dx, dy, hasEated, canMove);
		
		fireTriedToMove();
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
