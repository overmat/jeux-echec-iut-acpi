package model;

public class EtatPartie {
	private String currentPlayer; // 1 blanc, 0 noir
	
	private boolean blackChess;
	private boolean whiteChess;
	
	public EtatPartie(String currentPlayer) {
		this.currentPlayer = currentPlayer;
		this.blackChess = false;
		this.whiteChess = false;
	}

	public String getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(String currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public boolean isBlackChess() {
		return blackChess;
	}

	public void setBlackChess(boolean blackChess) {
		this.blackChess = blackChess;
	}

	public boolean isWhiteChess() {
		return whiteChess;
	}

	public void setWhiteChess(boolean whiteChess) {
		this.whiteChess = whiteChess;
	}
	
	
}
