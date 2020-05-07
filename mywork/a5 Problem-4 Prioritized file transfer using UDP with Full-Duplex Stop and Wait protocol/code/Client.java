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


public class Client extends Thread
{
    public int NoofTimesC = 4;
    public String clientfilesfolder= "C:\\Users\\dell\\Desktop\\clientfolder\\";

    public String clientDownloadFiles= "C:\\Users\\dell\\Downloads\\";

    public static void main(String[] args) {

try{

//object instatition and threads run start
    String[] command = {"cmd.exe", "/C", "Start", "samplecli.bat"};
    Process p =  Runtime.getRuntime().exec(command);

      Client1 threadobj0 = new Client1();
            threadobj0.run();


          //Client2 threadobj1 = new Client2();
          //    threadobj1.run();
//object instatition and threads run end



}


catch (Exception e) {
                    System.out.println("main client exception: "+e);
                }


  }

             

}
