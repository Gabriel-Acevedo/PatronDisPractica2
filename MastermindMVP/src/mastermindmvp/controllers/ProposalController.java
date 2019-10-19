package mastermindmvp.controllers;

import java.util.ArrayList;
import java.util.List;

import mastermindmvp.models.Combination;
import mastermindmvp.models.Session;
import mastermindmvp.types.Color;
import mastermindmvp.types.Error;
import mastermindmvp.views.ColorView;
import mastermindmvp.views.MessageView;
import mastermindmvp.views.console.ErrorView;
import mastermindmvp.views.console.GameView;
import mastermindmvp.views.console.ProposedCombinationView;

public class ProposalController extends Controller {

        private ProposedCombinationView proposedCombinationView;
    
	public ProposalController(Session session) {
		super(session);
                this.proposedCombinationView=new ProposedCombinationView();
	}

	public Error addProposedCombination(List<Color> colors) {
		Error error = null;
		if (colors.size() != Combination.getWidth()) {
			error = Error.WRONG_LENGTH;
		} else {
			for (int i = 0; i < colors.size(); i++) {
				if (colors.get(i) == null) {
					error = Error.WRONG_CHARACTERS;
				} else {
					for (int j = i+1; j < colors.size(); j++) {
						if (colors.get(i) == colors.get(j)) {
							error = Error.DUPLICATED;
						}
					}
				}				
			}
		}
		if (error == null){
			this.session.addProposedCombination(colors);
		}
		return error;	
	}

	public boolean isWinner() {
		return this.session.isWinner();
	}

	public boolean isLooser() {
		return this.session.isLooser();
	}
	
	public int getAttempts() {
		return this.session.getAttempts();
	}

	public List<Color> getColors(int position) {
		return this.session.getColors(position);
	}

	public int getBlacks(int position) {
		return this.session.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.session.getWhites(position);
	}

    @Override
    public void control(){
		Error error;
		do {
			String characters = this.proposedCombinationView.read();
			List<Color> colors = new ArrayList<Color>();
			for (int i=0; i<characters.length(); i++) {
				colors.add(ColorView.getInstance(characters.charAt(i)));
			}
			error = this.addProposedCombination(colors);
			if (error != null) {
				new ErrorView(error).writeln();
			}
		} while (error != null);
		this.proposedCombinationView.writeln();
		new GameView().writeGame(this.session);
		this.isFinished();
	}
    
    private void isFinished(){
		if (this.session.isWinner()) {
			this.proposedCombinationView.writeln(MessageView.WINNER.getMessage());
			this.session.next();
		} else if (this.session.isLooser()) {
			this.proposedCombinationView.writeln(MessageView.LOOSER.getMessage());
			this.session.next();
		}
	}
    
    }
