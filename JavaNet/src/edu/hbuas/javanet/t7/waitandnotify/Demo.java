package edu.hbuas.javanet.t7.waitandnotify;

public class Demo {
	public static void main(String[] args) {
		Printer p=new Printer();
		PrintA  A=new PrintA();
		A.p=p;
	    A.start();
	    PrintB  B=new PrintB();
	    B.p=p;
		B.start();
	}

}
class PrintA extends Thread{
	 Printer p;
	@Override
	public void run() {
		while(true) {
			p.printA();
		}
	}
}
class PrintB extends Thread{
	 Printer p;
	@Override
	public void run() {
		while(true) {
			p.printB();
		}
	}
}
class Printer {
	boolean isPrintA=true;
	public synchronized void printA() {
		if(isPrintA) {
			
			System.out.println("A");
			isPrintA=false;
			this.notifyAll();
		}else {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
	public  synchronized void printB() {
		if(!isPrintA)
		{
			
			System.out.println("B");
			isPrintA=true;
			this.notifyAll();
		}else {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}