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
         
public static void main(String[] args) {

try{



//object instatition and threads run start

         
          Client1 threadobj = new Client1();
              threadobj.start();
//object instatition and threads run end



}


catch (Exception e) {
                    System.out.println("main client exception: "+e);
                }


  }

             

}
