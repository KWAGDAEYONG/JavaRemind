package network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by user on 2017-03-30.
 */
public class ServerExample {
    public static void main(String[]args){
        ServerSocket serverSocket = null;
        try{
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost",5001));
            while (true){
                System.out.println("[연결 대기중]");
                Socket socket = serverSocket.accept();
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 수락]"+isa.getHostName());
            }
        }catch (Exception e){

        }

        if(!serverSocket.isClosed()){
            try{
                serverSocket.close();
            }catch (IOException e1){

            }
        }
    }
}
