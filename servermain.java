
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

	public int NoofTimesS = 1;
	String dirPathS = "C:\\Users\\dell\\Desktop\\codes\\networklab\\Serverfolder\\";


	public static void main(String[] args) 
	{ 

try{	

       
	       displayfileserver fs = new displayfileserver();



	       b1b4 objectb1b4 = new b1b4();  
          Thread b1b4= new Thread(objectb1b4);  

           a2a3 objecta2a3 = new a2a3();  
          Thread a2a3= new Thread(objecta2a3); 

 
            

            fs.displayser();
            b1b4.start();
            a2a3.start();
}

catch (Exception e) {
                 System.out.println(e.toString());
           }
    


			 



		
	} 
} 
