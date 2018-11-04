/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bc_stationary_management_system;
import bc_stationary_bll.Communication;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tanya
 */
public class ClientHandler<T> {
    public Communication comm;

    public ClientHandler(Communication comm) {
        this.comm = comm;
    }
    
    public Communication request(){
        try {
            Socket s = new Socket("localhost",5000);
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            oos.writeObject(comm);
            
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            Communication result = (Communication)ois.readObject();
            return result;
        } catch (IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
