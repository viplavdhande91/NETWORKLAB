
import java.net.*;
import java.io.*;
import java.util.Scanner;  // Import the Scanner class
import java.util.*;



public class Workcheck extends Thread {

    public void main(String[] args){
        Server t1=new Server();  
        Client t2=new Client();  
   
        t1.start();  
        t2.start();   

          
        }  
    }
    