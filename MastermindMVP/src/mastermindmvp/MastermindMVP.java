/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermindmvp;

import java.util.HashMap;
import java.util.Map;
import mastermindmvp.controllers.Controller;
import mastermindmvp.controllers.ProposalController;
import mastermindmvp.controllers.ResumeController;
import mastermindmvp.controllers.StartController;
import mastermindmvp.models.Session;
import mastermindmvp.models.StateValue;


public abstract class MastermindMVP {

    	private Session session;
        
        Map<StateValue, Controller> controller;

	protected MastermindMVP() {
		this.session = new Session();
		this.controller = new HashMap<>();
		controller.put(StateValue.INITIAL, new StartController(session));
		controller.put(StateValue.IN_GAME, new ProposalController(session));
		controller.put(StateValue.FINAL, new ResumeController(session));
		controller.put(StateValue.EXIT, null);
	}
        
        protected void play() {
		Controller controller;
		do {
			controller = this.controller.get(this.session.getStateValue());
			if (controller != null){
				controller.control();
			}
		} while (controller != null);
	}

}
