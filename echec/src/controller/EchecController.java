package controller;
import view.EchecView;
import view.JFramePlateauView;
import model.EchecModel;


public class EchecController {
	public EchecView plateauView = null;
	
	private EchecModel model = null;
	
	public EchecController(EchecModel model) {
		this.model = model;
		
		this.plateauView = new JFramePlateauView(this, model.getGrille().getPieces());
		
		addListenersToModel();
	}
	
	public void displayViews(){
		plateauView.display();
	}
	
	public EchecModel getModel() {
		return model;
	}
	
	public void closeViews(){
		plateauView.close();
	}
	
	private void addListenersToModel() {
		model.addMouvementListener(this.plateauView);
	}
	
	public void notifyMvtPiece(int dx,int  dy, int sx, int sy){
		
		model.tryToMove(dx, dy, sx, sy);
	}
}
