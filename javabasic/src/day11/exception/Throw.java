package day11.exception;

public class Throw{
	public static void main(String[] args) {
		try {
		int a[]=new int[5];
		a[0]=11;
		a[1]=12;
		System.out.println(a[9]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.err.println("exception:"+e.getMessage());
	}
	System.out.println("nextLine()");
}
}