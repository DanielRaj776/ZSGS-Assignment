package filemanepulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CopyFileInOrder {
    public void copyFiles () {
	File file = new File("\\Users\\Daniel Raj\\Pictures\\Leasones\\20-09-2022 Polymorphism");
	File[] files = file.listFiles();
	Queue<File> fileQueue = new PriorityQueue<>(Comparator.comparingLong(File::length));
	for(File x : files) {
	    if(x.isFile()) {
		fileQueue.add(x);
	    }
	}
	byte[] temp = new byte[1024];
	File out;
	while(!fileQueue.isEmpty()) {
	    File currentFile = fileQueue.poll();
	    out = new File("\\Users\\Daniel Raj\\Pictures\\Copied Files",  "\\" + currentFile.getName());
	    try(FileInputStream input = new FileInputStream(currentFile);   
		    FileOutputStream output = new FileOutputStream(out)) {
		while (input.available() != 0) {
		    int len = input.read(temp);
		    output.write(temp, 0, len);
		}
		output.flush();
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}
    }
    public static void main(String[] args) {
	CopyFileInOrder ob = new CopyFileInOrder();
	ob.copyFiles();
    }

}
