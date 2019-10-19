/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermindmvp.models;

/**
 *
 * @author Gabri
 */
class State {
    
    	private StateValue stateValue;
	
	public State() {
		this.stateValue = StateValue.INITIAL;
	}

	public void next() {
		this.stateValue = StateValue.values()[this.stateValue.ordinal()+1];
	}

	public void reset() {
		this.stateValue = StateValue.INITIAL;
	}

	public StateValue getValue() {
		return this.stateValue;
	}
    
}
