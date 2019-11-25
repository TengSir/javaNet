package edu.hbuas.javanet.t4.file;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileSender {
	//���������ͻ��˷����ļ�
	public static void main(String[] args)  throws Exception{
		
		ServerSocket server=new ServerSocket(9999);
		Socket client=server.accept();
		System.out.println(client.getInetAddress().getHostAddress()+"���ӽ�����");
		
		OutputStream  socketOut=client.getOutputStream();
		
		FileInputStream  fileIn=new FileInputStream("d:/javaNet/model.png");
		
		byte[] bs=new byte[1024];
		int length=-1;
		while((length=fileIn.read(bs))!=-1) {
			socketOut.write(bs,0,length);
		}
		System.out.println("send ok");
		socketOut.close();
		fileIn.close();
		
	}

}
