import java.util.Scanner;

public class Level3 {

	Scanner myScanner = new Scanner(System.in);
	String operation1 = "Scanner myScanner = new Scanner(System.in);";
	String operation2 = "String myString = myScanner.next();";

	public Level3() {

		System.out.println("Сейчас я научу тебя слушать припромощи Scanner.");
		while (true) {
			System.out.println("Напиши " + operation1);
			String myString = myScanner.nextLine();
			if (myString.equals(operation1)) {
				System.out.println("Молодец!");
				System.out.println("Ты создал(а) объект припомощи которого будешь считывать.");
				System.out.println("Теперь напиши саму строчку которая будет заниматься считыванием\n");
				break;
			} else {
				System.out.println("Попробуй еще раз.");
			}
		}
		while (true) {
			System.out.println("Напиши " + operation2);
			String myString = myScanner.nextLine();
			if (myString.equals(operation2)) {
				System.out.println("Молодец!");
				System.out.println("Теперь ты умеешь считывать.");
				break;
			} else {
				System.out.println("Попробуй еще раз.");
			}
		}
	}

	public static void main(String[] args) {
		Level3 myLevel3 = new Level3();
	}

}
