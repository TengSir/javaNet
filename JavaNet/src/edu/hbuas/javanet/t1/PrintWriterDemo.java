package edu.hbuas.javanet.t1;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	/**
	 * ��ӡ�������Ժܷ���Ľ����ݰ��ջ��л��߲����еķ�ʽ������ض�������
	 * �ṩ��һϵ�и��������ʽ�ķ�����ָ�����ݽ�����
	 */
		PrintWriter  out=new PrintWriter(new FileWriter("resource/c.txt"));
		out.println("adasd");
		out.print("asds");
		out.append("asdad");
		
		out.close();

	}

}
