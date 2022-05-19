package yacht;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;

class MyData {
	// private int dice1; 중복써있는이유??
	synchronized void abc() {
		System.out.println("\\            \\");
		System.out.println(" \\       -- -- -- --");
		System.out.println("  \\ ____ \\  \\  \\  \\  \\ ");
		System.out.println("   \\ __ | /  / /  /  /");
		System.out.println("    \\    /  / /  /  /");
		System.out.println("     ----------------");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}

	synchronized void bcd() {
		System.out.println();
		System.out.println();
		System.out.println("         ㅁ ㅁ ㅁ ㅁ ㅁ	");
		System.out.println("         _  _  _ _     ");
		System.out.println("        /  / / / /  ");
		System.out.println("       /  / / / /  ");
		System.out.println(" __   /  / / / /");
		System.out.println("\\ \\/          /");
		System.out.println(" \\           / ");
		System.out.println("  \\ _______ /");
		System.out.println();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}
}

class Turn {
	private int one;
	private int two;
	private int three;
	private int four;
	private int five;
	private int six;
	private int bonus;
	private int chance;
	private int fourdice;
	private int fullHouse;
	private final int straight = 15;
	private final int loyalstraight = 20;
	private final int yacht = 60;
	private int dice1;
	private int dice2;
	private int dice3;
	private int dice4;
	private int dice5;
	private int dice6;
	private final int zero = 0;

	public Turn(int one, int two, int three, int four, int five, int six) {
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
		this.five = five;
		this.six = six;
	}

	public int getone(int one) {
		return one * 1;
	}

	public int gettwo(int two) {
		return two * 2;
	}

	public int getthree(int three) {
		return three * 3;
	}

	public int getfour(int four) {
		return four * 4;
	}

	public int getfive(int five) {
		return five * 5;
	}

	public int getsix(int six) {
		return six * 6;
	}

	public int getchance(int one, int two, int three, int four, int five, int six) {
		return one * 1 + two * 2 + three * 3 + four * 4 + five * 5 + six * 6;
	}

	public int getfd(int one, int two, int three, int four, int five, int six) {
		if (one == 4 || two == 4 || three == 4 || four == 4 || five == 4 || six == 4) {
			return one * 1 + two * 2 + three * 3 + four * 4 + five * 5 + six * 6;
		} else {
			return zero;
		}
	}

	public int getfh(int one, int two, int three, int four, int five, int six) {
		if ((one == 3 || two == 3 || three == 3 || four == 3 || five == 3 || six == 3)
				&& (one == 2 || two == 2 || three == 2 || four == 2 || five == 2 || six == 2))
			return one * 1 + two * 2 + three * 3 + four * 4 + five * 5 + six * 6;
		else {
			return zero;
		}
	}

	public int getst(int one, int two, int three, int four, int five, int six) {
		if ((three >= 1 && four >= 1 && one >= 1 && two >= 1) | (two >= 1 && three >= 1 && four >= 1 && five >= 1)
				| (three >= 1 && four >= 1 && five >= 1 && six >= 1))
			return straight;
		else
			return zero;
	}

	public int getls(int one, int two, int three, int four, int five, int six) {
		if ((one == 1 & two == 1 & three == 1 & four == 1 & five == 1)
				|| (two == 1 & three == 1 & four == 1 & five == 1 & six == 1))
			return loyalstraight;
		else
			return zero;
	}

	public int getyacht(int one, int two, int three, int four, int five, int six) {
		if (one == 6 | two == 6 | three == 6 | four == 6 | five == 6 | six == 6) {
			return yacht;
		} else {
			return zero;
		}
	}
}

public class Yacht_Main {
	public class java {
	}

	public static void main(String[] args) {

		System.out.println("게임을 시작합니다");
		System.out.println("-----------");

		Scanner sc = new Scanner(System.in);
		Random ra = new Random();

		int playerTurn = 1;
		System.out.println("주사위를 굴리려면 d를 제외한 아무키나 입력하세요 ");

		int dice1 = 0;
		int dice2 = 0;
		int dice3 = 0;
		int dice4 = 0;
		int dice5 = 0;
		int count = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int sum1 = 0;
		int sum2 = 0;

		HashMap<String, Integer> hSet11 = new LinkedHashMap<String, Integer>();
		HashMap<String, Integer> hSet22 = new LinkedHashMap<String, Integer>();

		hSet11.put("원", 0);
		hSet11.put("투", 0);
		hSet11.put("쓰리", 0);
		hSet11.put("포", 0);
		hSet11.put("파이브", 0);
		hSet11.put("식스", 0);
		hSet11.put("보너스", 0);
		hSet11.put("찬스", 0);
		hSet11.put("포다이스", 0);
		hSet11.put("풀하우스", 0);
		hSet11.put("스트레이트", 0);
		hSet11.put("로얄 스트레이트", 0);
		hSet11.put("야추", 0);
		hSet11.put("총합", 0);
		hSet22.put("원", 0);
		hSet22.put("투", 0);
		hSet22.put("쓰리", 0);
		hSet22.put("포", 0);
		hSet22.put("파이브", 0);
		hSet22.put("식스", 0);
		hSet22.put("보너스", 0);
		hSet22.put("찬스", 0);
		hSet22.put("포다이스", 0);
		hSet22.put("풀하우스", 0);
		hSet22.put("스트레이트", 0);
		hSet22.put("로얄 스트레이트", 0);
		hSet22.put("야추", 0);
		hSet22.put("총합", 0);

		int[] arr = new int[6];

		HashMap<String, Integer> h = new HashMap<String, Integer>();
		HashMap<String, Integer> hSet1 = new HashMap<String, Integer>();

		h.put("one", null);
		h.put("two", null);
		h.put("three", null);
		h.put("four", null);
		h.put("five", null);
		h.put("six", null);

		while (true) {

			{
				while (true) {
					String roll = sc.next();
					if (roll.equals("d")) {
						System.out.println("턴을 종료합니다");
						count = 0;
						break;
					}

					System.out.println("다시 굴릴 주사위를 선택하세요. 첫 번째 턴일 경우 또는 전체를 다시 굴릴 경우 6을 입력하세요. ");
					System.out.println("주사위를 선택하였으면 0을 누르세요");

					try {for (int k =0; ; k++) {
						
						int fix = sc.nextInt();
							if(fix == 6) {
								 dice1 = ra.nextInt(6)+1;
								 dice2 = ra.nextInt(6)+1;
								 dice3 = ra.nextInt(6)+1;
								 dice4 = ra.nextInt(6)+1;
								 dice5 = ra.nextInt(6)+1;
							}
							if(fix==1) {
								 dice1 = ra.nextInt(6)+1;
							}
							else if(fix == 2) {
								 dice2 = ra.nextInt(6)+1;
							}
							else if(fix == 3) {
								 dice3 = ra.nextInt(6)+1;
							}
							else if(fix == 4) {
								 dice4 = ra.nextInt(6)+1;
							}
							else if(fix == 5) {
								 dice5 = ra.nextInt(6)+1;
							}
							else if(fix ==0) {
								break;
								}
							
								}					
						}catch(InputMismatchException e) {
							System.out.println("다시입력해 주세요");
							continue;
						}

					arr[0] = dice1;
					arr[1] = dice2;
					arr[2] = dice3;
					arr[3] = dice4;
					arr[4] = dice5;

					one = 0;
					two = 0;
					three = 0;
					four = 0;
					five = 0;
					six = 0;

					for (int i = 0; i < 6; i++) {
						if (arr[i] == 1) {
							one = one + 1;
							continue;
						} else if (arr[i] == 2) {
							two = two + 1;
							continue;
						} else if (arr[i] == 3) {
							three = three + 1;
							continue;
						} else if (arr[i] == 4) {
							four = four + 1;
							continue;
						} else if (arr[i] == 5) {
							five = five + 1;
							continue;
						} else if (arr[i] == 6) {
							six = six + 1;
							continue;
						}
					}

					if (!roll.equals("d")) {
						/*
						 * System.out.println("[dice1]: "+dice1); System.out.println("[dice2]: "+dice2);
						 * System.out.println("[dice3]: "+dice3); System.out.println("[dice4]: "+dice4);
						 * System.out.println("[dice5]: "+dice5);
						 */

						MyData myData = new MyData();
						new Thread() {
							public void run() {
								myData.abc();
							};
						}.start();
						new Thread() {
							public void run() {
								myData.bcd();
							};
						}.start();
						new Thread() {
							public void run() {
							};
						}.start();
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
						}
						d(dice1);
						d(dice2);
						d(dice3);
						d(dice4);
						d(dice5);
						if (one == 4 || two == 4 || three == 4 || four == 4 || five == 4 || six == 4) {
							System.out.println("포다이스가 떴습니다!!");
						} else if ((one == 3 || two == 3 || three == 3 || four == 3 || five == 3 || six == 3)
								&& (one == 2 || two == 2 || three == 2 || four == 2 || five == 2 || six == 2)) {
							System.out.println("풀하우스가 떴습니다!!");
						} else if ((three >= 1 && four >= 1 && one >= 1 && two >= 1)
								| (two >= 1 && three >= 1 && four >= 1 && five >= 1)
								| (three >= 1 && four >= 1 && five >= 1 && six >= 1)) {
							System.out.println("스트레이트가 떴습니다!!");
						} else if ((one == 1 & two == 1 & three == 1 & four == 1 & five == 1)
								|| (two == 1 & three == 1 & four == 1 & five == 1 & six == 1)) {
							System.out.println("로얄 스트레이트가 떴습니다!!");
						} else if (one == 5 | two == 5 | three == 5 | four == 5 | five == 5 | six == 5) {
							System.out.println("야추가 떴습니다!!");
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

				Turn t = new Turn(h.get("one"), h.get("two"), h.get("three"), h.get("four"), h.get("five"),
						h.get("six"));

				System.out.println("옵션을 선택하세요.");
				System.out.println();
				System.out.println("1.원 2.투 3.쓰리 4.포 5.파이브 6.식스 7.찬스 8.포다이스 9.풀하우스 10.스트레이트 11.로얄 스트레이트 12.야추");

				int op = sc.nextInt();

				switch (op) {
				case 1:
					if (playerTurn % 2 == 1 && 0 == hSet11.get("원")) {
						hSet11.put("원", t.getone(one));
						break;
					} else if (playerTurn % 2 == 0 && 0 == hSet22.get("원")) {
						hSet22.put("원", t.getone(one));
						break;
					} else {
						System.out.println("이미 점수를 추가하셨습니다. 패널티로 0점이 추가됩니다." + System.lineSeparator() + "0");
						break;
					}
				case 2:
					if (playerTurn % 2 == 1 && 0 == hSet11.get("투")) {
						hSet11.put("투", t.gettwo(two));
						break;
					} else if (playerTurn % 2 == 0 && 0 == hSet22.get("투")) {
						hSet22.put("투", t.gettwo(two));
						break;
					} else {
						System.out.println("이미 점수를 추가하셨습니다. 패널티로 0점이 추가됩니다." + System.lineSeparator() + "0");
						break;
					}
				case 3:
					if (playerTurn % 2 == 1 && 0 == hSet11.get("쓰리")) {
						hSet11.put("쓰리", t.getthree(three));
						break;
					} else if (playerTurn % 2 == 0 && 0 == hSet22.get("쓰리")) {
						hSet22.put("쓰리", t.getthree(three));
						break;
					} else {
						System.out.println("이미 점수를 추가하셨습니다. 패널티로 0점이 추가됩니다." + System.lineSeparator() + "0");
						break;
					}
				case 4:
					if (playerTurn % 2 == 1 && 0 == hSet11.get("포")) {
						hSet11.put("포", t.getfour(four));
						break;
					} else if (playerTurn % 2 == 0 && 0 == hSet22.get("포")) {
						hSet22.put("포", t.getfour(four));
						break;
					} else {
						System.out.println("이미 점수를 추가하셨습니다. 패널티로 0점이 추가됩니다." + System.lineSeparator() + "0");
						break;
					}
				case 5:
					if (playerTurn % 2 == 1 && 0 == hSet11.get("파이브")) {
						hSet11.put("파이브", t.getfive(five));
						break;
					} else if (playerTurn % 2 == 0 && 0 == hSet22.get("파이브")) {
						hSet22.put("파이브", t.getfive(five));
						break;
					} else {
						System.out.println("이미 점수를 추가하셨습니다. 패널티로 0점이 추가됩니다." + System.lineSeparator() + "0");
						break;
					}
				case 6:
					if (playerTurn % 2 == 1 && 0 == hSet11.get("식스")) {
						hSet11.put("식스", t.getsix(six));
						break;
					} else if (playerTurn % 2 == 0 && 0 == hSet22.get("식스")) {
						hSet22.put("식스", t.getsix(six));
						break;
					} else {
						System.out.println("이미 점수를 추가하셨습니다. 패널티로 0점이 추가됩니다." + System.lineSeparator() + "0");
						break;
					}
				case 7:
					if (playerTurn % 2 == 1 && 0 == hSet11.get("찬스")) {
						hSet11.put("찬스", t.getchance(one, two, three, four, five, six));
						break;
					} else if (playerTurn % 2 == 0 && 0 == hSet22.get("찬스")) {
						hSet22.put("찬스", t.getchance(one, two, three, four, five, six));
						break;
					} else {
						System.out.println("이미 점수를 추가하셨습니다. 패널티로 0점이 추가됩니다." + System.lineSeparator() + "0");
						break;
					}
				case 8:
					if (playerTurn % 2 == 1 && 0 == hSet11.get("포다이스")) {
						hSet11.put("포다이스", t.getfd(one, two, three, four, five, six));
						break;
					} else if (playerTurn % 2 == 0 && 0 == hSet22.get("포다이스")) {
						hSet22.put("포다이스", t.getfd(one, two, three, four, five, six));
						break;
					} else {
						System.out.println("이미 점수를 추가하셨습니다. 패널티로 0점이 추가됩니다." + System.lineSeparator() + "0");
						break;
					}
				case 9:
					if (playerTurn % 2 == 1 && 0 == hSet11.get("풀하우스")) {
						hSet11.put("풀하우스", t.getfh(one, two, three, four, five, six));
						break;
					} else if (playerTurn % 2 == 0 && 0 == hSet22.get("풀하우스")) {
						hSet22.put("풀하우스", t.getfh(one, two, three, four, five, six));
						break;
					} else {
						System.out.println("이미 점수를 추가하셨습니다. 패널티로 0점이 추가됩니다." + System.lineSeparator() + "0");
						break;
					}
				case 10:
					if (playerTurn % 2 == 1 && 0 == hSet11.get("스트레이트")) {
						hSet11.put("스트레이트", t.getst(one, two, three, four, five, six));
						break;
					} else if (playerTurn % 2 == 0 && 0 == hSet22.get("스트레이트")) {
						hSet22.put("스트레이트", t.getst(one, two, three, four, five, six));
						break;
					} else {
						System.out.println("이미 점수를 추가하셨습니다. 패널티로 0점이 추가됩니다." + System.lineSeparator() + "0");
						break;
					}
				case 11:
					if (playerTurn % 2 == 1 && 0 == hSet11.get("로얄 스트레이트")) {
						hSet11.put("로얄 스트레이트", t.getls(one, two, three, four, five, six));
						break;
					} else if (playerTurn % 2 == 0 && 0 == hSet22.get("로얄 스트레이트")) {
						hSet22.put("로얄 스트레이트", t.getls(one, two, three, four, five, six));
						break;
					} else {
						System.out.println("이미 점수를 추가하셨습니다. 패널티로 0점이 추가됩니다." + System.lineSeparator() + "0");
						break;
					}
				case 12:
					if (playerTurn % 2 == 1 && 0 == hSet11.get("야추")) {
						hSet11.put("야추", t.getyacht(one, two, three, four, five, six));
						break;
					} else if (playerTurn % 2 == 0 && 0 == hSet22.get("야추")) {
						hSet22.put("야추", t.getyacht(one, two, three, four, five, six));
						break;
					} else {
						System.out.println("이미 점수를 추가하셨습니다. 패널티로 0점이 추가됩니다." + System.lineSeparator() + "0");
						break;
					}
				default:
					System.out.println("숫자를 정확히 입력해주세요.");
					continue;
				}
				int bs1 = hSet11.get("원");
				int bs2 = hSet11.get("투");
				int bs3 = hSet11.get("쓰리");
				int bs4 = hSet11.get("포");
				int bs5 = hSet11.get("파이브");
				int bs6 = hSet11.get("식스");

				if (bs1 + bs2 + bs3 + bs4 + bs5 + bs6 >= 63) {
					hSet11.put("보너스", 35);
				}

				int bs21 = hSet22.get("원");
				int bs22 = hSet22.get("투");
				int bs23 = hSet22.get("쓰리");
				int bs24 = hSet22.get("포");
				int bs25 = hSet22.get("파이브");
				int bs26 = hSet22.get("식스");

				if (bs21 + bs22 + bs23 + bs24 + bs25 + bs26 >= 63) {
					hSet22.put("보너스", 35);
				}
				sum1 = 0;
				sum2 = 0;

				if (playerTurn % 2 == 1) {
					System.out.println();
					Iterator<String> keySet = hSet11.keySet().iterator();
					while (keySet.hasNext()) {
						String key = keySet.next();
						Integer value = hSet11.get(key);
						sum1 = sum1 + value;
					}
					sum1 = sum1 - hSet11.get("총합");
					hSet11.put("총합", sum1);
					System.out.println("플레이어1 점수 :" + hSet11);
				}

				else {
					System.out.println();
					Iterator<String> keySet = hSet22.keySet().iterator();
					while (keySet.hasNext()) {
						String key = keySet.next();
						Integer value = hSet22.get(key);
						sum2 = sum2 + value;
					}

					sum2 = sum2 - hSet22.get("총합");
					hSet22.put("총합", sum2);
					System.out.println("플레이어2 점수 :" + hSet22);
				}

				System.out.println();

			}
			playerTurn++;

			if (playerTurn == 25) {

				if (hSet11.get("총합") > hSet22.get("총합")) {
					System.out.println("플레이어1가 이겼습니다");
				} else if (hSet11.get("총합") == hSet22.get("총합")) {
					System.out.println("비겼습니다");
				} else {
					System.out.println("플레이어2가 이겼습니다");
				}

				System.out.println("게임 종료");
				break;
			}
			System.out.println("다음 상대 차례입니다. 주사위를 던지세요 ");
		}
	}

	public static void d(int dice) {

		if (dice == 1) {
			System.out.println(" ------- ");
			System.out.println("|       |");
			System.out.println("|   0   |");
			System.out.println("|       |");
			System.out.println(" ------- ");
		}

		else if (dice == 2) {
			System.out.println(" ------- ");
			System.out.println("|       |");
			System.out.println("|  0 0  |");
			System.out.println("|       |");
			System.out.println(" ------- ");
		} else if (dice == 3) {
			System.out.println(" ------- ");
			System.out.println("| 0     |");
			System.out.println("|   0   |");
			System.out.println("|     0 |");
			System.out.println(" ------- ");
		} else if (dice == 4) {
			System.out.println(" ------- ");
			System.out.println("| 0   0 |");
			System.out.println("|       |");
			System.out.println("| 0   0 |");
			System.out.println(" ------- ");
		} else if (dice == 5) {
			System.out.println(" ------- ");
			System.out.println("| 0   0 |");
			System.out.println("|   0   |");
			System.out.println("| 0   0 |");
			System.out.println(" ------- ");
		} else if (dice == 6) {
			System.out.println(" ------- ");
			System.out.println("| 0   0 |");
			System.out.println("| 0   0 |");
			System.out.println("| 0   0 |");
			System.out.println(" ------- ");
		}
	}
} 