import java.net.*;
import java.io.*;
import java.util.Scanner;  // Import the Scanner class
import java.util.*;

/*CLIENT CLASS*/
import java.text.ParseException;
import java.util.concurrent.TimeUnit;


import java.util.Arrays;

import java.util.Calendar; 
import java.util.GregorianCalendar; 
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.text.MessageFormat;

import java.io.File;
import java.nio.file.*;
class server1 extends servermain implements Runnable
{ 
	public void run() 
	{ 

try{		       
       
          servermain myObja2a3 = new servermain();
         int loopconditionvar = myObja2a3.NoofTimesS;            

	           for(int ij=0;loopconditionvar>ij;ij++){  

 
		   
//logic for decoding the choice sent over stream
                 
//SUBPART A.2                     
               // String dirPath = "C:\\Users\\dell\\Desktop\\codes\\networklab\\Serverfolder\\";

              int ack = 0;

               servermain displayfile = new servermain();
               String dirPath = displayfile.dirPathS;

                DatagramSocket ds = new DatagramSocket(3000);  
                byte[] buf = new byte[1024];  
                DatagramPacket dp = new DatagramPacket(buf, 1024);  
                ds.receive(dp);

               String choiceclient = new String(dp.getData(), 0, dp.getLength());  
                //System.out.println("choiceclient" + choiceclient);
                int receive1 =  dp.getLength();
                ds.close();  






//SUBPART A.3 
                byte b[]=new byte[1024 * 1000 * 50];  //51200000 Bytes = 48.828125 MB

                FileInputStream f=new FileInputStream(dirPath + choiceclient);
                byte[] arrayfile = Files.readAllBytes(Paths.get(dirPath + choiceclient));                

                DatagramSocket dsoc=new DatagramSocket();
                
                int i=0;
                

     
             
                int counter = 0;
                int transfer1 = arrayfile.length;

                dsoc.send(new DatagramPacket(arrayfile,arrayfile.length,InetAddress.getLocalHost(),1000));

                dsoc.close();

               Thread.sleep(500);
           }
  

           
    
}
catch (Exception e) {
                    System.out.println("Error in a2a3: "+e);
                }





	} 
} 