package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


import controller.EchecController;


public class JFramePlateauView extends EchecView implements ActionListener{
	
	private JFrame frame = null;
	private JPanel contentPane = null;
	
	public JFramePlateauView(EchecController controller) {
		super(controller);
		// TODO Auto-generated constructor stub
		this.buildFrame();
	}
	
	private void buildFrame() {
		frame = new JFrame();
		contentPane = new JPanel();
		
		JButton  button = new JButton("Graou");
		button.setLocation(0, 0);
		button.addActionListener(this);
		contentPane.add(button);
		
		frame.setContentPane(contentPane);
		frame.setTitle("Echec de la mort qui tue et retue");
		frame.setSize(800,600);
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
		// TODO Auto-generated method stub
		System.out.println("Click bouton :D");
		
	}

}
