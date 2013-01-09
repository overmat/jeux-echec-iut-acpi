package listerners;

import java.util.EventObject;

import model.ResultMove;

public class MovementEvent extends EventObject{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public int startLigne;
	public int startColonne;
	public int destLigne;
	public int destColonne;
	
	public boolean eat;
	public boolean canMove;
	
	public MovementEvent(Object source, ResultMove result) {
		super(source);
		// TODO Auto-generated constructor stub
		this.startLigne = result.getStartLigne();
		this.startColonne = result.getStartColonne();
		this.destLigne = result.getDestLigne();
		this.destColonne = result.getDestColonne();
		
		this.eat = result.hasEat();
		this.canMove = result.CanMove();
	}

}
