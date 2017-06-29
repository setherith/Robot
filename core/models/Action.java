package models;

import enums.Verb;
import interfaces.IAction;
import javafx.util.Pair;

public class Action implements IAction {
	
	private Verb verb;
	private int value;
	
	public Action() {
		verb = Verb.NOTHING;
		value = 0;
	}
	
	public Action(String message) {
		Pair<Verb, Integer> result = Parse(message);
		verb = result.getKey();
		value = result.getValue();
	}

	public Verb GetVerb() {
		return verb;
	}

	public Pair<Verb, Integer> Parse(String message) {
		
		Verb verb = null;
		String tempVerb = "";
		String tempValue = "";
		
		for(char c : message.toCharArray()) {
			if (Character.isDigit(c)) {
				tempValue += c;
			} else {
				tempVerb += c;
			}
		}
		
		/* A-CODE
		 * K122 = Keyboard ASCII Code 122
		 * W100 = Wait 100 milliseconds
		 * S0 = Stop
		 * MX150 = Move Mouse to X -> 150
		 * MY150 = Move Mouse to Y -> 150
		 * ML0 = Mouse Left Click
		 * MR0 = Mouse Right Click 
		 */
		
		switch (tempVerb) {
		case "K":
			verb = Verb.KEYPRESS;
			break;
		case "W":
			verb = Verb.WAIT;
			break;
		case "S":
			verb = Verb.STOP;
			break;
		case "MX":
			verb = Verb.MOUSEX;
			break;
		case "MY":
			verb = Verb.MOUSEX;
			break;
		case "ML":
			verb = Verb.MOUSECLICK;
			break;
		case "MR":
			verb = Verb.MOUSEALTCLICK;
			break;
		default:
			verb = Verb.UNKNOWN;
		}
		
		int value = tempValue == "" ? 0 : Integer.parseInt(tempValue);
		return new Pair<Verb, Integer>(verb, value);
	}

	public int GetValue() {
		return value;
	}
	
	public void ToString() {
		System.out.println(String.format("Verb: %s\nValue: %s", GetVerb(), GetValue()));
	}
}
