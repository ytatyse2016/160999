public class Aloha {
	public static void main(String[] args) {
		// Alohamanを新規作成
		Alohaman am = new Alohaman();

		// Alohamanの、sayAloha()を実行させる
		// args[]の個数によって、つかいわける。
		int num = args.length;

		// args[]の個数で、場合わけ。
		if(num == 0){
			am.sayAloha();
		} else if(num == 1) {
			int data1 = Integer.parseInt(args[0]);
			am.sayAloha(data1);
		} else if(num == 2) {
			int data1 = Integer.parseInt(args[0]);
			int data2 = Integer.parseInt(args[1]);
			am.sayAloha(data1, data2);
		}
	}
}


class Alohaman {
	// field
	private String msg;
	private String msg2;

	// method
	public Alohaman() {
		// コンストラクタ
		this.msg = "ALOHA!";
		this.msg2 = "アロハ！";
	}

	public void sayAloha() {
		// メッセージを出力する
		System.out.println(this.msg);
	}

	public void sayAloha(int n) {
		// メッセージを、n回出力する
		for(int i = 0;  i < n;  i++) {
			System.out.println(i + this.msg);
		}
	}

	public void sayAloha(int n, int x) {
		// メッセージを、n回出力する
		for(int i = 0;  i < n;  i++) {
			// x回に１回「アロハ！」出力する
			if(i%x == 0) {
				System.out.println(i + this.msg2);
			} else {
				System.out.println(i + this.msg);
			}
		}
	}
}