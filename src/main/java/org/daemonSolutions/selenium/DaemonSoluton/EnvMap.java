package org.daemonSolutions.selenium.DaemonSoluton;

import java.util.Map;

public class EnvMap {

	public static void main(String[] args) {
        String user = System.getenv("USERNAME") ;
		String pass = System.getenv("PASSWORD");
		String host = System.getenv("HOST");
        System.out.println("Username using system property: "  + user +" "+pass + " " + host);
     

	}

}



