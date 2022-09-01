
// type casting 

public class casting {
	public static void main(String[] args){
          //assigning int to double
          int n = 300;
          double x = n;
          System.out.println("casting int to double:" + x);
       
          //casting double to int
          double y = 6.79;
          //int m = y;       // this doesn't work, will show error
          int m = (int) y;   // this works
          System.out.println("casting double to int:" + m);
          
          System.out.println("original double y =" + y);


          //things inside quotes are strings not numbers
          double a=5.0;
	  System.out.println("5.0"+a*100);
	}
}
 
