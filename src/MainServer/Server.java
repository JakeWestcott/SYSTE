/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainServer;

/**
 *
 * @author jakew
 */
import java.net.*; import java.util.*; import java.io.*;
public class Server {
    
    public static void main(String[]args)throws IOException{
        ServerSocket server = new ServerSocket(9090);
        while(true){
            System.out.println("Waiting");
            //establish connection
            Socket client = server.accept();
            System.out.println("Connected" + client.getInetAddress());
            //create IO Streams
            DataInputStream inFromClient = new DataInputStream(client.getInputStream());
            DataOutputStream outToClient = new DataOutputStream(client.getOutputStream());
            System.out.println("Received: " +inFromClient.readUTF()); //get any data from the client
            //example
            Date date = new Date();
            System.out.println("writing to server: " + date.toString());
            outToClient.writeUTF(date.toString()); //send date to client
            outToClient.flush();
            client.close();
        }
    }
    
}

//I need start server function, accept clients function and a list of clients 