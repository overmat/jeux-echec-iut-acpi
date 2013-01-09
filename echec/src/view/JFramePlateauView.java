package view;
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
import java.lang.reflect.InvocationTargetException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import listerners.ButtonGraouEvent;
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
	
	public JFramePlateauView(EchecController controller, Case[][] pieces) {
		super(controller);
		// TODO Auto-generated constructor stub
		this.controller = controller;
		this.m_pieces = pieces;
		this.images = new LoadImages();
		
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
		ImageLabel imgChessBoard = new ImageLabel(images.getChessBoard(), 0, 0, 640, 640);
		contentPane.add(imgChessBoard);
		
		java.lang.reflect.Method method = null;
		String tmp_methodName;
		ImageLabel tmp_imgPiece;
		// affichage des pieces
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(m_pieces[i][j].hasPiece()) {

					Piece piece = m_pieces[i][j].getPiece();
					tmp_methodName = "get"+piece.getColor()+piece.getClass().getSimpleName().toString();

					try {
						method = images.getClass().getMethod(tmp_methodName);
					} catch (NoSuchMethodException e) {
						  System.out.println("MŽthode inexistante : "+tmp_methodName);
					}
				
					tmp_imgPiece = new ImageLabel((ImageIcon)method.invoke(images),40+(70*j),(70*i)+40, 70, 70);
					//tmp_imgPiece.addMouseMotionListener(this);
					contentPane.add(tmp_imgPiece,0);
					
					DragSource ds = new DragSource();
					ds.createDefaultDragGestureRecognizer(tmp_imgPiece,
							DnDConstants.ACTION_COPY, new DragGestureImpl());
				}
			}
		}
		
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
		this.controller.notifyButtonGraou();
		
	}

	@Override
	public void resultButtonGraou(ButtonGraouEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.result);
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
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent me) {
		PointerInfo pointer = MouseInfo.getPointerInfo();
		Point location = pointer.getLocation();
		
		if(me.getX() > 0 && me.getX() < 800 && me.getY() > 0 && me.getY() < 675) {
		// TODO Auto-generated method stub
		ImageLabel c = (ImageLabel)me.getComponent();
		// TODO Auto-generated method stub
		//if(avancerBlock==null) return;
		c.setLocation(me.getX()+c.getX()-25, me.getY()+c.getY()-25);
		contentPane.add(c,0);
		}
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}

