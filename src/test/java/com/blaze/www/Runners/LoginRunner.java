package com.blaze.www.Runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Login.feature",
        glue = "com.blaze.www.StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginRunner {

}
