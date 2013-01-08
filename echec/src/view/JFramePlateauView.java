package view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listerners.ButtonGraouEvent;
import model.Grille;
import model.Piece;


import controller.EchecController;


public class JFramePlateauView extends EchecView implements ActionListener, MouseListener, MouseMotionListener{
	
	private JFrame frame = null;
	private JPanel contentPane = null;
	private EchecController controller = null;
	private LoadImages images = null;
	private Piece[][] m_listPieces = null;
	public JFramePlateauView(EchecController controller, Grille grille) {
		super(controller);
		// TODO Auto-generated constructor stub
		this.controller = controller;
		
		this.images = new LoadImages();
		m_listPieces = grille.getPieces();
		this.buildFrame();
		this.initPieces();
	}
	
	private void buildFrame() {
		frame = new JFrame();
		contentPane = new JPanel();
		frame.setLayout(null);
		ImageLabel imgChessBoard = new ImageLabel(images.getChessBoard(), 0, 0, 640, 640, 0,0);
		contentPane.add(imgChessBoard);
		contentPane.setLayout(null);
		frame.setContentPane(contentPane);
		frame.setTitle("Echec de la mort qui tue et retue");
		frame.setSize(800,675);
		frame.setResizable(false);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
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
	
	public void initPieces() {
		for(int j=0;j<8;j++) {
			ImageLabel imgPion = new ImageLabel(images.getWhitePion(),40+(70*j),(70*6)+40, 70, 70,6,j);
			contentPane.add(imgPion,0);
			imgPion = new ImageLabel(images.getBlackPion(),40+(70*j),(70*1)+40, 70, 70,1,j);
			imgPion.addMouseMotionListener(new MouseMotionListener() {

				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					ImageLabel c = (ImageLabel)e.getComponent();
				
					// TODO Auto-generated method stub
					//if(avancerBlock==null) return;
					c.setLocation(e.getX()+c.getX()-25, e.getY()+c.getY()-25);
					contentPane.add(c,0);
					frame.repaint();
				}

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			});
			contentPane.add(imgPion,0);
			imgPion.addMouseListener(new MouseAdapter()  
			{  
			    public void mouseReleased(MouseEvent e)  
			    {  
			       ImageLabel pion = (ImageLabel)e.getSource();
			    	pion.setPosY(); 
			    
			    }  
			});
			contentPane.add(imgPion,0);
			if(this.m_listPieces[0][j].getClass().getName().toString() == "model.Tour") {
				imgPion = new ImageLabel(images.getBlackTour(),40+(70*j),(70*0)+40, 70, 70,1,j);
				contentPane.add(imgPion,0);
				imgPion = new ImageLabel(images.getWhiteTour(),40+(70*j),(70*7)+40, 70, 70,1,j);
				contentPane.add(imgPion,0);
			}
			if(this.m_listPieces[0][j].getClass().getName().toString() == "model.Fou") {
				imgPion = new ImageLabel(images.getBlackFou(),40+(70*j),(70*0)+40, 70, 70,1,j);
				contentPane.add(imgPion,0);
				imgPion = new ImageLabel(images.getWhiteFou(),40+(70*j),(70*7)+40, 70, 70,1,j);
				contentPane.add(imgPion,0);
			}
			if(this.m_listPieces[0][j].getClass().getName().toString() == "model.Cavalier") {
				imgPion = new ImageLabel(images.getBlackCavalier(),40+(70*j),(70*0)+40, 70, 70,1,j);
				contentPane.add(imgPion,0);
				imgPion = new ImageLabel(images.getWhiteCavalier(),40+(70*j),(70*7)+40, 70, 70,1,j);
				contentPane.add(imgPion,0);
			}
			if(this.m_listPieces[0][j].getClass().getName().toString() == "model.Roi") {
				imgPion = new ImageLabel(images.getBlackRoi(),40+(70*j),(70*0)+40, 70, 70,1,j);
				contentPane.add(imgPion,0);
				imgPion = new ImageLabel(images.getWhiteRoi(),40+(70*j),(70*7)+40, 70, 70,1,j);
				contentPane.add(imgPion,0);
			}
			if(this.m_listPieces[0][j].getClass().getName().toString() == "model.Reine") {
				imgPion = new ImageLabel(images.getBlackReine(),40+(70*j),(70*0)+40, 70, 70,1,j);
				contentPane.add(imgPion,0);
				imgPion = new ImageLabel(images.getWhiteReine(),40+(70*j),(70*7)+40, 70, 70,1,j);
				contentPane.add(imgPion,0);
			}
			
		}
		frame.repaint();
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
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}

