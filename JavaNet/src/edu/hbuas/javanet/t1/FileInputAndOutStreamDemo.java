package edu.hbuas.javanet.t1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputAndOutStreamDemo{

	public static void main(String[] args) throws Exception {
		/**
		 * File字节流输入和输出可以一起使用，来完成一个给予java io实现的文件复制代码
		 */
		
		FileInputStream  source=new FileInputStream("d:/1.pptx");
		FileOutputStream  dest=new FileOutputStream("C:\\test.pptx");
//		int b=-1;
//		while((b=source.read())!=-1) {
//			dest.write(b);
//		}
//		
		
		byte[] bs=new byte[100];
		int length=-1;
		while((length=source.read(bs))!=-1) {
			dest.write(bs,0,length);
		  }
		source.close();
		dest.close();

	}

}
