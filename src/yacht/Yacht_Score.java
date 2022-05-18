package yacht;

import java.util.Scanner;

public class Yacht_Score implements Yacht_Categories {
	Scanner sc = new Scanner(System.in);

	public Yacht_Score(int one, int two, int three, int four, int five, int six) {
		int all = one * 1 + two * 2 + three * 3 + four * 4 + five * 5 + six * 6;
		int all1 = one + two + three + four + five + six;
		

		if (sc.nextInt() == 1) {
			System.out.println(one * 1);
		} else if (sc.nextInt() == 2) {
			System.out.println(two * 2);
		} else if (sc.nextInt() == 3) {
			System.out.println(three * 3);
		} else if (sc.nextInt() == 4) {
			System.out.println(four * 4);
		} else if (sc.nextInt() == 5) {
			System.out.println(five * 5);
		} else if (sc.nextInt() == 6) {
			System.out.println(six * 6);
		} else if (sc.nextInt() == 7) {
			System.out.println(all);
		} else if (sc.nextInt() == 8) {
			if (all1 == 4) {
				System.out.println(all);
			} else {
				System.out.println("잘못선택하셨습니다.");
			}
		} else if (sc.nextInt() == 9) {
			if (all1 == 3 && all1 == 2) {
				System.out.println(all);
			} else {
				System.out.println("잘못선택하셨습니다.");
			}
		} else if (sc.nextInt() == 10) {
			if ((three >= 1 && four >= 1 && one >= 1 && two >= 1) | (two >= 1 && three >= 1 && four >= 1 && five >= 1)
					| (three >= 1 && four >= 1 && five >= 1 && six >= 1)) {
				System.out.println(straight);
			} else {
				System.out.println("잘못선택하셨습니다.");
			}
		} else if (sc.nextInt() == 11) {
			if ((one == 1 & two == 1 & three == 1 & four == 1 & five == 1)
					|| (two == 1 & three == 1 & four == 1 & five == 1 & six == 1)) {
				System.out.println(loyalstraight);
			} else {
				System.out.println("잘못선택하셨습니다.");
			}
		} else if (sc.nextInt() == 12) {
			if (all1 == 5) {
				System.out.println(yacht);
			}
			System.out.println("잘못선택하셨습니다.");
		}
		sc.close();
		
	}
}