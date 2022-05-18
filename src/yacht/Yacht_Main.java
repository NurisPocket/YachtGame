package yacht;

import java.util.*;

public class Yacht_Main extends Yacht_Score implements Yacht_Categories {
	public Yacht_Main(int one, int two, int three, int four, int five, int six) {
		super(one, two, three, four, five, six);
	}

	public static void main(String[] args) {
		Yacht_Categories categories = new Yacht_Categories() {};
		Yacht_Dice a = new Yacht_Dice() {};
		int dice = 0;
		int count = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		String num[] = { "one", "two", "three", "four", "five", "six" };

		System.out.println("게임을 시작합니다");
		System.out.println("-----------");

		Scanner sc = new Scanner(System.in);
		Random ra = new Random();

		System.out.println("주사위를 굴리려면 d를 제외한 아무키나 입력하세요 ");

		int[] arr = new int[6];

		HashMap<String, Integer> h = new HashMap<String, Integer>();
		for (int i = 0; i < 5; i++) {
			h.put(num[i], null);
		}

		while (true) {

			{
				while (true) {

					String roll = sc.next();

					if (roll.equals("d")) {
						System.out.println("턴을 종료합니다");
						count = 0;
						break;
					}
					for (int i = 0; i < 5; i++)
						for (int j = 0; j < 5; j++) {
							dice = ra.nextInt(6) + 1;
							arr[j] = dice;
						}

					for (int i = 0; i < 6; i++) {

						if (arr[i] == 1) {
							one += 1;
							continue;
						} else if (arr[i] == 2) {
							two += 1;
							continue;
						} else if (arr[i] == 3) {
							three += 1;
							continue;
						} else if (arr[i] == 4) {
							four += 1;
							continue;
						} else if (arr[i] == 5) {
							five += 1;
							continue;
						} else if (arr[i] == 6) {
							six += 1;
							continue;
						}
					}
					a.d(dice);

					if (!roll.equals("d")) {
						for (int i = 0; i < 5; i++) {
							a.d(dice);
						}

						h.replace("one", one);
						h.replace("two", two);
						h.replace("three", three);
						h.replace("four", four);
						h.replace("five", five);
						h.replace("six", six);

						count++;

						if (count == 3) {
							System.out.println("3번의 기회가 끝났습니다");
							count = 0;
							break;
						}

					}

					System.out.println();
					System.out.println(3 - count + "번의 기회가 더 남았습니다. 턴을 종료하시려면 d키를 입력하세요.");
				}


				
				System.out.println("옵션을 선택하세요.");
				System.out.println();
				System.out.println("1.원 2.투 3.쓰리 4.포 5.파이브 6.식스 7.찬스 8.포다이스 9.풀하우스 10.스트레이트 11.로얄 스트레이트 12.야추");

				int op = sc.nextInt();
				Yacht_Score t = new Yacht_Score(one, two, three, four, five, six);
				
				System.out.println(t.Yacht_Score(op));

				System.out.println("다음 상대 차례입니다. 주사위를 던지세요 ");
				System.out.println();

			}

		}

	}

}