// SampleFileman.java

public class SampleFileman {
	public static void main(String[] args) {
		Fileman fman = new Fileman();

		String[] data = new String[2];
		data[0] = "Aoki,Ebina";
		data[1] = "Horie,Yokohama";

		fman.writeFile(data);
	}
}



class Fileman {
	// field

	// method
	public void writeFile(String[] data){
		System.out.println(data[0]);
		System.out.println(data[1]);
	}
}