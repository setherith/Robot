package automate;

import java.awt.AWTException;
import java.awt.Robot;

import interfaces.IAutomate;
import models.Action;

public class Automate implements IAutomate {

	public void Perform(Action action) {
		// TODO Auto-generated method stub
		
		try {
			Robot roberto = new Robot();
			roberto.mouseMove(10, 10);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Action Record() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
