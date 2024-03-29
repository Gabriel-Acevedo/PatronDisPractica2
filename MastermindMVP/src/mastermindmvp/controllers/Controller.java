package mastermindmvp.controllers;

import mastermindmvp.models.Combination;
import mastermindmvp.models.Session;

public abstract class Controller {

	protected Session session;
        
	Controller(Session session) {
		this.session = session;
	}

        public int getWidth() {
		return Combination.getWidth();
	}

        public abstract void control();
        
}
