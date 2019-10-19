package mastermindmvp.views.console;

import mastermindmvp.types.Error;
import santaTecla.utils.Console;

public class ErrorView extends mastermindmvp.views.ErrorView {

	public ErrorView(Error error) {
		super(error);
	}
	
	public void writeln() {
		new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}	

}
