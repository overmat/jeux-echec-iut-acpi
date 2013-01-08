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
    		this.w =w;
    		this.h =h;
    }
    
    public void setPosY() {
    	posY += 70;
    	this.setBounds(posX, posY, w, h);
    }
    
}
