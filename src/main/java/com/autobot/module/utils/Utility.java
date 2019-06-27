package com.autobot.module.utils;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class Utility {

    static EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

    public static String getConfig(String key) {
        return EnvironmentSpecificConfiguration.from(variables).getProperty(key);
    }

    public static String getProperty(String key) {
        return variables.getProperty(key);
    }

}
