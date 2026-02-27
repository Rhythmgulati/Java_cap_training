package MultiThreadingAssignment;

public class FileProgram {
	public static void main(String[] args) {
		CopyDataThread cp = new CopyDataThread("data/source.txt","data/output.txt");
		cp.start();
	}
}
