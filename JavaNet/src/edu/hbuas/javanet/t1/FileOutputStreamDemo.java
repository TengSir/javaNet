package edu.hbuas.javanet.t1;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		/**
		 * FileinputStream专门读取文件的字节输入流
		 * 
		 * 
		 * 1.创建一个流对象（关联一个具体的读写介质，几乎所有的IO创建时都必须做检查异常处理）
		 * 
		 * 2.进行IO动作
		 * 
		 * 3.关闭它
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
		
//		out.write(97);//一次性输出一个字节
//		
//		out.write("我有一个梦想".getBytes());//一次性将一个数组里面的字节输出到文件中
//		
		
		out.close();
	}

}
