package interfaces;

import models.Action;

public interface IAutomate {
	public void Perform(Action action);
	public Action Record();
}
