/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author jakew
 */
public class ThreadClass implements Runnable {
    
    private String msg;
    private User_Model user = new User_Model();
    
    public ThreadClass(String msg, User_Model user){
        this.msg = msg;
        this.user = user;
    }

    @Override
    public void run() {
            try(Socket server = new Socket("localhost", 9090);
            ObjectInputStream inFromServer = new ObjectInputStream(server.getInputStream());
            ObjectOutputStream outToServer = new ObjectOutputStream(server.getOutputStream())){
            
            System.out.println("Connecting to core server");
            System.out.println("Connected to" + server.getInetAddress());
          
            //send to server
            outToServer.writeUTF(user.getUserName() + ": " + msg);
            outToServer.flush();
            
            outToServer.writeObject(user);
            outToServer.flush();
            
            while (!server.isClosed())
            {
                if (inFromServer.available() > 0){
                //read from server
                String data = inFromServer.readUTF();
                System.out.println("Server said: " + data);
                }
            }
    } catch (IOException e){
      e.printStackTrace();
    }
    }
}
