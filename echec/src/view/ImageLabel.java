package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageLabel extends JLabel{
	private ImageIcon img;

	private int posY, posX, xt, yt,w,h;
    public ImageLabel(ImageIcon img, int posX, int posY, int w, int h,int x, int y) {
    		this.img = img;
    		this.setIcon(this.img);
    		this.setBounds(posX, posY, w, h);
    		
    		this.posX = posX;
    		this.posY = posY;
    		this.xt = x;
    		this.yt = y;
    		this.w = w;
    		this.h = h;
  
    }
    
    public int getXt() {
    	return xt;
    }
    
    public int getYt() {
    	return yt;
    }
    
    public void setImg(ImageIcon img) {
    	this.img = img;
		this.setIcon(this.img);
    }
    
    public int getPosX() {
    	return posX;
    }
    public int getPosY() {
    	return posY;
    }
    
    public boolean estDedans(int x, int y) {
    	if(x >= posX && x<= posX + w && y>= posY && y<= posY + h)
    		return true;
    	else
    		return false;
    }
}
