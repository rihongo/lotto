import java.util.Random;

public class Lotto {

	/**
	 * @param args
	 */
	
	Random num = new Random();

	public static void main(String[] args) {

		new Lotto().printLotto();

	}

	public void printLotto() {
		
		for (int i = 0; i < 6; i++) {

			System.out.println(getNumber());
		}
		
	}
	private int getNumber() {

		return num.nextInt(45) + 1;
	}

}
