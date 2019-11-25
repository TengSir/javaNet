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
		System.out.println("服务器启动成功");
	  while(true) {
				Socket  client=server.accept();//监听并接受一个客户端连接（阻塞方法）
				System.out.println(client.getInetAddress().getHostAddress()+"连接进来了");
				System.out.println("一个客户端连接成功");
				//网络一旦连接好，就可以准备io通讯了
				//网络IO的流都是从socket对象中获取的，而不是自己new的，java已经将socket底层的流封装进来了
			
				//Socket底层只能提供字节流，如果我们想处理特殊数据，根据情况封装
				
				//定义控制台输入流，用来从控制台读取输入的文本
				BufferedReader consoleReader=new BufferedReader(new InputStreamReader(System.in));
				
				//定义网络通道的输入和输出流（用来从网络通道读写数据）
				BufferedReader reader=new BufferedReader(new InputStreamReader(client.getInputStream()));
				BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
				//为了让发送的业务和度消息的业务不冲突，我们开启了另外一个线程（另外一个运行分支流程）
				new Thread() {
					public void run() {
						while(true) {
							try {
								System.out.println("请输入要给客户端说的话：");
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
								String message=reader.readLine();//阻塞方法
								System.out.println("客户端给我说的话:"+message);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}.start();
			}
	}
	

}
