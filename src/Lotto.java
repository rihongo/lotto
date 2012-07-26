import java.util.Random;

public class Lotto {

	/**
	 * @param args
	 */
	
	Random num = new Random();

	public static void main(String[] args) {

		new Lotto().getLotto();

	}

	public int[] getLotto() {
		int []numbers = new int[6];
		for (int i = 0; i < 6; i++) {

			numbers[i] = getNumber();
		}
		return numbers;
		
	}
	private int getNumber() {

		return num.nextInt(45) + 1;
	}

}
