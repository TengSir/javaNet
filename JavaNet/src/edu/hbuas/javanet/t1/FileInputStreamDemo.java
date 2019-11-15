package edu.hbuas.javanet.t1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo {

	public static void main(String[] args)  throws Exception{
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
			FileInputStream  in=new FileInputStream(new File("resource/test.rar"));
			
			/*byte b=in.read();//一次性读取一个字节的方法，返回值是有效的字节数据
			while(in.available()>0) {
				System.out.println();
			}*/
			byte[] bs=new byte[10];
			int length=-1;
			while((length=in.read(bs))!=-1){
				System.out.println(new String(bs));
			}
	
			
			in.close();
	}
	
	
	
	
	
}
