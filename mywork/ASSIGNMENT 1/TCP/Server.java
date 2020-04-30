

//This code contributed by Viplav Patil

//TCP Server 
import java.net.*;
import java.io.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class Server{


	

public static void main(String[] args)throws Exception{
System.out.println("Server Started");

ServerSocket ss = new ServerSocket(5555);

Socket s = ss.accept();	

System.out.println("Client connected");
DataInputStream din  = new DataInputStream(s.getInputStream());
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));

String input  = "";

// Get JavaScript engine
ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");

while (!input.equals("-1")) {

input = din.readUTF();

System.out.println("Client says : " + input);


// Evaluate the expression
Object output = engine.eval(input);
String convertedToString = output.toString();  //method 3

//output = br.readLine();

dout.writeUTF(convertedToString);

dout.flush();	
	
}
din.close();  
s.close();  
ss.close();  

	}	
}