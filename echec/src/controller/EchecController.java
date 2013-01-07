package controller;
import view.EchecView;
import view.JFramePlateauView;
import model.EchecModel;


public class EchecController {
	public EchecView plateauView = null;
	
	private EchecModel model = null;
	
	public EchecController(EchecModel model) {
		this.model = model;
		
		this.plateauView = new JFramePlateauView(this);
		
	}
	
	public void displayViews(){
		plateauView.display();
	}
	
	
	public void closeViews(){
		plateauView.close();
	}
}
