// Aloha.java

public class Aloha {
	public static void main(String[] args) {
		// 20回表示する
		for( int i = 0;  i < 20;  i++ ) {

			// 4回に1回、"ALOHA!"
			if( i%4 == 0 ) {
				System.out.println("ALOHA!");
			} else {
				System.out.println("アロハ！");
			}

		}
	}
}