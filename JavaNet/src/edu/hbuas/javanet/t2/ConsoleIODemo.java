package edu.hbuas.javanet.t2;

import java.io.IOException;

public class ConsoleIODemo {
	public static void main(String[] args) {
		System.out.println("��׼���ݣ��������������׼���������-��Ļ�ϵĿ���̨����");//
		
		//java����׼����������ȫ����װ��System���е�in/out
		try {
			byte[] bs=new byte[10];
			int length= System.in.read(bs);
			System.out.println(new String(bs) );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
