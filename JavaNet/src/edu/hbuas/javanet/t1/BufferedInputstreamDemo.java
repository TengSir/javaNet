package edu.hbuas.javanet.t1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedInputstreamDemo {
	public static void main(String[] args) throws Exception {
		/**
		 * ������������������FileInput�����൱���������߱���������,
		 * 
		 * ������write����д������ʱ������������д�����Ľ����У����Ƿ��뻺�棬�ȴ�
		 * ��������close����������flush����ʱ�Ž����������д�����
		 */
		BufferedOutputStream  out=new BufferedOutputStream(new FileOutputStream("resource/test.txt"));
		
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
		out.flush();
		out.close();
	}

}
