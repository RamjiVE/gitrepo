package com.ram;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world d!!
 *
 */
public class App 
{
	private App(){
		
	}
	private static Logger log = Logger.getLogger(App.class.getName());
	   
    public static void main( String[] args )
    { /* this is for the demo. */
    	BasicConfigurator.configure();
        log.debug( "Hello World!" );
       
    }
}
