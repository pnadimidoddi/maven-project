package com.mulesoft.training;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
    	System.out.println("before runnig the application");
        runFlowAndExpect("mavenFlow", "Hello Maven ");
        System.out.println("after runnig the application");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}
