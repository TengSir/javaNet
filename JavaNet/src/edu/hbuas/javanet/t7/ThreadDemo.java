package edu.hbuas.javanet.t7;

public class ThreadDemo {
	public static void main(String[] args) {
		//SLEEP是控制线程睡眠的方法，书写在哪个线程里是让哪个线程睡眠制定的时间
	
		T1 t=new T1();
		t.start();//
		Thread tt=new Thread(new T2());
		tt.start();
	}

}
class T1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println("&"+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class T2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println("*"+i);
		}
		
	}
}
