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
                
                     
//A)
//logic for decoding the choice sent over stream

    //SUBPART A.2    
   // while(option == 1){ 
                DatagramSocket ds = new DatagramSocket(3000);  
                byte[] buf = new byte[1024];  
                DatagramPacket dp = new DatagramPacket(buf, 1024);  
                ds.receive(dp);  
               String choiceclient = new String(dp.getData(), 0, dp.getLength());  

int receive1 =  dp.getLength();

                ds.close();  


    //SUBPART A.3 
                byte b[]=new byte[1024 * 1000 * 50];  //51200000 Bytes = 48.828125 MB
                FileInputStream f=new FileInputStream(dirPath + choiceclient);
                byte[] arrayfile = Files.readAllBytes(Paths.get(dirPath + choiceclient));                

                DatagramSocket dsoc=new DatagramSocket();
          int i=0;
                
         //      System.out.println("actual bytes to send: "+arrayfile);  

           //    System.out.println("byte total size: "+arrayfile.length);  
     
             //  byte SmallerByteArr[] = new byte[1024*60];  
           //   byte SmallerByteArr0[] = new byte[1024*60];  
           //    byte SmallerByteArr1[] = new byte[1024*60];  
          //     byte SmallerByteArr2[] = new byte[1024*60];  

            // int chunk = 1024*60;  // chunk size
           //  int len = arrayfile.length;
              int counter = 0;
   int transfer1 = arrayfile.length;

             dsoc.send(new DatagramPacket(arrayfile,arrayfile.length,InetAddress.getLocalHost(),1000));

           //   SmallerByteArr = Arrays.copyOfRange(arrayfile,counter, chunk);
            //  SmallerByteArr0= Arrays.copyOfRange(arrayfile,chunk, chunk + chunk);
            //   SmallerByteArr1 = Arrays.copyOfRange(arrayfile, chunk + chunk, chunk+chunk+chunk);   
             //  SmallerByteArr2 = Arrays.copyOfRange(arrayfile, len - len % chunk, len);
           /// /       
               // f.close();


             //  dsoc.send(new DatagramPacket(SmallerByteArr,SmallerByteArr.length,InetAddress.getLocalHost(),1000));
             //  dsoc.send(new DatagramPacket(SmallerByteArr0,SmallerByteArr1.length,InetAddress.getLocalHost(),1000));
            //   dsoc.send(new DatagramPacket(SmallerByteArr1,SmallerByteArr1.length,InetAddress.getLocalHost(),1000));
            //    dsoc.send(new DatagramPacket(SmallerByteArr2,SmallerByteArr2.length,InetAddress.getLocalHost(),1000));

                dsoc.close();  

           
    



//PART B
                   
//SUBPART B.1      

//logic to transfer filename over stream
               
                Calendar start = Calendar.getInstance();
               
                Calendar end = Calendar.getInstance();
Date startDate = start.getTime();
long startTime = startDate.getTime();               
                  System.out.println("ENTER THE NAME OF FILE YOU WANT TO DOWNLOAD CLIENTSIDE:");
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


Date endDate = end.getTime();
long endTime = endDate.getTime();
                  System.out.println("FILE HAS BEEN SUCCESFULLY DOWNLOADED TO :" + dirPath);                  
                  
                  

               try {
                     int counterwhile = 0;  

         
                  while(counterwhile  < 1)
                        {
                        DatagramPacket dpac1=new DatagramPacket(receiveData1,receiveData1.length);
                        dsoc1.receive(dpac1);
                        //String words = new String(dpac.getData(),0,dpac.getLength(),"UTF-8");   
                        outee.write(receiveData1); 
                     // outee.write(words.getBytes());

                        counterwhile+=1;

                        }
                }
                catch (Exception e) {
                    System.out.println("Error while recieve: "+e);
                }

                 
int receive2 = receiveData1.length;
                    dsoc1.close();  



                 //  System.out.println("socket time client file :" + socktime); 










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



