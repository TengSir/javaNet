package edu.hbuas.javanet.t5;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	public static void main(String[] args)  throws Exception{
		//UDP Server
		
		//1.����udp��socket���󣬲���ͨѶ�˿� (DatagramSocket)
		DatagramSocket server=new DatagramSocket(7890);
		
		//2.׼��һ���յ����ݼ򱨶�����������������(DatagramPacket)
		byte[] data=new byte[1024];
	
		/****---��������ȡ�ͻ��˷��͵�һ����Ϣ--**/
		DatagramPacket  recivePacket=new DatagramPacket(data, data.length);
		//��װһ�����ݼ򱨶����������ܶԷ������������ݣ��������շ�����data�����ϣ��ڶ�������ָ������һ���ܶ�ȡ�����ݴ�С
		
		
		//3.ֱ�ӵ���dataGramdSocket��recive��������������
		server.receive(recivePacket);
		System.out.println("������������ϣ�");
		
		//4.�����ݴ���
		System.out.println("���յ������ݣ�"+new String(data));
		
		
		/****---���������ͻ��˷���һ����Ϣ--**/
		
		byte[] bs="��ð������Ƿ���������ӭ�������ݣ�".getBytes();
		DatagramPacket  sendPacket=new DatagramPacket(bs, bs.length,recivePacket.getAddress(),9999);
	
		//ʹ��server�е�socket�������ݰ������ͳ�ȥ
		server.send(sendPacket);
		
		System.out.println("�������������");
		
	}

}
