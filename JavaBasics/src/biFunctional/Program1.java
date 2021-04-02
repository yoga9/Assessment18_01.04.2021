package biFunctional;

interface StringLen{
	void disp(String name);
}
interface EvenOdd{
	void check(int a);
}

public class Program1 {
public static void main(String[] args) {
		String str = "Yogeshwari Karnan";         //Normal way - String Length
		System.out.println("The length of the given string is:" +str.length());
	
		if(str.length()>0) {
		System.out.println("The string is not empty " +str.length());}
		
		String str1 = "";
		if((str1.length()==0)) {
			System.out.println("The string is empty " +str1.length());
			}
	    
		System.out.println("Program-1.1 to find length of the string - Using Lambda");   //Using Lambda
		StringLen strLen = (String name)->{
			System.out.println("The name of the string is : "+name+ " -- "+name.length());
		};
		strLen.disp("YogiYogi");
		
		int n = 10;                 //Normal way - EvenOdd
		if(n%2==0) {
			System.out.println("Even Number "+n);}
		
			else {
				System.out.println("Odd Number "+n);
		}
		
		System.out.println("Program-1.2 to check Even or Odd - Using Lambda");       //Using Lambda
		EvenOdd evenOdd = (int a)->{
			if(a%2==0) {
				System.out.println("Number is Even "+a);
			}
				else {
					System.out.println("Number is Odd "+a);
			}
		};
		 evenOdd.check(8);
		 evenOdd.check(5);	
		
}
}
