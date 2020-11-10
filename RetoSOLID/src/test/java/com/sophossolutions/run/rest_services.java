package com.sophossolutions.run;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = { "com.sophossolutions.stepdefinitions" },
        plugin = {"pretty"},
        features = {
                "src/test/resources/features/casos.feature"
        },
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)

public class rest_services {

    public static void main(String[] args) {

    }

}
