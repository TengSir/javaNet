package edu.hbuas.javanet.t6;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileNIO {

	public static void main(String[] args) {
		
		//NIO��ʹ��channel�滻����ԭ�е�Input��Output
		//��λ��һ��Channle����
		//1.ֱ��ʹ��channel��open������һ���ļ�channel����
		
		try {
			FileChannel  c=FileChannel.open(Paths.get("resource/a.txt"), StandardOpenOption.READ,StandardOpenOption.WRITE);
			
			ByteBuffer  data=ByteBuffer.wrap("��������".getBytes());//���ı�����ת����ֱ�����飬��ת����ByteBuffer����
		
			c.write(data);
			
			ByteBuffer  readData=ByteBuffer.allocate(100);//׼���յĻ���������׼���洢channel��ȡ������
			
			c.read(readData);
			readData.flip();
			System.out.println(readData.capacity());
			System.out.println(readData.limit());
			System.out.println(readData.position());
			byte[] bs=new byte[100];
			readData.get(bs);
			System.out.println(new String(bs));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
