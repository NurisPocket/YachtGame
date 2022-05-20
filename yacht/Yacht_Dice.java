package yacht;

public class Yacht_Dice implements Yacht_Categories {
	
	class MyData {
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

	public void d(int dice) {
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