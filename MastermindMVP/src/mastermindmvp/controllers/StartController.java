package mastermindmvp.controllers;

import mastermindmvp.models.Session;
import mastermindmvp.views.console.SecretCombinationView;
import mastermindmvp.views.console.StartView;

public class StartController extends Controller {

	public StartController(Session session) {
		super(session);
	}
	public void control(){
		new StartView().writeTitle();
		new SecretCombinationView().writeln(this.session.getGameWidth());
		session.next();
	}

}
