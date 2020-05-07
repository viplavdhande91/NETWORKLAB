/*CLIENT CLASS*/
import java.net.*;
import java.io.*;
import java.util.Scanner;  // Import the Scanner class
import java.util.*;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;


import java.util.Calendar; 
import java.util.GregorianCalendar; 
import java.util.concurrent.*;



import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.File; 
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.text.MessageFormat;


import java.io.File;
import java.nio.file.*;

class client2 extends clientmain implements Runnable 
{ 
	public void run() 
	{ 


   try{
              clientmain myObjb2b3 = new clientmain();
              int loopconditionvar = myObjb2b3.NoofTimesC;
              
   	             for(int ij=0;loopconditionvar>ij;ij++){  

		          //String dirPath = "C:\\Users\\dell\\Desktop\\clientfolder\\";

                  clientmain displayfile = new clientmain();
                  String dirPath = displayfile.dirPathC;



		                 
//PART B)

//logic for decoding the choice sent over stream

//SUBPART B.2      
                DatagramSocket ds1 = new DatagramSocket(5000);  
                byte[] buf1 = new byte[1024];  
                DatagramPacket dp1 = new DatagramPacket(buf1, 1024);  
                ds1.receive(dp1);  
               String choiceserver = new String(dp1.getData(), 0, dp1.getLength());  

               int receive2 =  choiceserver.length();
                ds1.close();  
                



//SUBPART B.3

               byte b[]=new byte[1024 * 1000 * 50];  //51200000 Bytes = 48.828125 MB
                FileInputStream f=new FileInputStream(dirPath + choiceserver);
                byte[] arrayfile = Files.readAllBytes(Paths.get(dirPath + choiceserver));                

                DatagramSocket dsoc1=new DatagramSocket();
                
             
              int counter = 0;
              int transfer2 = arrayfile.length;

             dsoc1.send(new DatagramPacket(arrayfile,arrayfile.length,InetAddress.getLocalHost(),6000));

          
              dsoc1.close();  

              Thread.sleep(500);

          }




  }
  catch (Exception e) {
                    System.out.println("Error in b2b3: "+e);
                }



	} 
} 