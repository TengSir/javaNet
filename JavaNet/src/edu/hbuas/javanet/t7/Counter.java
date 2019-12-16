package edu.hbuas.javanet.t7;

public class Counter {
	private int count=0;//定义一个变量来计数
	
	//互斥锁
	public  synchronized void addCount() {
		count++;//1
		synchronized (this) {
			System.out.println("您当前是第"+count+"个人访问！");
		}
	}
	

}
