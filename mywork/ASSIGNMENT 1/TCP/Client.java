
//TCP Client 

// This code contributed by Viplav Patil
import java.net.*;
import java.io.*;

public class Client {
	



public static void main(String[] args) throws Exception {
	
Socket s  =  new Socket("localhost",5555);

DataInputStream din  = new DataInputStream(s.getInputStream());
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));


String input  = "", output = "";


while (!input.equals("-1")) {

input = br.readLine();

dout.writeUTF(input);

dout.flush();


output = din.readUTF();

System.out.println("Server says : " + output);


	
}


din.close();  
s.close();  



}

}