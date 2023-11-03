package Client;
import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  

        try {
        	//creation de l objet socket cote client
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Connected");
            socket.close();
        } catch (IOException e) {

            e.getMessage();
        }

    }

}