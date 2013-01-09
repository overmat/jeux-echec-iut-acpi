package model;

public class ResultMove {
	
	private int startLigne;
	private int startColonne;
	private int destLigne;
	private int destColonne;
	
	boolean eat;
	boolean canMove;
	
	public ResultMove(int startLigne, int startColonne, int destLigne, int destColonne, boolean eat, boolean canMove) {
		this.startLigne = startLigne;
		this.startColonne = startColonne;
		this.destLigne = destLigne;
		this.destColonne = destColonne;
		
		this.eat = eat;
		this.canMove = canMove;
	}

	public int getStartColonne() {
		return startColonne;
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
