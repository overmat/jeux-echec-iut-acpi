package listerners;

import java.util.EventListener;


public interface MovementListener extends EventListener {
	public void resultMovement(MovementEvent movementEvent);
}
