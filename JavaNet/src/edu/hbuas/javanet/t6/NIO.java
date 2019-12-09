package edu.hbuas.javanet.t6;

import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Calendar;

public class NIO {

	public static void main(String[] args) throws Exception {
		long startTime=Calendar.getInstance().getTimeInMillis();
		FileChannel  read=FileChannel.open(Paths.get("resource/a.txt"), StandardOpenOption.READ);
		
		FileChannel  write=FileChannel.open(Paths.get("resource/bbb.txt"), StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		
//		read.transferTo(0,read.size(),write);//
		
		write.transferFrom(read, 0, read.size());//
		long endTime=Calendar.getInstance().getTimeInMillis();

	}
}
