package com.poc;

import org.apache.log4j.Logger;

public class App {
    public static void main(String[] args) {

        //BasicConfigurator.configure();

        Logger LOGGER = Logger.getLogger(App.class);
        LOGGER.debug("Hello brave new world!");
    }
}
