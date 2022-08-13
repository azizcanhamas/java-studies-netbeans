package Package;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    /*
        1040 - Take port number socket 
    */
    
    Socket socket;
    DataOutputStream dataOutputStream;
    int clientPortNumber;
    
    public void login(String username){
        try{
            socket=new Socket("localhost",5547);
            dataOutputStream=new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(username);   
            getPortNumberfromServer();
            socket.close();            
        }catch(IOException e){
            System.err.println("ERROR-Login/login : "+e);
        }
    }
    
    public void getPortNumberfromServer() throws IOException{
        /*Burada thread olmamali, bir defaya mahsus sunucudan port numarasini almalidir.
          Program akisini lineer yapmasinda sorun yok.
        */
        try{
            ServerSocket serverSocket=new ServerSocket(1040);
            Socket clientSocket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
            String mesaj = dataInputStream.readUTF();
            setClientPortNumber(Integer.valueOf(mesaj));
            serverSocket.close();                            
        }catch(IOException e){
            System.out.println("ERROR-listenMessage: "+e);
        }
    }
    
    public void sendMessage(String message,int receiverPortNumber){
        try {
            socket = new Socket("localhost", receiverPortNumber);
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(message);
            socket.close();
        } catch (IOException ex) {
            System.err.println("ERROR-Login/sendMessage: "+ex);
        }            
    }
   

    public void listenMessage() throws IOException{
        /* Surekli olarak mesaj gelip gelmedigini dinlenebilmesi icin
            program akisinin bozulmamasi acisindan Thread kullanilmali
            ve sunucunun acik kalmasi icin socket kapatilmadigi muddetce while donmelidir.*/        
        Thread receiver=new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    ServerSocket serverSocket=new ServerSocket(getClientPortNumber());           
                    while(!serverSocket.isClosed()){
                        Socket clientSocket = serverSocket.accept();
                        DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
                        String mesaj = dataInputStream.readUTF();
                        System.out.println("\nAlınan mesaj: " + mesaj);            
                    }
                }catch(IOException e){
                    System.out.println("ERROR-listenMessage: "+e);
                }
            }
            
        });
        receiver.start();
    }
    
    public void setClientPortNumber(int portNumber){
        this.clientPortNumber=portNumber;
    }
    
    public int getClientPortNumber(){
        return this.clientPortNumber;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.print("Write username          :");
        String username=scan.nextLine();
        Client client=new Client();
        client.login(username);
        client.listenMessage();
        while (true) {
            System.out.print("New Message         : ");
            String message=scan.nextLine();
            System.out.print("Receiver Port Number: ");
            int receiverPortNumber=scan.nextInt();
            client.sendMessage(message,receiverPortNumber);
        }

    }
}
