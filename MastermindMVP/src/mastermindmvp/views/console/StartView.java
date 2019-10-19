package mastermindmvp.views.console;

import mastermindmvp.views.MessageView;
import santaTecla.utils.WithConsoleView;

public class StartView extends WithConsoleView {
	
	public void writeTitle() {
		this.console.writeln(MessageView.TITLE.getMessage());
	}

}
