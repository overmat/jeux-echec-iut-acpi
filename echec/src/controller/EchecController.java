package controller;
import view.EchecView;
import view.JFramePlateauView;
import model.EchecModel;


public class EchecController {
	public EchecView plateauView = null;
	
	private EchecModel model = null;
	
	public EchecController(EchecModel model) {
		this.model = model;
		
		this.plateauView = new JFramePlateauView(this, model.getGrille());
		
		addListenersToModel();
	}
	
	public void displayViews(){
		plateauView.display();
	}
	
	
	public void closeViews(){
		plateauView.close();
	}
	
	private void addListenersToModel() {
		model.addButtonGraouListener(this.plateauView);
	}
	
	public void notifyButtonGraou(){
		model.buttonGraou();
	}
}
