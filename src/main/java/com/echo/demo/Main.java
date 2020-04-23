package com.echo.demo;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;



public class Main {

    public static void main(String[] args) throws Exception {

        Spread report = new Spread();
        registerWithJmxAgent(report);
        startConsoleApp();
    }

    private static void startConsoleApp() {

            System.out.println("Hello JMX" );

    }


    private static void registerWithJmxAgent(Spread report) throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.echo.demo:type=spread");
        mbs.registerMBean(report, name);
        Spread spread= new Spread();
        spread.printUserInfo();
    }


}