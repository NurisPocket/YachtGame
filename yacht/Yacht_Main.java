package yacht;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

public class Yacht_Main extends Yacht_Score {
	public static void main(String[] args) throws IOException {
		File tempdir = new File("C:/Temp");
		if (!tempdir.exists())
			tempdir.mkdir();
		File write = new File("C:/Temp/ScoreOf.txt");
		if (!write.exists())
			write.createNewFile(); // Score 파일 생성
		BufferedReader br = new BufferedReader(new FileReader(write));
		BufferedWriter bw = new BufferedWriter(new FileWriter(write, true));

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

					try {
						for (;;) {

							int fix = sc.nextInt();
							if (fix == 6) {
								dice1 = ra.nextInt(6) + 1;
								dice2 = ra.nextInt(6) + 1;
								dice3 = ra.nextInt(6) + 1;
								dice4 = ra.nextInt(6) + 1;
								dice5 = ra.nextInt(6) + 1;
							}
							if (fix == 1) {
								dice1 = ra.nextInt(6) + 1;
							} else if (fix == 2) {
								dice2 = ra.nextInt(6) + 1;
							} else if (fix == 3) {
								dice3 = ra.nextInt(6) + 1;
							} else if (fix == 4) {
								dice4 = ra.nextInt(6) + 1;
							} else if (fix == 5) {
								dice5 = ra.nextInt(6) + 1;
							} else if (fix == 0) {
								break;
							}

						}
					} catch (InputMismatchException e) {
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

					Yacht_Dice y_dice = new Yacht_Dice();
					Yacht_Dice.MyData myData = y_dice.new MyData();

					if (!roll.equals("d")) {
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
						y_dice.d(dice1);
						y_dice.d(dice2);
						y_dice.d(dice3);
						y_dice.d(dice4);
						y_dice.d(dice5);
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

				System.out.println("옵션을 선택하세요.");
				System.out.println();
				System.out.println("1.원 2.투 3.쓰리 4.포 5.파이브 6.식스 7.찬스 8.포다이스 9.풀하우스 10.스트레이트 11.로얄 스트레이트 12.야추");

				Yacht_Score y_score = new Yacht_Score();
				y_score.Turn(h.get("one"), h.get("two"), h.get("three"), h.get("four"), h.get("five"), h.get("six"));

				while (true) {
					int op = sc.nextInt();
					switch (op) {
					case 1:
						if (playerTurn % 2 == 1 && 0 == hSet11.get("원")) {
							hSet11.put("원", y_score.getone(one));
							bw.write("-                       " + String.valueOf(y_score.getone(one) + "점"));
							bw.flush();
							break;
						} else if (playerTurn % 2 == 0 && 0 == hSet22.get("원")) {
							hSet22.put("원", y_score.getone(one));
							bw.write("                                                         	"
									+ String.valueOf(hSet22.get("원") + "점\n"));
							bw.flush();
							break;
						} else {
							System.out.println("이미 점수를 추가하셨습니다." + System.lineSeparator() + "다시 선택해주세요.");
							continue;
						}
					case 2:
						if (playerTurn % 2 == 1 && 0 == hSet11.get("투")) {
							hSet11.put("투", y_score.gettwo(two));
							bw.write("-                       " + String.valueOf(hSet11.get("투") + "점 "));
							bw.flush();
							break;
						} else if (playerTurn % 2 == 0 && 0 == hSet22.get("투")) {
							hSet22.put("투", y_score.gettwo(two));
							bw.write("                                                         	"
									+ String.valueOf(hSet22.get("투") + "점 \n"));
							bw.flush();
							break;
						} else {
							System.out.println("이미 점수를 추가하셨습니다." + System.lineSeparator() + "다시 선택해주세요.");
							continue;
						}
					case 3:
						if (playerTurn % 2 == 1 && 0 == hSet11.get("쓰리")) {
							hSet11.put("쓰리", y_score.getthree(three));
							bw.write("-                      " + String.valueOf(hSet11.get("쓰리") + "점 "));
							bw.flush();
							break;
						} else if (playerTurn % 2 == 0 && 0 == hSet22.get("쓰리")) {
							hSet22.put("쓰리", y_score.getthree(three));
							bw.write("                                                         	"
									+ String.valueOf(hSet22.get("쓰리") + "점 \n"));
							bw.flush();
							break;
						} else {
							System.out.println("이미 점수를 추가하셨습니다." + System.lineSeparator() + "다시 선택해주세요.");
							continue;
						}
					case 4:
						if (playerTurn % 2 == 1 && 0 == hSet11.get("포")) {
							hSet11.put("포", y_score.getfour(four));
							bw.write("-                      " + String.valueOf(hSet11.get("포") + "점 "));
							bw.flush();
							break;
						} else if (playerTurn % 2 == 0 && 0 == hSet22.get("포")) {
							hSet22.put("포", y_score.getfour(four));
							bw.write("                                                         	"
									+ String.valueOf(hSet22.get("포") + "점 \n"));
							bw.flush();
							break;
						} else {
							System.out.println("이미 점수를 추가하셨습니다." + System.lineSeparator() + "다시 선택해주세요.");
							continue;
						}
					case 5:
						if (playerTurn % 2 == 1 && 0 == hSet11.get("파이브")) {
							hSet11.put("파이브", y_score.getfive(five));
							bw.append("-                     " + String.valueOf(hSet11.get("파이브") + "점 "));
							bw.flush();
							break;
						} else if (playerTurn % 2 == 0 && 0 == hSet22.get("파이브")) {
							hSet22.put("파이브", y_score.getfive(five));
							bw.append("                                                         	"
									+ String.valueOf(hSet22.get("파이브") + "점 \n"));
							bw.flush();
							break;
						} else {
							System.out.println("이미 점수를 추가하셨습니다." + System.lineSeparator() + "다시 선택해주세요.");
							continue;
						}
					case 6:
						if (playerTurn % 2 == 1 && 0 == hSet11.get("식스")) {
							hSet11.put("식스", y_score.getsix(six));
							bw.write("-                      " + String.valueOf(hSet11.get("식스") + "점 "));
							bw.flush();
							break;
						} else if (playerTurn % 2 == 0 && 0 == hSet22.get("식스")) {
							hSet22.put("식스", y_score.getsix(six));
							bw.write("                                                         	"
									+ String.valueOf(hSet22.get("식스") + "점 \n"));
							bw.flush();
							break;
						} else {
							System.out.println("이미 점수를 추가하셨습니다." + System.lineSeparator() + "다시 선택해주세요.");
							continue;
						}
					case 7:
						if (playerTurn % 2 == 1 && 0 == hSet11.get("찬스")) {
							hSet11.put("찬스", y_score.getchance(one, two, three, four, five, six));
							bw.write("-                      " + String.valueOf(hSet11.get("찬스") + "점 "));
							bw.flush();
							break;
						} else if (playerTurn % 2 == 0 && 0 == hSet22.get("찬스")) {
							hSet22.put("찬스", y_score.getchance(one, two, three, four, five, six));
							bw.write("                                                         	"
									+ String.valueOf(hSet22.get("찬스") + "점 \n"));
							bw.flush();
							break;
						} else {
							System.out.println("이미 점수를 추가하셨습니다." + System.lineSeparator() + "다시 선택해주세요.");
							continue;
						}
					case 8:
						if (playerTurn % 2 == 1 && 0 == hSet11.get("포다이스")) {
							hSet11.put("포다이스", y_score.getfd(one, two, three, four, five, six));
							bw.write("-                      " + String.valueOf(hSet11.get("포다이스") + "점 "));
							bw.flush();
							break;
						} else if (playerTurn % 2 == 0 && 0 == hSet22.get("포다이스")) {
							hSet22.put("포다이스", y_score.getfd(one, two, three, four, five, six));
							bw.write("                                                         	"
									+ String.valueOf(hSet22.get("포다이스") + "점 \n"));
							bw.flush();
							break;
						} else {
							System.out.println("이미 점수를 추가하셨습니다." + System.lineSeparator() + "다시 선택해주세요.");
							continue;
						}
					case 9:
						if (playerTurn % 2 == 1 && 0 == hSet11.get("풀하우스")) {
							hSet11.put("풀하우스", y_score.getfh(one, two, three, four, five, six));
							bw.write("-                      " + String.valueOf(hSet11.get("풀하우스") + "점 "));
							bw.flush();
							break;
						} else if (playerTurn % 2 == 0 && 0 == hSet22.get("풀하우스")) {
							hSet22.put("풀하우스", y_score.getfh(one, two, three, four, five, six));
							bw.write("                                                         	"
									+ String.valueOf(hSet22.get("풀하우스") + "점 \n"));
							bw.flush();
							break;
						} else {
							System.out.println("이미 점수를 추가하셨습니다." + System.lineSeparator() + "다시 선택해주세요.");
							continue;
						}
					case 10:
						if (playerTurn % 2 == 1 && 0 == hSet11.get("스트레이트")) {
							hSet11.put("스트레이트", y_score.getst(one, two, three, four, five, six));
							bw.write("-                      " + String.valueOf(hSet11.get("스트레이트") + "점 "));
							bw.flush();
							break;
						} else if (playerTurn % 2 == 0 && 0 == hSet22.get("스트레이트")) {
							hSet22.put("스트레이트", y_score.getst(one, two, three, four, five, six));
							bw.write("                                                         	"
									+ String.valueOf(hSet22.get("스트레이트") + "점 \n"));
							bw.flush();
							break;
						} else {
							System.out.println("이미 점수를 추가하셨습니다." + System.lineSeparator() + "다시 선택해주세요.");
							continue;
						}
					case 11:
						if (playerTurn % 2 == 1 && 0 == hSet11.get("로얄 스트레이트")) {
							hSet11.put("로얄 스트레이트", y_score.getls(one, two, three, four, five, six));
							bw.write("-                      " + String.valueOf(hSet11.get("로얄 스트레이트") + "점 "));
							bw.flush();
							break;
						} else if (playerTurn % 2 == 0 && 0 == hSet22.get("로얄 스트레이트")) {
							hSet22.put("로얄 스트레이트", y_score.getls(one, two, three, four, five, six));
							bw.write("                                                         	"
									+ String.valueOf(hSet22.get("로얄 스트레이트") + "점 \n"));
							bw.flush();
							break;
						} else {
							System.out.println("이미 점수를 추가하셨습니다." + System.lineSeparator() + "다시 선택해주세요.");
							continue;
						}
					case 12:
						if (playerTurn % 2 == 1 && 0 == hSet11.get("야추")) {
							hSet11.put("야추", y_score.getyacht(one, two, three, four, five, six));
							bw.write("-                     " + String.valueOf(hSet11.get("야추") + "점 "));
							bw.flush();
							break;
						} else if (playerTurn % 2 == 0 && 0 == hSet22.get("야추")) {
							hSet22.put("야추", y_score.getyacht(one, two, three, four, five, six));
							bw.write("                                                         	"
									+ String.valueOf(hSet22.get("야추") + "점 \n"));
							bw.flush();
							break;
						} else {
							System.out.println("이미 점수를 추가하셨습니다." + System.lineSeparator() + "다시 선택해주세요.");
							continue;
						}
					default:
						System.out.println("번호를 정확히 입력해주세요.");
					}
					if (op > 12) {
						continue;
					}

					break;
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

				bw.append("플레이어 1" + String.valueOf(hSet11));
				bw.append("             " + "Score :" + "    " + hSet11.get("총합") + "\n");
				bw.append("∇ \n" + "1.원 =" + hSet11.get("원") + "\n" + "2.투 =" + hSet11.get("투") + "\n" + "3.쓰리 ="
						+ hSet11.get("쓰리") + "\n" + "4.포 =" + hSet11.get("포") + "\n" + "5.파이브 =" + hSet11.get("파이브")
						+ "\n" + "6.식스 =" + hSet11.get("식스") + "\n" + "7.찬스 =" + hSet11.get("찬스") + "\n" + "8.포다이스 ="
						+ hSet11.get("포다이스") + "\n" + "9.풀하우스 =" + hSet11.get("풀하우스") + "\n" + "10.스트레이트 ="
						+ hSet11.get("스트레이트") + "\n" + "11.로얄스트레이트 =" + hSet11.get("로얄 스트레이트") + "\n" + "12.야추 ="
						+ hSet11.get("야추") + "\n" + "＾");
				bw.append("\n\n");
				bw.flush();
				bw.append("플레이어 2" + String.valueOf(hSet22));
				bw.append("             " + "Score :" + "    " + hSet22.get("총합") + "\n");
				bw.append("∇ \n" + "1.원 =" + hSet22.get("원") + "\n" + "2.투 =" + hSet22.get("투") + "\n" + "3.쓰리 ="
						+ hSet22.get("쓰리") + "\n" + "4.포 =" + hSet22.get("포") + "\n" + "5.파이브 =" + hSet22.get("파이브")
						+ "\n" + "6.식스 =" + hSet22.get("식스") + "\n" + "7.찬스 =" + hSet22.get("찬스") + "\n" + "8.포다이스 ="
						+ hSet22.get("포다이스") + "\n" + "9.풀하우스 =" + hSet22.get("풀하우스") + "\n" + "10.스트레이트 ="
						+ hSet22.get("스트레이트") + "\n" + "11.로얄스트레이트 =" + hSet22.get("로얄 스트레이트") + "\n" + "12.야추 ="
						+ hSet22.get("야추") + "\n" + "＾");
				bw.append("\n\n");
				bw.flush();

				String data;

				while ((data = br.readLine()) != null) {

					System.out.println(String.valueOf(data));
				}

				if (hSet11.get("총합") > hSet22.get("총합")) {
					System.out.println("플레이어1가 이겼습니다");
				} else if (hSet11.get("총합") == hSet22.get("총합")) {
					System.out.println("비겼습니다");
				} else {
					System.out.println("플레이어2가 이겼습니다");
				}

				System.out.println("게임 종료");
				br.close();
				new FileOutputStream("C:/temp/" + "ScoreOf.txt").close();
				break;
			}
			System.out.println("다음 상대 차례입니다. 주사위를 던지세요 ");
		}
		bw.close();
		sc.close();
	}
}
