package Package;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    
    ArrayList<ArrayList<Object>> clients = new ArrayList<>();
    int lastPortNumber=1459;
    
    ServerSocket serverCreateUserSocket;
    String message;
    
    /*
        5547 -> Login socket.
    */
    
    public Server(){
        try {
            System.out.println("LOG: Server created.");
            serverCreateUserSocket=new ServerSocket(5547);
            runCreateUserServer();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void runCreateUserServer(){             
        Thread createUserThread=new Thread(new Runnable(){
            @Override
            public void run(){
                while(!serverCreateUserSocket.isClosed()){
                    try {
                        System.out.println("LOG: Server running.");
                        Socket clientSocket=serverCreateUserSocket.accept();
                        DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
                        String message = dataInputStream.readUTF();
                        createUser(message);
                        System.out.println(message+" is joined!"); 
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        createUserThread.start();  
    }
    
    public void createUser(String username){
        System.out.println(username+" named user created!");
        lastPortNumber+=1;
        ArrayList<Object> tmpList=new ArrayList<>();
        tmpList.add(username);
        tmpList.add(lastPortNumber);
        clients.add(tmpList);
        sendPortNumber();        
    }
    
    public void sendPortNumber(){
        try {
            Socket socket = new Socket("localhost", 1040);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(String.valueOf(lastPortNumber));
            socket.close();
        } catch (IOException ex) {
            System.err.println("ERROR-Server/sendPortNumber: "+ex);
        }            
    }

    //Sunucunun calisir hale gelebilmesi icin main metodu olmalidir.
    public static void main(String[] args) {        
        Server server=new Server();
    }
}

// THREAD YAPISI
        /*Thread connectThread=new Thread(new Runnable(){
            @Override
            public void run(){
                
            }
        });
        connectThread.start();*/
