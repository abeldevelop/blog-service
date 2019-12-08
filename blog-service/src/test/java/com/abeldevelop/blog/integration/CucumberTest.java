package com.abeldevelop.blog.integration;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        plugin = {
                "progress",
                "json:target/cucumber-report.json"
        },
        glue = {
                "com.abeldevelop.architecture.library.test.integration.cucumber",
                "com.abeldevelop.blog.integration"
        }
)
public class CucumberTest {

}
