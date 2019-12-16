package edu.hbuas.javanet.t7.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class JDK5 {

	public static void main(String[] args) {
		//JDK5之后创建的线程提供了一个新的接口Callable,这个接口的call方法带有返回值
		TT t=new TT();
		//JDK5之后还提供了可编程式线程池
		ExecutorService  e=Executors.newFixedThreadPool(4);//创建了一个线程池对象
		Future<Integer>   result= e.submit(t);//这个线程对象放入线程池运行一次，
		try {
			System.out.println(result.get());
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			e1.printStackTrace();
		}
		Future<Integer>   result1= e.submit(t);//这个线程对象放入线程池运行一次，
		try {
			System.out.println(result1.get());
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			e1.printStackTrace();
		}
	}
}

class TT implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		int sum=0;
		for (int i = 1; i <=10; i++) {
			sum+=i;
		}
		return sum;
	}
}
