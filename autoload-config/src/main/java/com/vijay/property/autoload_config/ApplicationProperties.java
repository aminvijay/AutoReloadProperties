package com.vijay.property.autoload_config;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;

public class ApplicationProperties {

	private static PropertiesConfiguration configuration = null;
	 
    static
    {
        try {
            configuration = new PropertiesConfiguration("config.properties");
 
            configuration.setReloadingStrategy(new FileChangedReloadingStrategy());
 
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }
 
    public static synchronized String getProperty(final String key)
    {
        return (String)configuration.getProperty(key);
    }
}
