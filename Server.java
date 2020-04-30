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

public class Server
{
            public static void main(String args[])throws IOException{
              run();
            }


            public static void run(){




//LISTING ALL FILES
               

            try {

                  String dirPath = "C:\\Users\\dell\\Desktop\\codes\\networklab\\Serverfolder\\";


                //  String dirPathclient = "C:\\Users\\dell\\Desktop\\clientfolder";


                  File dir = new File(dirPath);
                  String[] files = dir.list();
                  if (files.length == 0) {
                      System.out.println("The directory is empty");
                  } 
                  else 
                  {
                  System.out.println("---------SERVER SIDE FILES---------:\n");

                 for (String aFile : files) {
                  System.out.println(aFile);
                        }
                  }



                  Scanner sc = new Scanner(System.in);
                  //int option  = sc.nextInt();

















                
 



//LOG FILE CODE
                 Logger logger = Logger.getLogger("MyLog");  
                 FileHandler fh;  

                  // This block configure the logger with handler and formatter  
                  fh = new FileHandler("ServerLogFile.log");  
                   logger.addHandler(fh);

                  SimpleFormatter formatter = new SimpleFormatter();  
                    fh.setFormatter(formatter); 
                 int a = 5; 
               //  String aVariable = "of ponies";

                 int transfer = transfer1 + transfer2;
                 int recieve = receive1+ receive2;
                  long duration = (endTime - startTime);  //Total execution time in milli seconds



                  duration = (endTime - startTime);  //Total execution time in milli seconds

                 String stringqwer2 = MessageFormat.format(" START TIME:{0} || END TIME: {1}|| TRANSFERRED BYTES: {2}  || RECIEVED BYTES  : {3} || SOCKET_ACTIVE_TIME : {4}milliseconds" 
                    ,startDate,endDate,transfer,recieve,duration); 

                // the following statement is used to log any messages  
                // String a ="ACTIVITY     || START TIME   || END TIME  ||  NoOfBytesTransffered || SOCKETTIME ";
                 // logger.info(a);  
                  //logger.info(stringqwer);
                  logger.info(stringqwer2);  
  



      




             }
             catch (Exception e) {
                 System.out.println(e.toString());
           }


               // }


            
          }

}



