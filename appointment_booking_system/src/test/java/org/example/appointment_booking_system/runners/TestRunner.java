package org.example.appointment_booking_system.runners;


import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
public class TestRunner {
    // No code needed inside! JUnit 5 Suite uses the annotations above to run your BDD tests.
}