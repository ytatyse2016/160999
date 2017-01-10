	public class Aloha {
		public static void main(String[] args) {
			// Alohamanクラスの、インスタンスをつくる
			Alohaman am = new Alohaman();

			// am に、命令する。
			am.sayAloha(5901, 3);
		}
	}


	class Alohaman {
		// field: データ
		private String msg;
		private String msg2;

		// method: メソッド
		public Alohaman() {
			// constructor(コンストラクタ)
			// データを準備する。
			this.msg = "ALOHA!";
			this.msg2 = "あおき！";
		}

		public void sayAloha(){
			// メッセージを出力する。
			System.out.println(this.msg);
		}
		public void sayAloha(int n){
			// メッセージを、たくさん（n回）出力する。
			for(int i = 0;  i < n;  i++) {
				System.out.println(i + this.msg);
			}
		}
		public void sayAloha(int n,  int x){
			// n回表示する。
			for(int i = 0;  i < n;  i++) {
				// x回に1回、「アロハ！」と出力する。
				if(i%x == 0) {
					System.out.println(i + this.msg2);
				} else {
					System.out.println(i + this.msg);
				}
			}
		}
	}