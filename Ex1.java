/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String str1 = new String();
		String str2 = new String();
		System.out.print("輸入字串變數1所指向的記憶體位址內要儲存的資料:");
		str1 = keyin.nextLine();
		System.out.print("輸入字串變數2所指向的記憶體位址內要儲存的資料:");
		str2 = keyin.nextLine();
		System.out.print("字串變數1的內容");
		if (str1 == str2)
			System.out.print(" = ");
		else
			System.out.print(" ≠ ");
		System.out.println("字串變數2的內容");

		System.out.print("字串變數1所指向的記憶體位址內的資料");
		if (str1.equals(str2))
			System.out.print(" = ");
		else
			System.out.print(" ≠ ");
		System.out.println("字串變數2所指向的記憶體位址內的資料");
		keyin.close();
	}
}
