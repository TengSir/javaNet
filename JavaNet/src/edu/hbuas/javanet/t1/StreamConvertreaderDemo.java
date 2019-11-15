package edu.hbuas.javanet.t1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class StreamConvertreaderDemo {

	public static void main(String[] args) throws Exception {
		/**
		 * �ֽ��ַ�ת������
		 * 
		 * �ײ�ֻ���ṩ�ֽ��� ��������Ҫʹ���ַ���
		 * 
		 * 
		 * InputStreamReader�ֽ�����ת���ַ�������
		 * OutputStreamWriter �ֽ����ת���ַ���� 
		 */
		
		InputStream  in=System.in;
		
		File  chatRecord=new File("resource/record.txt");
		BufferedWriter writer=new BufferedWriter(new FileWriter(chatRecord));
		
		
		BufferedReader  reader=new BufferedReader(new InputStreamReader(in));
		String message=null;
		while((message=reader.readLine())!=null) {
			System.out.println(message);
			writer.write(new Date().toLocaleString()+"\t"+message);
			writer.newLine();
			writer.flush();
		}
		
		writer.close();
		reader.close();
	}
}
