package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listerners.ButtonGraouEvent;
import model.Grille;
import model.Piece;


import controller.EchecController;


public class JFramePlateauView extends EchecView implements ActionListener{
	
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
	}
	
	private void buildFrame() {
		frame = new JFrame();
		contentPane = new JPanel();
		
		ImageLabel imgChessBoard = new ImageLabel(images.getChessBoard());
		contentPane.add(imgChessBoard);
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
		
	}


}
