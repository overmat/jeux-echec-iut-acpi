package view;
import listerners.MovementListener;
import controller.EchecController;


public abstract class EchecView implements MovementListener{
	private EchecController controller = null;
	
	public EchecView(EchecController controller){
		super();
		
		this.controller = controller;
	}
	
	public final EchecController getController(){
		return controller;
	}
	
	public abstract void display();
	public abstract void close();
}
