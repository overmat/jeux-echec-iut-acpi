package app;
import model.EchecModel;
import controller.EchecController;


public class echecApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EchecModel model = new EchecModel();
		EchecController controller = new EchecController(model);
		controller.displayViews();
	}

}
