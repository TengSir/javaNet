package edu.hbuas.javanet.t5.group;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MutilCastClient {
public static void main(String[] args) throws Exception {
		//���ܷ��������ͬһ���鲥��ַ
	
	   //1.�����鲥����
		MulticastSocket  reciver=new MulticastSocket(9999);
		//2.�����鲥��ַ
		InetAddress  groupIP=InetAddress.getByName("224.0.0.0");
		
		reciver.joinGroup(groupIP);
		
		//3.��װ���ݰ�����������
		byte[] data=new byte[1024];
		
		DatagramPacket  recivePacket=new DatagramPacket(data, data.length);
		
		//4.���ܲ���������
		reciver.receive(recivePacket);
		System.out.println("���յ�������Ϊ"+new String(data));
		
		System.out.println("�������");
		
	}
}
