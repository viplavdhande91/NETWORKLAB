
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


// Main Class 
public class servermain 
{ 

//SET THIS VALUE APPROPRIATELY {{ THIS VALUE IS THE NUMBER OF TIMES SERVER CAN DOWNLOAD FILE FULL DUPLEXLY }}

	public int NoofTimesS = 2;
	String dirPathS = "C:\\Users\\dell\\Desktop\\codes\\networklab\\Serverfolder\\";


	public static void main(String[] args) 
	{ 

try{	

       
	      displayfileserver fs = new displayfileserver();



	       server2 serverobj2 = new server2();  
          Thread serverthread2= new Thread(serverobj2);  

           server1 serverobj1 = new server1();  
          Thread serverthread1= new Thread(serverobj1); 

 
            

           fs.displayser();
            serverthread2.start();
            serverthread1.start();
}

catch (Exception e) {
                 System.out.println(e.toString());
           }
    


			 



		
	} 
} 
