package io.com;

 class Finallywithoutexception {
public static void main(String[] args) {
	
	try {
		int number=25/5;
		System.out.println(number);
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	
	finally
	{
		System.out.println("The execution of final block always happen");
	}
	System.out.println("after final the rest of the code....");
}	

}
