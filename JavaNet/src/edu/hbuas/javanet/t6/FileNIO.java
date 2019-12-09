package edu.hbuas.javanet.t6;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileNIO {

	public static void main(String[] args) {
		
		//NIO中使用channel替换掉了原有的Input和Output
		//如何获得一个Channle对象
		//1.直接使用channel的open方法打开一个文件channel对象
		
		try {
			FileChannel  c=FileChannel.open(Paths.get("resource/a.txt"), StandardOpenOption.READ,StandardOpenOption.WRITE);
			
			ByteBuffer  data=ByteBuffer.wrap("测试文字".getBytes());//讲文本内容转化成直接数组，再转化成ByteBuffer对象
		
			c.write(data);
			
			ByteBuffer  readData=ByteBuffer.allocate(100);//准备空的缓存区对象准备存储channel读取的数据
			
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
