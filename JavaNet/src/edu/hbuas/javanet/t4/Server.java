package edu.hbuas.javanet.t4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args)  throws  Exception{
		//172.19.4.45
		ServerSocket  server=new ServerSocket(8000);
		System.out.println("�����������ɹ�");
	  while(true) {
				Socket  client=server.accept();//����������һ���ͻ������ӣ�����������
				System.out.println(client.getInetAddress().getHostAddress()+"���ӽ�����");
				System.out.println("һ���ͻ������ӳɹ�");
				//����һ�����Ӻã��Ϳ���׼��ioͨѶ��
				//����IO�������Ǵ�socket�����л�ȡ�ģ��������Լ�new�ģ�java�Ѿ���socket�ײ������װ������
			
				//Socket�ײ�ֻ���ṩ�ֽ�������������봦���������ݣ����������װ
				
				//�������̨�������������ӿ���̨��ȡ������ı�
				BufferedReader consoleReader=new BufferedReader(new InputStreamReader(System.in));
				
				//��������ͨ��������������������������ͨ����д���ݣ�
				BufferedReader reader=new BufferedReader(new InputStreamReader(client.getInputStream()));
				BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
				//Ϊ���÷��͵�ҵ��Ͷ���Ϣ��ҵ�񲻳�ͻ�����ǿ���������һ���̣߳�����һ�����з�֧���̣�
				new Thread() {
					public void run() {
						while(true) {
							try {
								System.out.println("������Ҫ���ͻ���˵�Ļ���");
								String willSendmessage=consoleReader.readLine();
								writer.write(willSendmessage);
								writer.newLine();
								writer.flush();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					};
				}.start();
				
			new Thread() {
					public void run() {
						while(true) {
							try {
								String message=reader.readLine();//��������
								System.out.println("�ͻ��˸���˵�Ļ�:"+message);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}.start();
			}
	}
	

}
