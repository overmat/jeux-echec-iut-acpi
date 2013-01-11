package model;

public class ResultMove {
	
	private int startLigne;
	private int startColonne;
	private int destLigne;
	private int destColonne;
	
	boolean eat;
	boolean canMove;
	
	private String currentPlayer;
	
	public ResultMove(int startLigne, int startColonne, int destLigne, int destColonne, boolean eat, boolean canMove, String currentPlayer) {
		this.startLigne = startLigne;
		this.startColonne = startColonne;
		this.destLigne = destLigne;
		this.destColonne = destColonne;
		
		this.eat = eat;
		this.canMove = canMove;
		
		this.currentPlayer = currentPlayer;
	}

	public int getStartColonne() {
		return startColonne;
	}
	
	public String getCurrentPlayer() {
		return this.currentPlayer;
	}
	
	public int getStartLigne() {
		return startLigne;
	}

	public int getDestLigne() {
		return destLigne;
	}

	public int getDestColonne() {
		return destColonne;
	}

	public boolean hasEat() {
		return eat;
	}

	public boolean CanMove() {
		return canMove;
	}
	
	
}
