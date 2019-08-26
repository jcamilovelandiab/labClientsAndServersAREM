package edu.eci.arem.datagrams;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.SocketTimeoutException;

/**
 * This class works with an architecture Client-Server.
 * This client sends requestes to a server and recieves responses from the server.
 * The client and server communicate through the port 45000.
 * @author Juan Camilo Velandia Botello
 */
public class DatagramTimeClient {
    public static void main(String[] args) throws InterruptedException {
        String received = "";
        while(true){
            byte[] sendBuf = new byte[256];
            try {
                DatagramSocket socket = new DatagramSocket();
                byte[] buf = new byte[256];
                InetAddress address = InetAddress.getByName("127.0.0.1");
                DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 45000);
                socket.send(packet);

                packet = new DatagramPacket(buf, buf.length);
                socket.setSoTimeout(5000);
                socket.receive(packet);
                received = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Date: " + received);
                Thread.sleep(5000);
            }catch (SocketTimeoutException ex){
                System.out.println("Last date: " + received);
            } catch (SocketException ex) {
                Logger.getLogger(DatagramTimeClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnknownHostException ex) {
                ex.printStackTrace();
                Logger.getLogger(DatagramTimeClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                ex.printStackTrace();
                Logger.getLogger(DatagramTimeClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}