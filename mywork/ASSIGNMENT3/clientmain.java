// Java code for thread creation by extending 
// the Thread class 
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


// Main Class 
public class clientmain 
{ 
//SET THIS VALUE APPROPRIATELY {{ THIS VALUE IS THE NUMBER OF TIMES CLIENT CAN DOWNLOAD FILE FULL DUPLEXLY }}
	 public int NoofTimesC = 2;
	 public  String dirPathC = "C:\\Users\\dell\\Desktop\\clientfolder\\";


	public static void main(String[] args) 
	{ 
	try{ 
        

        displayfileclient fc = new displayfileclient();
          
          b2b3 objectb2b3 = new b2b3();  
          Thread b2b3= new Thread(objectb2b3);  

          a1a4 objecta1a4 = new a1a4();  
          Thread a1a4= new Thread(objecta1a4); 

          
            fc.displaycli();
            a1a4.start();    
            b2b3.start();

            }



catch (Exception e) {
                 System.out.println(e.toString());
           }
    
			

          






 
		
	} 
} 
