package edu.hbuas.javanet.t5.group;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MutilCastServer {
	public static void main(String[] args) throws Exception {
		//�鲥ʹ��MutilCastSocket����ͨѶ
		
		//1.����һ���ಥ����
		MulticastSocket  sender=new MulticastSocket();
		//2.�����鲥��ַ(ָ��ͨѶƵ��)
		InetAddress  groupIP=InetAddress.getByName("224.0.0.0");
		
		sender.joinGroup(groupIP);
	
		while(true) {
			
			//3.��װ���ݰ���
			String message="���,�鲥���û���";
			DatagramPacket  sendpacket=new DatagramPacket(message.getBytes(),message.length(),groupIP,9999);
			
			//4.��������
			sender.send(sendpacket);
			
			System.out.println("�����Ѿ����͵��鲥��ַ��");
		}
		
	}

}
