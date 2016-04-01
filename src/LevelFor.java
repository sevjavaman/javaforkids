
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
import javax.swing.JOptionPane;
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
//94- ширина, 72 - высота
		ImageIcon i10 = new ImageIcon(getClass().getResource("img/java-duke-teaching.png"));
		Image im10=i10.getImage();
		g.drawImage(im10, 75, 75, 75, 75, null);

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
		g.drawString("for(int i = 0; i < 9; i++) System.out.print(i);", 175, 325);

		if(check == 1){
			g.setColor(Color.green);
			g.setFont(BigFontTR);
			g.drawString("Молодец! Ты научился пользоваться циклом for!", 50, 375);
			//LevelForTest lft = new LevelForTest();
			//lft.main(check);
			   JPanel jPanel1 = new javax.swing.JPanel(){
				    public void paint(Graphics g) {
				        super.paint(g);
				        ImageIcon i10 = new ImageIcon(getClass().getResource("img/null.png"));
						Image im10=i10.getImage();
						g.drawImage(im10, 1, 1, 200, 200, null);

						ImageIcon i11 = new ImageIcon(getClass().getResource("img/1.png"));
						Image im11=i11.getImage();
						g.drawImage(im11, 201, 1, 200, 200, null);

						ImageIcon i12 = new ImageIcon(getClass().getResource("img/2.png"));
			    		Image im12=i12.getImage();
			    		g.drawImage(im12, 401, 1, 200, 200, null);

			    		ImageIcon i13 = new ImageIcon(getClass().getResource("img/3.png"));
			    		Image im13=i13.getImage();
			    		g.drawImage(im13, 1, 201, 200, 200, null);

			    		ImageIcon i14 = new ImageIcon(getClass().getResource("img/4.png"));
			    		Image im14=i14.getImage();
			    		g.drawImage(im14, 201, 201, 200, 200, null);

			    		ImageIcon i15 = new ImageIcon(getClass().getResource("img/5.jpg"));
			    		Image im15=i15.getImage();
			    		g.drawImage(im15, 401, 201, 200, 200, null);

			    		ImageIcon i16 = new ImageIcon(getClass().getResource("img/6.png"));
			    		Image im16=i16.getImage();
			    		g.drawImage(im16, 1, 401, 200, 200, null);

			    		ImageIcon i17 = new ImageIcon(getClass().getResource("img/7.png"));
			    		Image im17=i17.getImage();
			    		g.drawImage(im17, 201, 401, 200, 200, null);

			    		ImageIcon i18 = new ImageIcon(getClass().getResource("img/8.png"));
			    		Image im18=i18.getImage();
			    		g.drawImage(im18, 401, 401, 200, 200, null);
				    }
				};
				JFrame frame = new JFrame("Хорошо!");
				frame.setSize(610, 630);
				frame.setResizable(false);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);

				frame.add(jPanel1);
		}if(check == 2){
			g.setFont(BigFontTR);
			g.setColor(Color.red);
			g.drawString("Ты допустил ошибку! Попробуй ещё раз!", 100, 375);
		}
	}


	class L1Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String code=Main.ta.getText();
			//проверяем код, который ввел пользователь
			if(code.equals("for(int i = 0; i < 9; i++) System.out.print(i);")){
				check=1;
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

