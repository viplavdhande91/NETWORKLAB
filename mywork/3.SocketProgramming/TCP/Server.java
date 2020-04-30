

//This code contributed by Viplav Patil


import java.net.*;
import java.io.*;

public class Server{


	

public static void main(String[] args)throws Exception{
System.out.println("Server Started");

ServerSocket ss = new ServerSocket(3333);

Socket s = ss.accept();	

System.out.println("Client connected");
DataInputStream din  = new DataInputStream(s.getInputStream());
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));

String input  = "", output = "";



while (!input.equals("STOP" || "Stop" || "stop")) {

input = din.readUTF();

System.out.println("Client says : " + input);



output = br.readLine();

dout.writeUTF(output);

dout.flush();	
	
}
din.close();  
s.close();  
ss.close();  

	}	
}