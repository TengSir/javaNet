package edu.hbuas.javanet.t6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOReadAndWriteFile {
	public static void main(String[] args) throws Exception {
		//2.FIleChannel第二种打开方式（直接从传统的io流可以获得channel对象）

		FileInputStream  in=new FileInputStream("resource/a.txt");
		FileChannel  c=in.getChannel();
		
		
		FileOutputStream  out=new FileOutputStream("resource/aaa.txt",true);
		FileChannel   d=out.getChannel();
		
		ByteBuffer  buffer=ByteBuffer.allocate(1024);
		int length=-1;
		
		while((length=c.read(buffer))!=-1) {
			buffer.flip();
			d.write(buffer);
			System.out.println("写入数据长度"+length);
			buffer.clear();
//			byte[] bs=new byte[1024];
//			buffer.get(bs, 0, length);
//			System.out.println(new String(bs));
		}
		
	}

}
