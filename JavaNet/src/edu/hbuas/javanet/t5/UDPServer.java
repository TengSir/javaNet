package edu.hbuas.javanet.t5;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	public static void main(String[] args)  throws Exception{
		//UDP Server
		
		//1.创建udp的socket对象，并绑定通讯端口 (DatagramSocket)
		DatagramSocket server=new DatagramSocket(7890);
		
		//2.准备一个空的数据简报对象，来接受数据内容(DatagramPacket)
		byte[] data=new byte[1024];
	
		/****---服务器读取客户端发送的一段消息--**/
		DatagramPacket  recivePacket=new DatagramPacket(data, data.length);
		//封装一个数据简报对象，用来接受对方发过来的数据，数据最终放置在data数组上，第二个参数指的是我一次能读取的数据大小
		
		
		//3.直接调用dataGramdSocket的recive方法，接受数据
		server.receive(recivePacket);
		System.out.println("服务器接受完毕！");
		
		//4.对数据处理
		System.out.println("接收到的内容："+new String(data));
		
		
		/****---服务器给客户端发送一段消息--**/
		
		byte[] bs="你好啊，我是服务器，欢迎发送数据！".getBytes();
		DatagramPacket  sendPacket=new DatagramPacket(bs, bs.length,recivePacket.getAddress(),9999);
	
		//使用server中的socket对象讲数据包裹发送出去
		server.send(sendPacket);
		
		System.out.println("服务器发送完毕");
		
	}

}
