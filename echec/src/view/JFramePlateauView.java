package view;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragSource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;


import listerners.MovementEvent;
import model.Case;
import model.Grille;
import model.Piece;
import view.LoadImages;

import javax.swing.SwingUtilities;




import controller.EchecController;


public class JFramePlateauView extends EchecView implements ActionListener, MouseListener, MouseMotionListener{

	private JFrame frame = null;
	private JPanel contentPane = null;
	
	private EchecController controller = null;
	private LoadImages images = null;
	private Case[][] m_pieces = null;
	private ImageLabel[][] tabImg;
	private ImageLabel draggedElement;
	
	public JFramePlateauView(EchecController controller, Case[][] pieces) {
		super(controller);
		// TODO Auto-generated constructor stub
		this.controller = controller;
		this.m_pieces = pieces;
		this.images = new LoadImages();
		tabImg = new ImageLabel[8][10];
		this.buildFrame();
		try {
			this.buildChessBoard();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void buildFrame() {
		frame = new JFrame();
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		
		frame.setContentPane(contentPane);
		frame.setTitle("Echec de la mort qui tue et retue");
		frame.setSize(800,675);
		frame.setResizable(false);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
	}

	public void buildChessBoard() throws IllegalAccessException, InvocationTargetException {
		// mise en place du damier
		ImageLabel imgChessBoard = new ImageLabel(images.getChessBoard(), 0, 0, 780, 640);
		contentPane.add(imgChessBoard);
		
		java.lang.reflect.Method method = null;
		String tmp_methodName;
		ImageLabel tmp_imgPiece;
		// affichage des pieces
		for(int i=0;i<8;i++) {
			for(int j=0;j<10;j++) {
				if(m_pieces[i][j].hasPiece()) {

					Piece piece = m_pieces[i][j].getPiece();
					tmp_methodName = "get"+piece.getColor()+piece.getClass().getSimpleName().toString();

					try {
						method = images.getClass().getMethod(tmp_methodName);
					} catch (NoSuchMethodException e) {
						  System.out.println("MŽthode inexistante : "+tmp_methodName);
					}
					
					tmp_imgPiece = new ImageLabel((ImageIcon)method.invoke(images),40+(70*j),(70*i)+40, 70, 70);
					tabImg[i][j] = tmp_imgPiece;
					tmp_imgPiece.addMouseListener(this);
					tmp_imgPiece.addMouseMotionListener(this);
					contentPane.add(tmp_imgPiece,0);
					
				}
			}
		}
		
	}
	
	@Override
	public void mouseReleased(MouseEvent me) {
		// TODO Auto-generated method stub
		draggedElement = (ImageLabel)me.getComponent();
		controller.notifyMvtPiece(draggedElement.getY() / 70,draggedElement.getX()/70,draggedElement.getStartY() / 70, draggedElement.getStartX() / 70 );
		
	}

	@Override
	public void mouseDragged(MouseEvent me) {
		
		if(me.getX() > 0 && me.getX() < 800 && me.getY() > 0 && me.getY() < 675) {
		// TODO Auto-generated method stub
		ImageLabel c = (ImageLabel)me.getComponent();
		// TODO Auto-generated method stub
		//if(avancerBlock==null) return;
		c.setLocation(me.getX()+c.getX()-35, me.getY()+c.getY()-35);
		
		contentPane.add(c,0);
		}
	}
	
	@Override
	public void resultMovement(MovementEvent event) {
		File son;
		if(event.eat) {
			contentPane.remove(tabImg[event.destLigne][event.destColonne]);
		}
		if(event.canMove) {
			draggedElement.setLocation(40+(70*event.destColonne), 40+ event.destLigne*70);
			tabImg[event.destLigne][event.destColonne] = draggedElement;	
		} else {
			draggedElement.setLocation(40+(70*event.startColonne), 40+ event.startLigne*70);
		}
		
		
		if (!event.canMove)
		{
			son = new File("./sounds/stupide.wav");
		}
		else if(event.canMove && !event.eat)
		{
			son = new File("./sounds/pioupiou.wav");
		} else {
			son = new File("./sounds/miammiam.wav");
		}
		AudioClip clip = null;
		try
		{
		clip = Applet.newAudioClip(son.toURI().toURL());
		}
		catch (MalformedURLException e)
		{
		System.out.println(e.getMessage());
		}
		clip.play();
		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		frame.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		ImageLabel c = (ImageLabel)e.getComponent();
	
		c.setStartX(c.getX());
		c.setStartY(c.getY());
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}

