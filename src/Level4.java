
import java.util.Scanner;

public class Level4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ����������� ����,�������!");
		System.out.println(" ������� � ������������ � ����� � �������� � �� ������� ��� � ���, ��� ������������ ��� ������ (� ������, ��� ��������� � ��������� ������� �� java.");
		System.out.println("��� � � ����� ����� ����������������, �������� ����� �������� �� �������� if - then - else. � eclipse � ����� if �� ����� ���������� �������(��������, �� �������� ��� 200 ������), ������� ����� ���� ����� ���,��� � ����� ������, �������.  ");
		System.out.println("� ����� then ����������� ��������, ������� ����������,���� ���������� ��������� ��������. ��������, ������� ������,����� ������, ����� �������. ");
		System.out.println(" � ����� else �� ��������� ��, ��� ����������� � ������ ����,����� ���� ��������� �����.");
		System.out.println(" � ������� ������������ ����� ������,������ � ����� � �.�.");
		System.out.println(" ��������, �>b, 12>9,13*2 = 25+1");
		System.out.println("��� ��� �������� ����������� ������� � java:  ");
		System.out.println("if (���������� ���������(13>7)) { ");
		System.out.println(" System.out.print(text }       ");
		System.out.println("  else{ ");
		System.out.println("     }");
		System.out.println("� ������ �������� �������� �������� �����������, ��� ����������� ������� a>b � � ������, ���� ��� - ������- ������� �� ����� ������� � ������ �. ");
		String s = "if(a > b){ System.out.println";
		int p1;
		int p2;
		p1 = s.indexOf("\"");
		p2 = s.lastIndexOf("\"");
		
		String operator = s.substring(0,p1+1 )+s.substring(p2,s.length());
		String value = s.substring(p1 +1,p2);
		System.out.println(operator+" " +value);
 if (operator.equals("System.out.print(\"\");") ) {
	 System.out.println("�� �����!");
 }
 else{
	 System.out.println("���������� ��� ���.");
	 
	 
	 
 }
	}

}
