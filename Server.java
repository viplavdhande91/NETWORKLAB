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
    public int NoofTimesS = 4;
    public String serverfilesfolder= "C:\\Users\\dell\\Desktop\\codes\\networklab\\Serverfolder\\";

    public String ServerDownloadFiles= "C:\\Users\\dell\\Downloads\\";


    public static void main(String args[])throws IOException{

try{


//object instatition and threads run start

              Server1 threadobj0 = new Server1();
              threadobj0.run();

               String[] command = {"cmd.exe", "/C", "Start", "sampleser.bat"};
               Process p =  Runtime.getRuntime().exec(command);
    /// Server2 threadobj1 = new Server2();
              //threadobj1.run();


//object instatition and threads run end 






}
catch (Exception e) {
                    System.out.println("main server exception: "+e);
                }



















              }



}



