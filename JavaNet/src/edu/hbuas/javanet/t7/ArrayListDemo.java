package edu.hbuas.javanet.t7;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo {
	public static void main(String[] args) {
		//JOIN���ò�����˼��A���������B��join��������ôA���ò�B��Ҳ����˵B��ִ�У�Ȼ��Bִ����A����ִ��
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
			t.join(2000);//�����߳��е���t��joinָ�������߳��ò�t����t��ִ�С�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(nums.size());
		
	}

}
