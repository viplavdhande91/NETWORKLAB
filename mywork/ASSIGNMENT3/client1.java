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

class client1 extends clientmain implements Runnable
{ 
	public void run() 
	{ 
		try
		{ 

                Calendar start = Calendar.getInstance();
               
                Calendar end = Calendar.getInstance();
              
//LOGIC FOR FILE DISPLAY
    clientmain myObja1a4 = new clientmain();
    int loopconditionvar = myObja1a4.NoofTimesC;

for(int ij=0;loopconditionvar>ij;ij++){


                   // String dirPath = "C:\\Users\\dell\\Desktop\\clientfolder\\";

          clientmain displayfile = new clientmain();
          String dirPath = displayfile.dirPathC;


                   Scanner sc = new Scanner(System.in);          

// PART A)

//SUBPART A.1      

//logic to transfer filename over stream
Date startDate = start.getTime();
long startTime = startDate.getTime();
                  

                  System.out.println("ENTER THE NAME OF FILE YOU WANT TO DOWNLOAD FROM SERVERSIDE:");
                  String choiceclient  = sc.nextLine();

                 InetAddress ip = InetAddress.getByName("127.0.0.1");  
                  DatagramSocket ds = new DatagramSocket();  
                  
int tranfer1 =  choiceclient.length();

                  DatagramPacket dp = new DatagramPacket(choiceclient.getBytes(), choiceclient.length(), ip, 3000);  
                  ds.send(dp);  
                  ds.close();

//SUBPART A.4     


                  byte receiveData1[]=new byte[1024  * 500];
                  DatagramSocket dsoc=new DatagramSocket(1000);
                  
                  File file = new File(dirPath + choiceclient);

                  OutputStream outee  = new FileOutputStream(file); 

              
                     int counterwhile = 0;  

         
                  while(counterwhile  < 1)
                        {
                        DatagramPacket dpac=new DatagramPacket(receiveData1,receiveData1.length);
                        dsoc.receive(dpac);
                        //String words = new String(dpac.getData(),0,dpac.getLength(),"UTF-8"); 
                        
                        outee.write(receiveData1); 

                       // outee.write(words.getBytes());

                        counterwhile+=1;

                        }
                System.out.println("\n"); 
                System.out.println("FILE HAS BEEN SUCCESFULLY DOWNLOADED TO :" + dirPath);
                System.out.println("\n"); 
                

               
                

                 
     
            int receive1 = receiveData1.length;
            dsoc.close();


Date endDate = end.getTime();
long endTime = endDate.getTime();
                  
                  







//LOG FILE CODE
               Logger logger = Logger.getLogger("MyLog");  

                                  FileHandler fh;  

                 // This block configure the logger with handler and formatter  
                  fh = new FileHandler("ServerLogFile.log");  
                   logger.addHandler(fh);

                  SimpleFormatter formatter = new SimpleFormatter();  
                    fh.setFormatter(formatter); 


                 int transfer = tranfer1 ;
                 int recieve = receive1  ;
                 long diffTime = endTime - startTime;



                 long duration = (endTime - startTime);  //Total execution time in milli seconds

                  String stringqwer2 = MessageFormat.format(" START TIME {0} || END TIME: {1}|| TRANSFERRED BYTES: {2}  || RECIEVED BYTES  : {3} || SOCKET_ACTIVE_TIME : {4}milliseconds|| CONNECTION_ATTEMPTS : {5} "  ,startDate,endDate,transfer,recieve,duration,loopconditionvar); 
                // the following statement is used to log any messages  
                // String a ="ACTIVITY     || START TIME   || END TIME  ||  NoOfBytesTransffered || SOCKETTIME ";
                 // logger.info(a);  
                  logger.info(stringqwer2);  




































			Thread.sleep(1500);

   }
 }
    
    catch (Exception e) {
                    System.out.println("Error in a1a4: "+e);
                }

		

		 
		
	} 
} 
