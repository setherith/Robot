package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import enums.Verb;
import interfaces.IAction;
import interfaces.IAutomate;
import models.Action;

public class AutomateTests {
	
	public IAutomate automate;
	public IAction action;
	
	@Before
	public void Init() {
		automate = new automate.Automate();
	}

	@Test
	public void VerbIsSetToUnknownWhenIncorrectlySet() {
		action = new Action("???");
		assertTrue(action.GetVerb() == Verb.UNKNOWN);
	}
	
	@Test
	public void VerbIsSetCorrectlyWhenSupplied() {
		action = new Action("W100");
		assertTrue(action.GetVerb() == Verb.WAIT);
	}
	
	@Test
	public void ValidVerbNoValue() {
		action = new Action("S");
		assertTrue(action.GetVerb() == Verb.STOP);
		assertTrue(action.GetValue() == 0);
	}

	@Test
	public void ValidValueNoVerb() {
		action = new Action("100");
		assertTrue(action.GetVerb() == Verb.UNKNOWN);
		assertTrue(action.GetValue() == 100);
	}
	
	@Test
	public void NoInput() {
		action = new Action();
		assertTrue(action.GetVerb() == Verb.NOTHING);
		assertTrue(action.GetValue() == 0);
	}

}
