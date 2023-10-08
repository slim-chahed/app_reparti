package act1_1;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress ia = InetAddress.getByName("10.26.12.228");
			InetSocketAddress isa = new InetSocketAddress(ia,1234);
			Socket s = new Socket();
			s.connect(isa);
			//Socket s = new Socket("localhost",1234);
			System.out.println("je suis un clinet ");
			InputStream is = s.getInputStream();
			OutputStream as = s.getOutputStream();
			
			Scanner sc = new Scanner(System.in);
			//1
			int nb = sc.nextInt();
			//2
			as.write(nb);
			//6
			int rep = is.read();
			System.out.println("la valler"+nb+"*5 = "+rep);
			System.out.println("deconnection");

			s.close();
		
			} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
