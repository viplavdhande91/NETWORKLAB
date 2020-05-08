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

import java.util.regex.*;


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



public class Server2{
    public static void main(String[] args) {
        runs2();
    }

    public static void runs2(){



        try {

             Calendar start = Calendar.getInstance();

             Calendar end = Calendar.getInstance();
           

            Server myObja1a4 = new Server();
            int loopconditionvar = myObja1a4.NoofTimesS;
            String dirPath = myObja1a4.serverfilesfolder;

            DatagramSocket clientSocket = new DatagramSocket();
            byte[] sendData = new byte[1024];   //store outgoing data.
            byte[] receiveData = new byte[1024];  //store incoming data


            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

            clientSocket.connect(serverAddress, 6542);

            File dir = new File(dirPath);
            String[] files = dir.list();
            byte buf2[] = new byte[1024];
            sendData = (Arrays.toString(files)).getBytes();

            // String stringSendData = "Hello Server!";
            //sendData = stringSendData.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 6542);
            clientSocket.send(sendPacket);
            //System.out.println("...packet sent successfully....");


            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            // System.out.println("Received packet data : " +  Arrays.toString(receivePacket.getData()));
            // receiveData = receivePacket.getData();
            String stringReceiveData = new String(receivePacket.getData(), 0, receivePacket.getLength());
            clientSocket.close();
            System.out.println("CLIENT SIDE FILES: " + stringReceiveData);
            System.out.println("\n");


            stringReceiveData = stringReceiveData.replace("[", "");
            stringReceiveData = stringReceiveData.replace("]", "");

            stringReceiveData.trim();
            String[] arr = stringReceiveData.split(",");

            for (int xy = 0; xy < arr.length; xy++) {
                arr[xy] = arr[xy].trim();


            }

//priority logic




  String[] newarrayxlsx = new String[arr.length]; ;
    String[] newarraytxt = new String[arr.length];
    String[] newarrayjpg = new String[arr.length];
    String[] newarrayjpeg= new String[arr.length] ;
    String[] newarraypng = new String[arr.length];
    String[] newarrayjfif= new String[arr.length] ;
    String[] newarrayhtml = new String[arr.length] ;
    String[] newarraycsv = new String[arr.length] ;


    for (int looppriovar=0;looppriovar<arr.length;looppriovar++){


        Pattern pattern =Pattern.compile(".html");
        Matcher matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarrayhtml[looppriovar] =  arr[looppriovar];
        }



         pattern =Pattern.compile(".xlsx");
         matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarrayxlsx[looppriovar] =  arr[looppriovar];
        }


         pattern =Pattern.compile(".txt");
         matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarraytxt[looppriovar] =  arr[looppriovar];
        }



         pattern =Pattern.compile(".jpg");
         matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarrayjpg[looppriovar] =  arr[looppriovar];
        }



         pattern =Pattern.compile(".jpeg");
         matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarrayjpeg[looppriovar] =  arr[looppriovar];
        }


         pattern =Pattern.compile(".jfif");
         matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarrayjfif[looppriovar] =  arr[looppriovar];
        }



         pattern =Pattern.compile(".csv");
         matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarraycsv[looppriovar] =  arr[looppriovar];
        }



         pattern =Pattern.compile(".png");
         matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarraypng[looppriovar] =  arr[looppriovar];
        }


   


    }

       
 

/////////////////////scan logic

String[] prio = {"txt","html","jpg","jpeg","jfif","csv","xlsx","png"};

       Scanner sc = new Scanner(System.in);

       int a[] = new int[8];

       System.out.println("Enter the Priority in between 1 to 8 viz.(HIGHEST = 1 ) (LOWEST = 8)");

        for(int i = 0; i < 8; i++)

        {

            String gfg1 = String.format("My priority for %s :", prio[i]); 

           System.out.println(gfg1);

            a[i] = sc.nextInt();

        
        }

       // System.out.println(Arrays.toString(a));



// Initializing a Dictionary 
        Dictionary priodict = new Hashtable(); 
  
        // put() method 
        for(int i = 0; i < 8; i++){
        priodict.put(prio[i],a[i] ); 

         }


        System.out.println("priorities set by user are:" + priodict);


//////////////////////scan logic ends


    ArrayList<String> list = new ArrayList<String>();


       int  html = (int)  priodict.get("html");       //8
       int  jpg = (int)  priodict.get("jpg") ;   //1
       
       int  jpeg = (int)  priodict.get("jpeg");     //1

       int  jfif = (int)  priodict.get("jfif") ;    //1

       int  csv =  (int) priodict.get("csv") ;    //1

       int  xlsx = (int)  priodict.get("xlsx");     //1

       int  png =  (int) priodict.get("png") ;    //1

      int  txt =  (int) priodict.get("txt") ;    //1

 
int countprio = 0;

//System.out.println(jpeg);

 Arrays.sort(a); 
//System.out.println(Arrays.toString(a));


for(int i = 0; i < 8; i++){

if(txt == a[i]){

//System.out.println("i am txt") ;
list.addAll(Arrays.asList(newarraytxt));
}


if(html == a[i]){
//System.out.println("i am html") ;
list.addAll(Arrays.asList(newarrayhtml));

}


if(jpg == a[i]){
//System.out.println("i am jpg") ;
list.addAll(Arrays.asList(newarrayjpg));

}


if(jpeg == a[i]){
//System.out.println("i am jpeg") ;
list.addAll(Arrays.asList(newarrayjpeg));

}


if(jfif == a[i]){
//System.out.println("i am jfif") ;
list.addAll(Arrays.asList(newarrayjfif));
}


if(csv == a[i]){
//System.out.println("i am csv") ;
list.addAll(Arrays.asList(newarraycsv));
}


if(xlsx == a[i]){
//System.out.println("i am xlsx") ;
list.addAll(Arrays.asList(newarrayxlsx));
}


if(png == a[i]){
//System.out.println("i am png") ;
list.addAll(Arrays.asList(newarraypng));
}


 }


list.removeAll(Collections.singleton(null));

String[] array = list.toArray(new String[list.size()]);






//priority logic end




            for (int ij = 0; loopconditionvar > ij; ij++) {
                Random random = new Random();

                Date startDate = start.getTime();
                 long startTime = startDate.getTime();

//A1
                // int forloopcount = 15;

                //for (int x = 0; x < arr.length; x++) {

                String choiceclient = array[ij];

                InetAddress ip = InetAddress.getByName("127.0.0.1");
                DatagramSocket ds = new DatagramSocket();

                int transfer2 = choiceclient.length();

                DatagramPacket dp = new DatagramPacket(choiceclient.getBytes(), choiceclient.length(), ip, 8564);
                ds.send(dp);
                ds.close();


//A4
                String dirPathnewC = myObja1a4.ServerDownloadFiles ;

                byte receiveData1[] = new byte[1024 * 500];
                DatagramSocket dsoc = new DatagramSocket(4215);

                File file = new File(dirPathnewC + choiceclient);

                OutputStream outee = new FileOutputStream(file);


                try {
                    int counterwhile = 0;


                    while (counterwhile < 1) {
                        DatagramPacket dpac = new DatagramPacket(receiveData1, receiveData1.length);
                        dsoc.receive(dpac);
                        //String words = new String(dpac.getData(),0,dpac.getLength(),"UTF-8");

                        outee.write(receiveData1);

                        // outee.write(words.getBytes());

                        counterwhile += 1;

                    }
                } catch (Exception e) {
                    System.out.println("Error while recieve in Client1: " + e);
                }


                dsoc.close();


                int seed = ij;
                random.setSeed(seed);
                int chance = random.nextInt(10);


                if (((chance % 2) == 0)) {
                    System.out.println("FROM CLIENT:FILE PACKET RECIEVED ");
                    Thread.sleep(500);
                } else {
                    System.out.println("FROM CLIENT:FILE PACKET WAS DROPPED");
                    Thread.sleep(500);

                }


                //  }
                //forloopcount += 1;


                Date endDate = end.getTime();
                long endTime = endDate.getTime();
                int recieve2 = receiveData1.length;



                //LOG FILE CODE
                Logger logger = Logger.getLogger("MyLog");
                FileHandler fh;

                // This block configure the logger with handler and formatter
                fh = new FileHandler("ServerLogFile.log");
                logger.addHandler(fh);

                SimpleFormatter formatter = new SimpleFormatter();
                fh.setFormatter(formatter);

                int transfer =0;
                transfer += transfer2 ;
                int recieve = 0;
                recieve += recieve2 ;



                long duration = (endTime - startTime);  //Total execution time in milli seconds

                String stringqwer = MessageFormat.format(" START TIME {0} || END TIME: {1}|| TRANSFERRED BYTES: {2}  || RECIEVED BYTES  : {3} || SOCKET_ACTIVE_TIME : {4}milliseconds|| CONNECTION_ATTEMPTS:{5}" ,startDate,endDate,transfer,recieve,duration,loopconditionvar);
                // the following statement is used to log any messages
                // String a ="ACTIVITY     || START TIME   || END TIME  ||  NoOfBytesTransffered || SOCKETTIME ";
                // logger.info(a);
                logger.info(stringqwer);





            }




















        }

//file name sharing logic end

        catch (Exception e) {
            System.out.println("Error IN SERVER2: "+e);
        }



    }











}