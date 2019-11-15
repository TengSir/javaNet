package edu.hbuas.javanet.t1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedInputstreamDemo {
	public static void main(String[] args) throws Exception {
		/**
		 * 缓存区过滤流，他和FileInput功能相当，但是它具备缓存能力,
		 * 
		 * 当调用write方法写入数据时，并不是立马写入具体的介质中，而是放入缓存，等待
		 * 调用流的close方法，或者flush方法时才将缓存的数据写入介质
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
