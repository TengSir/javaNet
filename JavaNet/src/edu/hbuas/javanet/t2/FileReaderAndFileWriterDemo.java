package edu.hbuas.javanet.t2;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderAndFileWriterDemo {

	public static void main(String[] args) throws Exception {
		
		/**
		 * FileReader和FileWriter是reader和writer中的最基本文件字符流的实现类（节点流）
		 */
		FileReader reader=new FileReader("resource/a.txt");
		int c=-1;
		char[] cs=new char[1024];
		while((c=reader.read(cs))!=-1) {
			System.out.print(new String(cs));
		}
		
		FileWriter writer=new FileWriter("resource/a.txt",true);
		writer.write("你好");
		writer.close();
		
		
	}
	
}
