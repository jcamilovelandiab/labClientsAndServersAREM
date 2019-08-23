package edu.eci.arem.sockets;

import java.net.*;
import java.io.*;


/**
 * This class works with an architecture Client-Server.
 * This server recieves requestes what are numbers from a client and responses to the client the square number.
 * The client and server communicate through the port 35000.
 * @author Juan Camilo Velandia Botello
 */
public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String inputLine, outputLine;
        while ((inputLine = in .readLine()) != null) {
            System.out.println("Mensaje: "+inputLine);
            int number = Integer.parseInt(inputLine);
            number *= number;
            outputLine = "Respuesta: " + Integer.toString(number);
            
            out.println(outputLine);
            if (outputLine.equals("Respuestas: Bye.")) break;
        }
        out.close(); in.close();
        clientSocket.close();
        serverSocket.close();
    }

}
