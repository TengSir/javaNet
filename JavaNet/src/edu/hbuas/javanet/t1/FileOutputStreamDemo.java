package edu.hbuas.javanet.t1;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		/**
		 * FileinputStreamר�Ŷ�ȡ�ļ����ֽ�������
		 * 
		 * 
		 * 1.����һ�������󣨹���һ������Ķ�д���ʣ��������е�IO����ʱ������������쳣����
		 * 
		 * 2.����IO����
		 * 
		 * 3.�ر���
		 */
		
		FileOutputStream  out=new FileOutputStream("resource/test.txt");
		
		
		out.write(97);
		System.out.println("write one data");
		Thread.sleep(3000);
		System.out.println("write one data");
		out.write(98);
		Thread.sleep(3000);
		System.out.println("write one data");
		out.write(99);
		Thread.sleep(3000);
		System.out.println("write one data");
		out.write(100);
		Thread.sleep(3000);
		System.out.println("write one data");
		
//		out.write(97);//һ�������һ���ֽ�
//		
//		out.write("����һ������".getBytes());//һ���Խ�һ������������ֽ�������ļ���
//		
		
		out.close();
	}

}
