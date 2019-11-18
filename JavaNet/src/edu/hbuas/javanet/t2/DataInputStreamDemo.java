package edu.hbuas.javanet.t2;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo {
	public static void main(String[] args) throws Exception {
		/**
		 * 何为过滤流(高级功能流)：成为高级流，里面的方法比较多。过滤流不能直接从数据介质上构建，他必须由节点构造过来。
		 * 
		 * 过滤流，专门针对java8中基本数据类型的读写流
		 */
		
		DataInputStream  data=new DataInputStream(new FileInputStream("resource/a.txt"));
		
		data.readInt();
		data.readDouble();
		data.readByte();
		
		
		
		data.close();
	}

}
