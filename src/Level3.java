import java.util.Scanner;

public class Level3 {

	Scanner myScanner = new Scanner(System.in);
	String operation1 = "Scanner myScanner = new Scanner(System.in);";
	String operation2 = "String myString = myScanner.next();";

	public Level3() {

		System.out.println("������ � ����� ���� ������� ���������� Scanner.");
		while (true) {
			System.out.println("������ " + operation1);
			String myString = myScanner.nextLine();
			if (myString.equals(operation1)) {
				System.out.println("�������!");
				System.out.println("�� ������(�) ������ ��������� �������� ������ ���������.");
				System.out.println("������ ������ ���� ������� ������� ����� ���������� �����������\n");
				break;
			} else {
				System.out.println("�������� ��� ���.");
			}
		}
		while (true) {
			System.out.println("������ " + operation2);
			String myString = myScanner.nextLine();
			if (myString.equals(operation2)) {
				System.out.println("�������!");
				System.out.println("������ �� ������ ���������.");
				break;
			} else {
				System.out.println("�������� ��� ���.");
			}
		}
	}

	public static void main(String[] args) {
		Level3 myLevel3 = new Level3();
	}

}
