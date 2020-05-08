// Java program to illustrate 
// executing commands on cmd prompt 
import java.io.*;
import java.util.*;
import java.util.regex.*;

class test 
{ 
	public static void main(String[] args) 
	{ 
	
   String[] arr = {"sample.html", "sample.txt", "sbook.xlsx", "simage.jfif"};

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

        System.out.println(Arrays.toString(a));



// Initializing a Dictionary 
        Dictionary priodict = new Hashtable(); 
  
        // put() method 
        for(int i = 0; i < 8; i++){
        priodict.put(prio[i],a[i] ); 

         }


        System.out.println(priodict);


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
System.out.println(Arrays.toString(a));


for(int i = 0; i < 8; i++){

if(txt == a[i]){

System.out.println("i am txt") ;
list.addAll(Arrays.asList(newarraytxt));
}


if(html == a[i]){
System.out.println("i am html") ;
list.addAll(Arrays.asList(newarrayhtml));

}


if(jpg == a[i]){
System.out.println("i am jpg") ;
list.addAll(Arrays.asList(newarrayjpg));

}


if(jpeg == a[i]){
System.out.println("i am jpeg") ;
list.addAll(Arrays.asList(newarrayjpeg));

}


if(jfif == a[i]){
System.out.println("i am jfif") ;
list.addAll(Arrays.asList(newarrayjfif));
}


if(csv == a[i]){
System.out.println("i am csv") ;
list.addAll(Arrays.asList(newarraycsv));
}


if(xlsx == a[i]){
System.out.println("i am xlsx") ;
list.addAll(Arrays.asList(newarrayxlsx));
}


if(png == a[i]){
System.out.println("i am png") ;
list.addAll(Arrays.asList(newarraypng));
}


 }


list.removeAll(Collections.singleton(null));

String[] array = list.toArray(new String[list.size()]);




















	} 
} 

