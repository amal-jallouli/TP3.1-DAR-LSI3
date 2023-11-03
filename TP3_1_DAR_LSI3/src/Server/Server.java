package Server;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import ClientProcess.ClientProcess;



public class Server extends Thread {
    public static void main(String[] args) {
    	//compteur d ordre de communication du clt
        int ord = 0 ;

        try (ServerSocket socketServeur = new ServerSocket(1234)) {

            System.out.println(" Le serveur attend la connexion d'un client ");
            while(true){
            	//creation de l objet socket suite a la connexion d un client
                Socket socket = socketServeur.accept();
                System.out.println(" un client est connecte ");
                
                ClientProcess client = new ClientProcess(socket, ++ord);
                // creation d un nouveau thread
                client.start();

                socket.close();

            }
        } catch (IOException e) {
            e.getMessage();
        }

    }

}
