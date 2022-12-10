package com.hackerranck;

public class MultiThreadingExample {
	
public static void main(String[] args) throws InterruptedException {
	Thread addSub = new Thread(new Calculator());
	addSub.setName("addthread");
	long start = System.currentTimeMillis();
	System.out.println("Start time: "+start);
	addSub.start();
	long end = System.currentTimeMillis();
	System.out.println("End time: "+end);
	System.out.println("Thread executed: "+(end-start));
	Thread mulDiv = new Thread(new Calculator2());
	mulDiv.setName("mulDIv");
	mulDiv.start();
	mulDiv.join();
	
}


}
class Calculator  implements Runnable{
	@Override
	public void run() {
		long start = System.currentTimeMillis();
		Calculator calc = new Calculator();
		calc.add(10, 15);
		calc.subtract(10, 15);
		long end = System.currentTimeMillis();
		System.out.println("Thread executed: "+(end-start));


	}

	public void add(int a, int b) {
		for(int i = 0; i<=10; i++)
		System.out.println("Sum is: "+ (a+b));
	}
	public void subtract(int a, int b) {
		for(int i = 0; i<=10; i++)

		System.out.println("Subtract is: "+ (a-b));

	}
	}
	class Calculator2 implements  Runnable {
		public void run() {
			long start = System.currentTimeMillis();
			divide(100, 11);
			multi(11, 11);

			long end = System.currentTimeMillis();
			System.out.println("Thread executed: "+(end-start));
		}
	
		public static void divide(int a, int b) {
			for(int i = 0; i<=10; i++)
			System.out.println("Div is: "+ (a/b));
		}
		public static void multi(int a, int b) {
			for(int i = 0; i<=10; i++)

			System.out.println("Mul is: "+ (a*b));

		}}
	
