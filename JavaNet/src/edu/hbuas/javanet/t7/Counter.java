package edu.hbuas.javanet.t7;

public class Counter {
	private int count=0;//����һ������������
	
	//������
	public  synchronized void addCount() {
		count++;//1
		synchronized (this) {
			System.out.println("����ǰ�ǵ�"+count+"���˷��ʣ�");
		}
	}
	

}
