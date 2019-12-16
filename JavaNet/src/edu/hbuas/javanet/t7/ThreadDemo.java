package edu.hbuas.javanet.t7;

public class ThreadDemo {
	public static void main(String[] args) {
		//SLEEP�ǿ����߳�˯�ߵķ�������д���ĸ��߳��������ĸ��߳�˯���ƶ���ʱ��
	
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
