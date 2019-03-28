package com.flocondria.greet;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Greeting implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("The bundle is starting");
        greet();
        //throw new Exception("Failing load plugin");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("The bundle is stopping");
    }

    public void greet() {
        System.out.println("Greetinnnnnnnnnnnng !!! yato");
    }
}
