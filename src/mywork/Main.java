package mywork;
import java.util.*;
class raghu{ //super class
	
	//public static int a=Main.ex;
	
	
	private int secretData =10;  //private variable 
	private String secretName ="anonymous";
	
	
	//encapsulation example -- methods to get the private varibles values
	public int get_secretData() {
		return secretData;        //method to get the private int variable - encapsulation
	}
	
	public String get_secretName() {
		return secretName;		//method to get the private String variable - encapsulation
	}
	
	
	//inheritance example this method is only in this class not in child class .
	public int check_inheritance() {
		return 6;
	}
	
	
	//polymorphism example 
	
	public int Multiply(int a, int b)
    {
 
        // Returns product of integer numbers
        return a * b;
    }
 
    // With same name but with 2 double parameters
    public double Multiply(double a, double b)
    {
 
        // Returns product of double numbers
        return a * b;
    }
    
	void call() {
		
		System.out.println("calling raghu");
		
	}
	
	
}


class ramya extends raghu{  //sub class
	void call_new() {
		System.out.println("calling ramya");
	}
	
	
	
	
}
public class Main  
{  
    
    public static void main(String args[])  
    {  
        ramya obj1 = new ramya();
        obj1.call();
        
        //getting inheritance data
        System.out.println(obj1.check_inheritance());
        
        //getting encapsulated data
        System.out.println(obj1.get_secretData());
        System.out.println(obj1.get_secretName());
        
        //getting polymorphism data
        System.out.println(obj1.Multiply(2,3));
        System.out.println(obj1.Multiply(5.6,7.8));
    	
    }  
}  





