package automate;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
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
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Point mouse = MouseInfo.getPointerInfo().getLocation();
		Action result = new Action("MX" + String.valueOf(mouse.getX()));
		return result;
	}
	
}
