package edu.hbuas.javanet.t4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
		//127.0.0.1
		//localhost
		//172.19.4.45
		Socket  client=new Socket("localhost",8000);//1.������һ���ͻ���socket 2.ͬʱ��������ָ���ķ�����
		System.out.println("���ӷ������ɹ�");
		
		
		//�������̨�������������ӿ���̨��ȡ������ı�
		BufferedReader  consoleReader=new BufferedReader(new InputStreamReader(System.in));
	
		
		//��������ͨ��������������������������ͨ����д���ݣ�
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		BufferedReader reader=new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		
		//Ϊ���÷��͵�ҵ��Ͷ���Ϣ��ҵ�񲻳�ͻ�����ǿ���������һ���̣߳�����һ�����з�֧���̣�
				new Thread() {
					public void run() {
						while(true) {
							try {

								System.out.println("������Ҫ���͵���Ϣ��");
								String message=consoleReader.readLine();//��������
								writer.write(message);
								writer.newLine();
								writer.flush();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					};
				}.start();
		   
		
	   while(true) {
			String reciveMessage=reader.readLine();
			System.out.println("������˵:"+reciveMessage);
	   }
		
	}

}
