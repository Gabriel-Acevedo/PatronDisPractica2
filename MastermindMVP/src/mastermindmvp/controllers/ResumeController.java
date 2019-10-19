package mastermindmvp.controllers;


import mastermindmvp.models.Session;
import mastermindmvp.views.console.ResumeView;

public class ResumeController extends Controller {

	public ResumeController(Session session) {
		super(session);
	}

        @Override
	public void control() {
		if (new ResumeView().RestartGame()) {
			this.session.resume();
		}
		this.session.next();
	}

}
