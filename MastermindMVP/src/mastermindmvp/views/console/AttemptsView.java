package mastermindmvp.views.console;

import mastermindmvp.views.MessageView;
import santaTecla.utils.WithConsoleView;

public class AttemptsView extends WithConsoleView {	


    AttemptsView() {}

	public void writeln(int attempts) {
		this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts",
				"" + attempts));
	}
}
