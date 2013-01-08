package view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class LoadImages {
	private ImageIcon imageGrille;
	private ImageIcon imageWhitePion;
	private ImageIcon imageBlackPion;
	private ImageIcon imageBlackTour;
	private ImageIcon imageWhiteTour;
	private ImageIcon imageWhiteFou;
	private ImageIcon imageBlackFou;
	private ImageIcon imageWhiteCavalier;
	private ImageIcon imageBlackCavalier;
	private ImageIcon imageWhiteRoi;
	private ImageIcon imageBlackRoi;
	private ImageIcon imageWhiteReine;
	private ImageIcon imageBlackReine;
	public LoadImages() {
		
		try {
			BufferedImage image = ImageIO.read(new File("img/chessboard.png"));
			imageGrille  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		
		try {
			BufferedImage image = ImageIO.read(new File("img/WhitePion.png"));
			imageWhitePion  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		try {
			BufferedImage image = ImageIO.read(new File("img/BlackPion.png"));
			imageBlackPion  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		try {
			BufferedImage image = ImageIO.read(new File("img/WhiteTour.png"));
			imageWhiteTour  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		try {
			BufferedImage image = ImageIO.read(new File("img/BlackTour.png"));
			imageBlackTour  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		try {
			BufferedImage image = ImageIO.read(new File("img/WhiteFou.png"));
			imageWhiteFou  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		try {
			BufferedImage image = ImageIO.read(new File("img/BlackFou.png"));
			imageBlackFou  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		try {
			BufferedImage image = ImageIO.read(new File("img/WhiteCavalier.png"));
			imageWhiteCavalier  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		try {
			BufferedImage image = ImageIO.read(new File("img/BlackCavalier.png"));
			imageBlackCavalier  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		try {
			BufferedImage image = ImageIO.read(new File("img/WhiteRoi.png"));
			imageWhiteRoi  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		try {
			BufferedImage image = ImageIO.read(new File("img/BlackRoi.png"));
			imageBlackRoi  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		try {
			BufferedImage image = ImageIO.read(new File("img/WhiteReine.png"));
			imageWhiteReine  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		try {
			BufferedImage image = ImageIO.read(new File("img/BlackReine.png"));
			imageBlackReine  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		
	}
	
	public ImageIcon getChessBoard() { //image de fond
		return this.imageGrille;
	}
	
	public ImageIcon getWhitePion() { //image pion
		return this.imageWhitePion;
	}
	public ImageIcon getBlackPion() { //image pion
		return this.imageBlackPion;
	}
	public ImageIcon getBlackTour() { //image pion
		return this.imageBlackTour;
	}
	public ImageIcon getWhiteTour() { //image pion
		return this.imageWhiteTour;
	}
	public ImageIcon getBlackFou() { //image pion
		return this.imageBlackFou;
	}
	public ImageIcon getWhiteFou() { //image pion
		return this.imageWhiteFou;
	}
	public ImageIcon getBlackCavalier() { //image pion
		return this.imageBlackCavalier;
	}
	public ImageIcon getWhiteCavalier() { //image pion
		return this.imageWhiteCavalier;
	}
	public ImageIcon getBlackRoi() { //image pion
		return this.imageBlackRoi;
	}
	public ImageIcon getWhiteRoi() { //image pion
		return this.imageWhiteRoi;
	}
	public ImageIcon getWhiteReine() { //image pion
		return this.imageWhiteReine;
	}
	public ImageIcon getBlackReine() { //image pion
		return this.imageBlackReine;
	}
	
	public static void hey() {
		System.out.println("lol");
	}
	
}
