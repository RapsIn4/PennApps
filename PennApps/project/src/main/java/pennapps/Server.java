
import java.io.IOException;
 
import java.io.ObjectInputStream;
 
import java.io.ObjectOutputStream;
 
import java.net.ServerSocket;
 
import java.net.Socket;
 
public class Server {
 
private ServerSocket socket;
 
public Server(int port) throws IOException{
 
socket=new ServerSocket(port);
 
}
 
public void start() throws IOException, ClassNotFoundException{
 	try {
		while(true){
		 
			Socket client=socket.accept();
			ObjectInputStream in=new ObjectInputStream(client.getInputStream());
			ObjectOutputStream out=new ObjectOutputStream(client.getOutputStream());
			String input=(String) in.readObject();
			System.out.println("Client says : "+input);
			out.writeObject("U sent me a message dnt send any more!");
			out.flush();
			in.close();
			out.close();
			client.close();
		 
		}
	} catch (IOException ex) {
		System.out.println("Issues");
	}
}
 
public static void main(String[] args){
 
	try {
	 
	Server s=new Server(6666);
	 
		try {
		 
			s.start();
		 
		} catch (ClassNotFoundException e) {
		 
		// TODO Auto-generated catch block
		 
			e.printStackTrace();
		 
		}
		 
		} catch (IOException e) {
		 
		// TODO Auto-generated catch block
		 
			e.printStackTrace();
		 
		}
	 
	}
 
}