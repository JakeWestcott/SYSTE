/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicshare;

/**
 *
 * @author jakew
 */
import java.net.*;
import java.io.*;

public class MSClient {
     public static void main(String[]args)throws IOException{
        Socket server = new Socket("localhost", 9090);
        System.out.println("Connected to" + server.getInetAddress());
            //create IO Streams
            DataInputStream inFromServer = new DataInputStream(server.getInputStream());
            DataOutputStream outToServer = new DataOutputStream(server.getOutputStream());
            //send to server
            outToServer.writeUTF("Time");
            //read from server
            String data = inFromServer.readUTF();
            System.out.println("Server said: " + data);
            server.close();
     }    
}
