// TestSplit.java
//   ,区切りのデータを、わける

public class TestSplit {
	public static void main(String[] args) {
		String[] quiz;

		quiz = new String[3];
		quiz[0] = "さかな？,魚";
		quiz[1] = "とり？,鳥";
		quiz[2] = "いぬ？,犬";

		String[] data = quiz[0].split(",");
		System.out.println(data[1]);
	}
}