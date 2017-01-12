package Provider;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server{
	ServerSocket providerSocket;
	Socket connection = null;

	ObjectOutputStream out;
	ObjectInputStream in;
	Scanner input;
	String name;
	String address;
	int bankAccNcm;
	String password;
	String userName;
	
	
	Server()
	{
		input = new Scanner(System.in);
	}
	void listener()
	{
		try{
			//1. creating a server socket
			providerSocket = new ServerSocket(2010, 10);
			//2. Wait for connection
			System.out.println("Waiting for connection");
			
			connection = providerSocket.accept();
			
			System.out.println("Connection received from " + connection.getInetAddress().getHostName());
			//3. get Input and Output streams
			out = new ObjectOutputStream(connection.getOutputStream());
			out.flush();
			in = new ObjectInputStream(connection.getInputStream());
			
			//4. The two parts communicate via the input and output streams
			
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
		finally{
			//4: Closing connection
			try{
				in.close();
				out.close();
				providerSocket.close();
			}
			catch(IOException ioException){
				ioException.printStackTrace();
			}
		}
	}
	void sendMessage(String msg)
	{
		try{
			out.writeObject(msg);
			out.flush();
			System.out.println("server>" + msg);
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		Server ser = new Server();
		while(true)
		{
			ser.listener();
		}
	}
}
