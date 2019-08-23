package edu.eci.arem.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This class works with an architecture Client-Server.
 * This server recieves requestes from a client and responses to the client.
 * The client and server communicate through the port 35000.
 * It is a server that calculates cos, sin, and tan of a number.
 * @author Juan Camilo Velandia Botello
 */
public class EchoServerMath {
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
        String funcion = "cos";
        while ((inputLine = in .readLine()) != null) {
            if(inputLine.equals("fun:sin")){
                funcion = "sin";
                out.println("Respuesta: Funcion cambiada a sin");
            }else if(inputLine.equals("fun:cos")){
                funcion = "cos";
                out.println("Respuesta: Funcion cambiada a cos");
            }else if(inputLine.equals("fun:tan")){
                funcion = "tan";
                out.println("Respuesta: Funcion cambiada a tan");
            }else{
                try{
                    double number = Double.parseDouble(inputLine);
                    out.println("Respuesta, resultado: "+operacion(number,funcion));
                }catch(Exception e){
                }
            }
            //outputLine = "Respuesta " + inputLine;
            //out.println(outputLine);
        }
        out.close(); in .close();
        clientSocket.close();
        serverSocket.close();
    }

    static double operacion(double number,String op){
        if(op.equals("sin")){
            return Math.sin(number);
        }else if (op.equals("cos")){
            return Math.cos(number);
        }else{
            return Math.tan(number);
        }
    }

}