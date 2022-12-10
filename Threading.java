package com.hackerranck;

public class Threading {
	public static void main(String[] args) throws InterruptedException  {

		Calc calc = new Calc();
		calc.divide(110, 2);
		calc.start();
		System.out.println(calc.getName());
		Calc calc2 = new Calc();
		calc2.divide(11, 2);
		calc2.start();
		System.out.println(calc2.getName());
		Calc calc1 = new Calc();
		calc1.divide(10, 100);
		calc1.start();
		System.out.println(calc1.getName());
		calc.join();
	}

}

class Calc extends Thread{
//	public void run() {
//		Calc cal = new Calc();
//		cal.divide(10, 3);
//		cal.divide(10, 2);
//
//	}
	public static  synchronized void divide(int a, int b) {
		for(int i = 0; i<=10; i++)
		System.out.println("Div is: "+ (a/b));
	}
	public static synchronized void multi(int a, int b) {
		for(int i = 0; i<=10; i++)

		System.out.println("Mul is: "+ (a*b));

	}
	
}