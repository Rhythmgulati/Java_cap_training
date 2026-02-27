package MultiThreadingAssignment;


import java.io.FileReader;
import java.io.FileWriter;


public class CopyDataThread extends Thread{
	String inputString ;
	String outputString ;
	public CopyDataThread(String inpString , String outString) {
		// TODO Auto-generated constructor stub
		this.inputString=inpString;
		this.outputString=outString;
	}
	@Override
	public void run() {
	try {
		FileReader fr = new FileReader(inputString);
		FileWriter fw = new FileWriter(outputString);
		int data;
		int count =0;
		while((data = fr.read())!=-1 ){
			fw.write((char)data);
			count++;
			if(count==10) {
				System.out.println("10 characters are copied");
		        Thread.sleep(1000);
				count=0;
			}
		}
		System.out.println("Success whole file copied");
		fw.close();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}}
	
}
