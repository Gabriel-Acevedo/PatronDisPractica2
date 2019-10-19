package mastermindmvp;

import mastermindmvp.models.Session;


public class ConsoleMastermind extends MastermindMVP {

        Session session;

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

}
