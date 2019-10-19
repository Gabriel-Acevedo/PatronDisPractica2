package mastermindmvp.views.console;

import mastermindmvp.views.MessageView;
import santaTecla.utils.YesNoDialog;

public class ResumeView {
	
	public boolean RestartGame() {
		return new YesNoDialog().read(MessageView.RESUME.getMessage());
	}
}
