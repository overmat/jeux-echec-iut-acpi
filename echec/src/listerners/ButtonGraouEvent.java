package listerners;

import java.util.EventObject;

public class ButtonGraouEvent extends EventObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String result;
	
	public ButtonGraouEvent(Object source, String result) {
		super(source);
		// TODO Auto-generated constructor stub
		this.result = result;
	}

}
