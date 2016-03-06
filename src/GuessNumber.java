import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumber {
	private int a;
	private int b;
	private String str0, str1, str2, str3;
	private String guessStr0, guessStr1, guessStr2, guessStr3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessNumber gn = new GuessNumber();
		gn.guess();
	}

	public void guess() {
		System.out.println("猜數字遊戲");
		System.out.print("請輸入一個4位數字(0~9不重複): ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String inputNM = br.readLine();
			char[] sepNM = new char[4];
			sepNM = inputNM.toCharArray();

			str0 = String.valueOf(sepNM[0]);
			str1 = String.valueOf(sepNM[1]);
			str2 = String.valueOf(sepNM[2]);
			str3 = String.valueOf(sepNM[3]);
			System.out.println(str0 + "," + str1 + "," + str2 + "," + str3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("開始猜數字");
		do {
			System.out.print("請輸入一個4位數字(0~9不重複): ");
			try {
				String inputNM = br.readLine();
				char[] sepNM = new char[4];
				sepNM = inputNM.toCharArray();

				guessStr0 = String.valueOf(sepNM[0]);
				guessStr1 = String.valueOf(sepNM[1]);
				guessStr2 = String.valueOf(sepNM[2]);
				guessStr3 = String.valueOf(sepNM[3]);

				if (guessStr0.equals(str0)) {
					a = a + 1;
				} else if (guessStr0.equals(str1)) {
					b = b + 1;
				} else if (guessStr0.equals(str2)) {
					b = b + 1;
				} else if (guessStr0.equals(str3)) {
					b = b + 1;
				}

				if (guessStr1.equals(str1)) {
					a = a + 1;
				} else if (guessStr1.equals(str0)) {
					b = b + 1;
				} else if (guessStr1.equals(str2)) {
					b = b + 1;
				} else if (guessStr1.equals(str3)) {
					b = b + 1;
				}

				if (guessStr2.equals(str2)) {
					a = a + 1;
				} else if (guessStr2.equals(str0)) {
					b = b + 1;
				} else if (guessStr2.equals(str1)) {
					b = b + 1;
				} else if (guessStr2.equals(str3)) {
					b = b + 1;
				}

				if (guessStr3.equals(str3)) {
					a = a + 1;
				} else if (guessStr3.equals(str0)) {
					b = b + 1;
				} else if (guessStr3.equals(str1)) {
					b = b + 1;
				} else if (guessStr3.equals(str2)) {
					b = b + 1;
				}

				System.out.println(guessStr0 + "," + guessStr1 + ","
						+ guessStr2 + "," + guessStr3);

				System.out.println(a + "A" + b + "B");
				System.out.println("再接再厲囉!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (a != 4);

		System.out.println("恭喜! 猜對囉!");

	}

}
