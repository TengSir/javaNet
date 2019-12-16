package edu.hbuas.javanet.t7;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo {
	public static void main(String[] args) {
		//JOIN是让步的意思，A如果调用了B的join方法，那么A将让步B，也就是说B先执行，然后B执行完A才能执行
		ArrayList<Integer>  nums=new ArrayList<Integer>();
		Thread t=new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					nums.add(new Random().nextInt(100));
				}
			};
		};
		t.start();
		try {
			t.join(2000);//在主线程中调用t的join指的是主线程让步t，让t先执行。
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(nums.size());
		
	}

}
