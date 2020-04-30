import java.io.*;
import java.net.*;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class UDPServer
{
public static DatagramSocket serversocket;
public static DatagramPacket dp;
public static BufferedReader dis;
public static InetAddress ia;
public static byte buf[] = new byte[1024];
public static int cport = 789,sport=790;
public static void main(String[] a) throws IOException,ScriptException
{
serversocket = new DatagramSocket(sport);
dp = new DatagramPacket(buf,buf.length);
dis = new BufferedReader(new InputStreamReader(System.in));
ia = InetAddress.getLocalHost();
System.out.println("Server is Running...");


// Get JavaScript engine
ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");

while(true)
{
serversocket.receive(dp);
String str = new String(dp.getData(), 0,dp.getLength());

if(str.equals("-1"))
{
System.out.println("Terminated...");
break;
}

// Evaluate the expression
Object output = engine.eval(str);
String convertedToString = output.toString();  //method 3
System.out.println("Client: " + str);

//String str1 = new String(dis.readLine());
buf = convertedToString.getBytes();
serversocket.send(new DatagramPacket(buf,convertedToString.length(), ia, cport));
}
}
}
