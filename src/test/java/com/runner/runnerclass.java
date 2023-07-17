package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.helper.Filereadermanager;

import Greens.cucuproj2.TBasefunctions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/com/featurefile"
		,glue="com/stepdefinition",
		monochrome=true,
		stepNotifications = true,
		dryRun = !true,
		snippets = SnippetType.CAMELCASE,
		publish=true)

public class runnerclass extends TBasefunctions {
	public static WebDriver driver;
	@BeforeClass
	public static void launch() throws IOException {
		String browsername = Filereadermanager.getInstance().getcrinstance().browsername();
		driver=TBasefunctions.browserlauncher(browsername);
		implicitwait(20);

	}
	@AfterClass
	public static void teardown()
	{
		driver.quit();
	}
	
}


