package com.vijay.property.autoload_config;

public class App 
{
    public static void main( String[] args )
    {
        
        while(true)
        {
            
            System.out.println("------->" + ApplicationProperties.getProperty("myname"));
        }
    }
}
