package com.mavenProjekt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void retrieveSomethingsTest() {
		App app = new App();
		assertEquals("Dummy", app.retrieveSomethings());
	}

}
