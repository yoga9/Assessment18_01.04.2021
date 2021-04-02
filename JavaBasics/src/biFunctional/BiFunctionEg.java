package biFunctional;

import java.util.function.BiFunction;

interface Calculation{
   public static int addition(int a, int b) {
   return a+b;
   }
}
interface Display{
	public static String show(String s1, String s2) {
		return s1+s2;
	}
}
interface Percentage{
	public static float marks(float f1,float f2) {
		return f1+f2;
  }
}
interface Username{
	public static String name(String s3, int c) {
		return s3 + c;
	}
}
interface Grade{
	public static float point(int d, int e) {  //else use float-primitive type
        return (d + e);
   }
}

public class BiFunctionEg {
    public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> add = Calculation :: addition;
		int calc = add.apply(50, 500);
		System.out.println(calc);
		
		BiFunction<String,String,String> disp = Display :: show;
		String show1 = disp.apply("Hello", " World");
		System.out.println(show1);
		
		BiFunction<Float,Float,Float> percent = Percentage :: marks;
		Float marks1 = percent.apply(80f, 90f);
		System.out.println(marks1);
		
		BiFunction<String,Integer,String> strInt = Username :: name;
		String name1 = strInt.apply("Yogi", 545);
		System.out.println(name1);
		
		BiFunction<Integer,Integer,Float> intFloat = Grade :: point;
		Float intFloat1 = intFloat.apply(9, 5);
		System.out.println(intFloat1);
		
	
}
}
