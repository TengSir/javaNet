package edu.hbuas.javanet.t5;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) throws Exception {
		//UDP Client 
		//1.����udp��socket���󣬿��Բ�ָ���˿�
		DatagramSocket  client=new DatagramSocket(9999);
		
		//2.׼��һ��Ҫ���͵����ݼ򱨶��󣬸ö�����һ����װ��Ҫ���͵�����(DatagramPacket)
		byte[]  bs="��ã�����udp�Ŀͻ��˶���".getBytes();//��һ�������ַ���ת���ֽ�����
		
		/****---�ͻ���������������һ������--**/
		InetAddress  reciveIP=InetAddress.getLocalHost();//��װһ�����շ��ĵ�ַ��
		
		DatagramPacket  pack=new DatagramPacket(bs,bs.length,reciveIP,7890);
		//��Ҫ���͵����ݣ��ֽ����飩��װ�����ݼ򱨶������棬���͵����ݰ����б���
		//���Ͻ��շ��ĵ�ַ
		
	   //3.ʹ��datagramSocket��send�����������ݼ򱨷��ͳ�ȥ
		client.send(pack);
		System.out.println("�ͻ��˷������");
		
		
		/****---�ͻ������ܷ��������͵�һ������--**/
		byte[] datas=new byte[100];
		DatagramPacket  recivePacket=new DatagramPacket(datas, datas.length);
		
		//ʹ��client��socket����������ݰ���
		client.receive(recivePacket);
		
		System.out.println("������˵:"+new String(datas));
		
		System.out.println("�ͻ��˽������");
		
	}

}
