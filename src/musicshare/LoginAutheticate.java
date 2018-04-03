/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicshare;

/**
 *
 * Okay so this bit of code is super basic and basically says if you login in locally using "admin" and "password" you should be granted access.
 * This code can be moved to activate inside a button call.
 * What I think we need to do is create a notes file somewhere. But have only the server access it.
 * Then we get the client to contact the server. Pass through the user input captured by the client. The server takes the input checks it against the note file.
 * If the note file has a matching username and password send back a message to the client that you can access the content of the next page.
 */
public class LoginAutheticate {
    try{
        String username=jTextField1.getText();
        char[] pass=jPasswordField1.getPassword();
        String password = new String(pass);
        if (username.equals("admin")&&password.equals("password")){
            JOptionPane.showMessageDialog(null,"Valid User");
        }
        else
            JOptionPane.showMessageDialog(null,"Invalid User");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
    }
}
