import javax.swing.JFrame;
import javax.swing.JPanel;


public class JFramePlateauView extends EchecView{
	
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
		contentPane.setLayout(null);
		
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

}
