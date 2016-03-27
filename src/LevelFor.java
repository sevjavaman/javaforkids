import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class LevelFor implements IRenderToConvas {
int check;

public LevelFor(){
	Main.b.addActionListener(new L1Listener());
	Main.next.addActionListener(new NextListener());
}

 String well = "for(int i = 0; i < 10; i++){ System.out.println(i); }";
	@Override
	public void render(Graphics g) {
		Font BigFontTR = new Font("TimesRoman", Font.BOLD, 30); 
		ImageIcon i3 = new ImageIcon(getClass().getResource("img/java-duke-teaching.png"));
		Image im3=i3.getImage();
		g.drawImage(im3, 75, 75, 75, 75, null);
		
		g.setColor(Color.BLACK);
		g.drawString("Привет, это снова я - Дюк!", 175, 50);
		g.drawString("Сегодня я тебя научу работать с циклом "+"for", 175, 75);
		g.drawString("Для начала узнаем что такое цикл!", 175, 100);
		g.drawString("Цикл — разновидность управляющей конструкции "
				+ "в высокоуровневых языках программирования,",175, 125);
		g.drawString(" предназначенная для организации многократного "
				+ "исполнения набора инструкций.", 175, 150);	
		g.drawString("Цикл записывается следующим образом : ", 175, 175);
		g.setColor(Color.red);
		g.drawString("for (Начальное значение переменной; Логическое выражение с переменной(условие выполнения цикла);", 175, 200);
				g.drawString(" Действие над переменной, вызываемое при выполнении условия) "
				+ "{Операторы, которые будет выполнять ",175, 225);
				g.drawString("цикл, при условии ЛогВыр - true;"
						+ "}", 175, 250);
		g.setColor(Color.black);
		g.drawString("Теперь попробуй записать следующее выражение : ", 175, 275);
		g.setColor(Color.DARK_GRAY);
		g.setFont(BigFontTR);
		g.drawString("for(int i = 0; i < 10; i++) System.out.print(i);", 175, 325);
		
		if(check == 1){
			g.setColor(Color.green);
			g.setFont(BigFontTR);
			g.drawString("Молодец! Ты научился пользоваться циклом for!", 50, 375);
		}if(check == 2){
			g.setFont(BigFontTR);
			g.setColor(Color.red);
			g.drawString("Ты допустил ошибку! Попробуй ещё раз!", 100, 375);
		}
	}
	class L1Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String code=Main.ta.getText();
			//проверяем код, который ввел пользователь
			if(code.equals("for(int i = 0; i < 10; i++) System.out.print(i);")){
				check=1;
				JFrame frameResult = new JFrame("Результат выполнения цикла.");
				frameResult.setSize(250, 150);
				frameResult.setVisible(true);
				frameResult.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				JPanel pn1 = new JPanel();
				GridLayout gbl = new GridLayout(1, 1);
				pn1.setLayout(gbl);
				
				JLabel label = new JLabel();
				label.setText("Результат цикла : 12345678910");
				
				pn1.add(label);
				frameResult.add(pn1);
				Main.gui.repaint();
			}else{
				check=2;
				Main.gui.repaint();
			}
		}
		
	}
	class NextListener implements ActionListener{

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

