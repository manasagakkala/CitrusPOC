package com.tests;

import org.testng.annotations.Test;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;

import static com.consol.citrus.actions.EchoAction.Builder.echo;

@Test
public class SampleTestJavaIT extends TestNGCitrusSpringSupport {
	@CitrusTest
	public void SampleTest() {
		variable("name", "Manasa");
		run(echo("${name}"));
	}

}
