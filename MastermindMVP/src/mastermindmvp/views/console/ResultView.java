package mastermindmvp.views.console;

import mastermindmvp.views.MessageView;
import santaTecla.utils.WithConsoleView;

class ResultView extends WithConsoleView {

    public ResultView() {	}

    public void writeln(int blacks,int whites) {
	this.console.writeln(MessageView.RESULT.getMessage().replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
	}
}
