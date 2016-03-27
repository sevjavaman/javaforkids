import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;



public class Level25 implements IRenderToConvas{
	
	short result = 0;
	
	public Level25() {
		Main.b.addActionListener(new L1Listener());
		Main.next.addActionListener(new NextListener());
	}
	
	@Override
	public void render(Graphics g) {
		ImageIcon i3 = new ImageIcon(getClass().getResource("img/Duke_Wave.png"));
		Image im3=i3.getImage();
		g.drawImage(im3, 125, 50, 50, 50, null);
		
		g.setColor(Color.black);
		g.drawString("Привет, это Дюк!", 230, 50);
		g.drawString("Сегодня я тебе расскажу, что такое переменные и зачем они нужны", 230, 75);
		g.drawString("Переменная - это контейнер для хранения какой-либо информации(это может быть цифры, буквы, строки и т.д)", 230, 100);
		g.drawString("У каждой переменной в Java должно быть имя и тип ", 230, 125);
		g.drawString("Переменные объявляються таким не сложным образом: ", 230, 150);
		g.setColor(Color.red);
		g.drawString("[тип переменной] [имя переменной] = [значение]", 230, 175);
		g.setColor(Color.black);
		g.drawString("Например: int a = 10", 230, 200);
		g.drawString("В Java числа деляться на целочисленные и с плавающей точкой", 230, 225);
		g.drawString("Так тип int соответсвует целочисленным числам, а float или double соответствует числам с плавающей точкой ", 230, 250);
		g.drawString("Тип char - символы", 230, 275);
		g.drawString("String - строка", 230, 300);
		g.drawString("Попробуй составить переменную с типом String и значением \"Hello\"", 230, 325);
		if(result == 1){
			g.setColor(Color.green);
			g.drawString("Молодец", 230, 350);
		}else if(result == 2){
			g.setColor(Color.red);
			g.drawString("Что-то не так", 230, 350);
		}
		}
	
		class L1Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String code=Main.ta.getText();
			
			String[] codeMassive = code.split(" ");
			
			if(codeMassive[0].equals("String")){
				if(codeMassive[3].equals("\"Hello\";") || codeMassive[codeMassive.length-1].equals(";")){
					result= 1;
				} else{
					result = 2;
				}
			}else{
				result = 2;
			}
			
		}
		}
		
		class NextListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//стираем то, что было нарисовано
				Main.gui.removeRenders();
				Level2 l2=new Level2();
				//рисуем 1-й уровень
				Main.gui.addRender(l2);
				Main.gui.repaint();
				
			}
			
		}
		
	
}
