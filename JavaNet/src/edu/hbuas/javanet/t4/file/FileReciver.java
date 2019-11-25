package edu.hbuas.javanet.t4.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileReciver {
	public static void main(String[] args)  throws Exception{
		
		Socket client=new Socket("localhost",9999);
		System.out.println("Á¬½Ó³É");
		
		InputStream  socketIn=client.getInputStream();
		
		
		FileOutputStream  fileOut=new FileOutputStream("C://1.png");
		
		byte[] bs=new byte[1024];
		int length=-1;
		while((length=socketIn.read(bs))!=-1) {
			fileOut.write(bs,0,length);
		}
		System.out.println("recive ok");
		fileOut.close();
		socketIn.close();
		
	}
}
