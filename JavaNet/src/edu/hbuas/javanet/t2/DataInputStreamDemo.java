package edu.hbuas.javanet.t2;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo {
	public static void main(String[] args) throws Exception {
		/**
		 * ��Ϊ������(�߼�������)����Ϊ�߼���������ķ����Ƚ϶ࡣ����������ֱ�Ӵ����ݽ����Ϲ������������ɽڵ㹹�������
		 * 
		 * ��������ר�����java8�л����������͵Ķ�д��
		 */
		
		DataInputStream  data=new DataInputStream(new FileInputStream("resource/a.txt"));
		
		data.readInt();
		data.readDouble();
		data.readByte();
		
		
		
		data.close();
	}

}
