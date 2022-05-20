package yacht;

public class Yacht_Score{  //class Turn
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

	public Yacht_Score(int one, int two, int three, int four, int five, int six) {  
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
