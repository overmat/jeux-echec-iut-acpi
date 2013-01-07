package model;

import javax.swing.event.EventListenerList;


import listerners.ButtonGraouEvent;
import listerners.ButtonGraouListener;


public class EchecModel {
	private EventListenerList listeners;
	
	public String resultButton;
	public EchecModel() {
		super();
		
		listeners = new EventListenerList();
	}
	
	public void addButtonGraouListener(ButtonGraouListener listener){
		listeners.add(ButtonGraouListener.class, listener);
	}
	
	public void buttonGraou() {
		this.resultButton = "Yahoo ce texte vient du modele";
		fireButtonGraouClicked();
	}

	private void fireButtonGraouClicked() {
		// TODO Auto-generated method stub
		ButtonGraouListener[] listenerList = (ButtonGraouListener[])listeners.getListeners(ButtonGraouListener.class);
		
		for(ButtonGraouListener listener : listenerList){
			listener.resultButtonGraou(new ButtonGraouEvent(this, resultButton));
		}
	}
}
