package act1_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


 

public class Serveur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss= new ServerSocket(1234);
			System.out.println("je suis un serveur j attend un client ");
			Socket s = ss.accept();
			System.out.println("un clinet est connect");
			InputStream is = s.getInputStream();
			OutputStream as = s.getOutputStream();
			//3
			int nb = is.read();
			//4
			int rep = nb*5;
			//5
			as.write(rep);
			System.out.println("deconnection");
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}