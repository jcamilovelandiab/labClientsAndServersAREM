package edu.eci.arem.url;

import java.io.*;
import java.net.*;

/**
*	This class has a main method that reads a url (website).
*	A URL object is created and all its methods such as protocol, authority, host, port, path, query, file, and reference are displayed.
*	@author Juan Camilo Velandia Botello
*/
public class exerciseOne 
{
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://github.com/jcamilovelandiab");
		System.out.println("Protocolo : "+ url.getProtocol());
		System.out.println("Authority : "+ url.getAuthority());
		System.out.println("Host : "+ url.getHost());
		System.out.println("Port : "+ url.getPort());
		System.out.println("Path : "+ url.getPath());
		System.out.println("Query : "+ url.getQuery());
		System.out.println("File : "+ url.getFile());
		System.out.println("Reference : "+ url.getRef());
	}
}
