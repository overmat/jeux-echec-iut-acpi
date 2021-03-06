package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageLabel extends JLabel{
	private ImageIcon img;

	private int posY, posX,w,h;
	private int startx, starty;
	
    public ImageLabel(ImageIcon img, int posX, int posY, int w, int h) {
    		this.img = img;
    		this.setIcon(this.img);
    		
    		this.setBounds(posX, posY, w, h);
    		
    		this.posX = posX;
    		this.posY = posY;
    		this.w =w;
    		this.h =h;
    }
    
    public void setPosY() {
    	posY += 70;
    	this.setBounds(posX, posY, w, h);
    }
    
    public ImageIcon getImg() {
    	return img;
    }
    
    public void setStartX(int x ) {
    	this.startx = x;
    }
    public void setStartY(int y ) {
    	this.starty = y; // piou piou
    }
    
    public int getStartX() {
    	return startx;
    }
    public int getStartY() {
    	return starty;
    }
}
