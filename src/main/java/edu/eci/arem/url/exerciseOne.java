package edu.eci.arem.url;

import java.io.*;
import java.net.*;

/**
 * @author Juan Camilo Velandia Botello
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
