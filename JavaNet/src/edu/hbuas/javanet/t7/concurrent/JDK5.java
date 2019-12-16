package edu.hbuas.javanet.t7.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class JDK5 {

	public static void main(String[] args) {
		//JDK5֮�󴴽����߳��ṩ��һ���µĽӿ�Callable,����ӿڵ�call�������з���ֵ
		TT t=new TT();
		//JDK5֮���ṩ�˿ɱ��ʽ�̳߳�
		ExecutorService  e=Executors.newFixedThreadPool(4);//������һ���̳߳ض���
		Future<Integer>   result= e.submit(t);//����̶߳�������̳߳�����һ�Σ�
		try {
			System.out.println(result.get());
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			e1.printStackTrace();
		}
		Future<Integer>   result1= e.submit(t);//����̶߳�������̳߳�����һ�Σ�
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
