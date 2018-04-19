package no.ntnu.fp.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PersonTest.class,
        EcuTest.class,
        FactoryProjectTest.class,
        ProjectTest.class,
        SimpleEcuTest.class,
        SoftwareTest.class,
        VehicleTest.class
})

public class JunitTestSuite {}