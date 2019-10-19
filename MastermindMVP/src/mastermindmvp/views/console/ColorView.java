package mastermindmvp.views.console;

import mastermindmvp.types.Color;
import santaTecla.utils.Console;

class ColorView extends mastermindmvp.views.ColorView {

	ColorView(Color color) {
		super(color);
	}
	
	void write() {
		new Console().write(ColorView.INITIALS[this.color.ordinal()]);
	}

}
