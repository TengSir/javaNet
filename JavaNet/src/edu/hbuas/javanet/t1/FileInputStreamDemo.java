package edu.hbuas.javanet.t1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo {

	public static void main(String[] args)  throws Exception{
		/**
		 * FileinputStreamר�Ŷ�ȡ�ļ����ֽ�������
		 * 
		 * 
		 * 1.����һ�������󣨹���һ������Ķ�д���ʣ��������е�IO����ʱ������������쳣����
		 * 
		 * 2.����IO����
		 * 
		 * 3.�ر���
		 */
			FileInputStream  in=new FileInputStream(new File("resource/test.rar"));
			
			/*byte b=in.read();//һ���Զ�ȡһ���ֽڵķ���������ֵ����Ч���ֽ�����
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
