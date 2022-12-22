package com.amazon.stepdefenition;

import com.amazon.resources.commonActions;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends commonActions {
	
	commonActions co = new commonActions();
	@Before
	public void launch() {
		co.browserLaunch("https://www.amazon.in/");
	}
	@After
	public void exit() {
		co.browserClose();
	}
}
