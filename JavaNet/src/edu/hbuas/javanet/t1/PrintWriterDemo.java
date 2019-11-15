package edu.hbuas.javanet.t1;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	/**
	 * 打印流，可以很方便的将数据按照换行或者不换行的方式输出到特定介质中
	 * 提供了一系列各种输出方式的方法到指定数据介质中
	 */
		PrintWriter  out=new PrintWriter(new FileWriter("resource/c.txt"));
		out.println("adasd");
		out.print("asds");
		out.append("asdad");
		
		out.close();

	}

}
