package edu.hbuas.javanet.t2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderDemo {
	public static void main(String[] args) throws Exception {
		/**
		 * BufferedReader/bufferedWriter
		 * 缓冲区字符输入输出流(过滤流)
		 */
		BufferedReader reader=new BufferedReader(new FileReader("resource/a.txt"));
		
		BufferedWriter  writer=new BufferedWriter(new FileWriter("resource/b.txt"));
		String oneLine=null;
		while((oneLine=reader.readLine())!=null) {
			System.out.println(oneLine);
			writer.write(oneLine);
			writer.newLine();//生成一个换行符到指定文件中
		}
		
		writer.close();
		reader.close();
	}

}
