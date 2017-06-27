package interfaces;

import enums.Verb;
import javafx.util.Pair;

public interface IAction {

	Pair<Verb, Integer> Parse(String message);
	public int GetValue();
	public Verb GetVerb();
}
