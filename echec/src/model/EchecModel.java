package model;

import javax.swing.event.EventListenerList;


import listerners.ButtonGraouEvent;
import listerners.ButtonGraouListener;


public class EchecModel {
	private EventListenerList listeners;
	
	private Grille m_grille;
	public String resultButton;
	public EchecModel() {
		super();
		m_grille = new Grille(8,8);
		m_grille.initialisation();
		listeners = new EventListenerList();
	}
	
	public void addButtonGraouListener(ButtonGraouListener listener){
		listeners.add(ButtonGraouListener.class, listener);
	}
	
	public void buttonGraou() {
		this.resultButton = "Yahoo ce texte vient du modele";
		fireButtonGraouClicked();
	}
	
	public Grille getGrille() {
		return m_grille;
	}
	private void fireButtonGraouClicked() {
		// TODO Auto-generated method stub
		ButtonGraouListener[] listenerList = (ButtonGraouListener[])listeners.getListeners(ButtonGraouListener.class);
		
		for(ButtonGraouListener listener : listenerList){
			listener.resultButtonGraou(new ButtonGraouEvent(this, resultButton));
		}
	}
}
