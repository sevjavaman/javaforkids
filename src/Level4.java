
import java.util.Scanner;

public class Level4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Приветствую тебя,дружище!");
		System.out.println(" Сегодня я повстречался с магом и чародеем и он поведал мне о том, как зарабатывать ещё больше (и заодно, как создавать и проверять условия на java.");
		System.out.println("Как и в любом языке программирования, условные циклы строятся по принципу if - then - else. В eclipse в части if мы задаём логическое условие(например, ты задолжал мне 200 рублей), которое может быть ложью или,как в нашем случае, правдой.  ");
		System.out.println("В части then выполняются действия, которые происходят,если логическое выражение правдиво. Например, вернуть деньги,взять кредит, взять ипотеку. ");
		System.out.println(" В части else мы выполняем то, что выполняется в случае того,когда наше выражение ложно.");
		System.out.println(" В условии используются знаки больше,меньше и равно и т.д.");
		System.out.println(" Например, а>b, 12>9,13*2 = 25+1");
		System.out.println("Вот так выглядит конструкция условия в java:  ");
		System.out.println("if (логическое выражение(13>7)) { ");
		System.out.println(" System.out.print(text }       ");
		System.out.println("  else{ ");
		System.out.println("     }");
		System.out.println("А теперь попробуй написать условную конструкцию, где проверяется условие a>b и в случае, если это - правда- выводит на экран надпись а больше б. ");
		String s = "if(a > b){ System.out.println";
		int p1;
		int p2;
		p1 = s.indexOf("\"");
		p2 = s.lastIndexOf("\"");
		
		String operator = s.substring(0,p1+1 )+s.substring(p2,s.length());
		String value = s.substring(p1 +1,p2);
		System.out.println(operator+" " +value);
 if (operator.equals("System.out.print(\"\");") ) {
	 System.out.println("Всё верно!");
 }
 else{
	 System.out.println("Попробуйте ещё раз.");
	 
	 
	 
 }
	}

}
