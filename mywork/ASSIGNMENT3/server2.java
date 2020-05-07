
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
class server2 extends servermain implements Runnable 
{ 
	public void run() 
	{ 

try{   
       

                Calendar start = Calendar.getInstance();
               
                Calendar end = Calendar.getInstance();
                 

          servermain myObjb1b4 = new servermain();
         int loopconditionvar = myObjb1b4.NoofTimesS;
	       
         for(int ij=0;loopconditionvar>ij;ij++){

      //String dirPath = "C:\\Users\\dell\\Desktop\\codes\\networklab\\Serverfolder\\";
                  
       
      servermain displayfile = new servermain();
      String dirPath = displayfile.dirPathS;

//PART B
                   
//SUBPART B.1      

//logic to transfer filename over stream
               
               // Calendar start = Calendar.getInstance();
               
             //   Calendar end = Calendar.getInstance();
Date startDate = start.getTime();
long startTime = startDate.getTime();

                  System.out.println("ENTER THE NAME OF FILE YOU WANT TO DOWNLOAD FROM CLIENTSIDE:");
                  Scanner sc  = new Scanner(System.in);
                  String choiceserver  = sc.nextLine();

                 InetAddress ip = InetAddress.getByName("127.0.0.1");  
                  DatagramSocket ds1 = new DatagramSocket();  

                  DatagramPacket dp1 = new DatagramPacket(choiceserver.getBytes(), choiceserver.length(), ip, 5000);  

                  int transfer2 = choiceserver.length();

                  ds1.send(dp1);  
                  ds1.close();  
//SUBPART B.4     


             
                  byte receiveData1[]=new byte[1024  * 500];
                   DatagramSocket dsoc1=new DatagramSocket(6000);
         
                   File file = new File(dirPath + choiceserver);

                  OutputStream outee  = new FileOutputStream(file); 


//Date endDate = end.getTime();
//long endTime = endDate.getTime();

                   System.out.println("\n"); 
                   System.out.println("FILE HAS BEEN SUCCESFULLY DOWNLOADED TO :" + dirPath);
                   System.out.println("\n"); 
 

                  
                  

               
                     int counterwhile = 0;  

         
                  while(counterwhile  < 1)
                        {
                        DatagramPacket dpac1=new DatagramPacket(receiveData1,receiveData1.length);
                        dsoc1.receive(dpac1);
                        outee.write(receiveData1); 

                        counterwhile+=1;

                        }
                
                

                 
                int recieve2 = receiveData1.length;
                dsoc1.close();

              
 Date endDate = end.getTime();
 long endTime = endDate.getTime();
              
//LOG FILE CODE
               Logger logger = Logger.getLogger("MyLog");  
                                   FileHandler fh;  

                  // This block configure the logger with handler and formatter  
                  fh = new FileHandler("clientLogFile.log");  
                   logger.addHandler(fh);

                  SimpleFormatter formatter = new SimpleFormatter();  
                    fh.setFormatter(formatter); 

                 int transfer = transfer2 ;
                 int recieve = recieve2 ;
                 long diffTime = endTime - startTime;



                 long duration = (endTime - startTime);  //Total execution time in milli seconds

                  String stringqwer = MessageFormat.format(" START TIME {0} || END TIME: {1}|| TRANSFERRED BYTES: {2}  || RECIEVED BYTES  : {3} || SOCKET_ACTIVE_TIME : {4}milliseconds|| CONNECTION_ATTEMPTS:{5}" ,startDate,endDate,transfer,recieve,duration,loopconditionvar); 
                // the following statement is used to log any messages  
                // String a ="ACTIVITY     || START TIME   || END TIME  ||  NoOfBytesTransffered || SOCKETTIME ";
                 // logger.info(a);  
                  logger.info(stringqwer);  






























                Thread.sleep(500);
            }
 




}
 catch (Exception e) {
                    System.out.println("Error while recieve: "+e);
                }

	} 
} 