package mastermindmvp.views.console;

import santaTecla.utils.WithConsoleView;
import mastermindmvp.views.MessageView;

public class ProposedCombinationView extends WithConsoleView {
	
	public ProposedCombinationView() { }

	public String read() {
		return (this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage()));
	}

	public void writeln(){
		this.console.writeln();
	}

	public void writeln(String message){
		this.console.writeln(message);
	}
	
}
