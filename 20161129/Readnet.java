	import java.io.*;
	import java.net.*;

	public class Readnet {
		public static void main(String[] args) {
			// 1. 変数・データを準備する
			String host;			// PC名
			int port;				// ポート番号( 7000,とか )
			Socket sock = null;		// ネットワークを使うため
			InputStream inStr = null;		// データをもらうため
			byte[] buff = new byte[1024];	// データを保存するため
			boolean flag = true;


			// 2. args[]のデータをもらう
			//   args[1]は、int にしてください。
			host = args[0];
			port = Integer.parseInt(args[1]);

			// 3. もらったデータを表示する
			System.out.println("host: " + host);
			System.out.println("port: " + port);

			// 4. ネットワークをつなぐ
			try {
				sock = new Socket( host, port );
				inStr = sock.getInputStream();
				System.out.println("ネットワークをつなぎます。");
			} catch (Exception e) {
				System.err.println("エラーです。");
				System.exit(1);
			}

			// 5. データをもらう: while()で、くり返し
			while( flag ) {
				try {
					// データをもらう
					int n = inStr.read(buff);

					// データを表示する
					System.out.write(buff, 0, n);

				} catch(Exception e) {
					flag = false;				// くり返しをやめる
				}
			}

			// 6. ネットワークを切断(せつだん)する
			try {
				inStr.close();

			} catch(Exception e) {
				System.err.println("エラーです。");
				System.exit(1);
			}
		}
	}