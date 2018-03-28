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
public class MSChatClient {
         public static void main(String[]args)throws IOException{
        Socket chatserver = new Socket("localhost", 9090);
        System.out.println("Connected to" + chatserver.getInetAddress());
            //create IO Streams
            DataInputStream inFromServer = new DataInputStream(chatserver.getInputStream());
            DataOutputStream outToServer = new DataOutputStream(chatserver.getOutputStream());
            //send to server
            outToServer.writeUTF("Time");
            //read from server
            String data = inFromServer.readUTF();
            System.out.println("Server said: " + data);
            chatserver.close();
     }    
    
}
