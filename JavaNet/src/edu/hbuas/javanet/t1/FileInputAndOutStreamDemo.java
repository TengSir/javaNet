package edu.hbuas.javanet.t1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputAndOutStreamDemo{

	public static void main(String[] args) throws Exception {
		/**
		 * File�ֽ���������������һ��ʹ�ã������һ������java ioʵ�ֵ��ļ����ƴ���
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
