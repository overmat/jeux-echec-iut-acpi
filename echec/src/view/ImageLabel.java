package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageLabel extends JLabel{
	private ImageIcon img;


    public ImageLabel(ImageIcon img) {
    		this.img = img;
    		this.setIcon(this.img);
    }
    
}
