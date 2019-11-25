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
		Socket  client=new Socket("localhost",8000);//1.创建了一个客户端socket 2.同时立即连接指定的服务器
		System.out.println("连接服务器成功");
		
		
		//定义控制台输入流，用来从控制台读取输入的文本
		BufferedReader  consoleReader=new BufferedReader(new InputStreamReader(System.in));
	
		
		//定义网络通道的输入和输出流（用来从网络通道读写数据）
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		BufferedReader reader=new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		
		//为了让发送的业务和度消息的业务不冲突，我们开启了另外一个线程（另外一个运行分支流程）
				new Thread() {
					public void run() {
						while(true) {
							try {

								System.out.println("请输入要发送的消息：");
								String message=consoleReader.readLine();//阻塞方法
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
			System.out.println("服务器说:"+reciveMessage);
	   }
		
	}

}
