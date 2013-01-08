package view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class LoadImages {
	private ImageIcon imageGrille;
	
	public LoadImages() {
		
		try {
			BufferedImage image = ImageIO.read(new File("img/chessboard.png"));
			imageGrille  = new ImageIcon( image );
		} catch (IOException ex) {
			System.err.print("Impossible de charger l'image du de la grille");
		}
		
	}
	
	public ImageIcon getChessBoard() { //image de fond
		return this.imageGrille;
	}
	
}
