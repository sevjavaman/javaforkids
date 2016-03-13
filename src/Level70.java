import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
//класс, в котором реализуется логика уровня
public class Level70 implements IRenderToConvas{
	int check;
	
	Level70(){
		Main.b.addActionListener(new L1Listener());
		Main.next.addActionListener(new NextListener());
	}

	public void render(Graphics g){
		ImageIcon i3 = new ImageIcon(getClass().getResource("img/Duke_Wave.png"));
		Image im3=i3.getImage();
		g.drawImage(im3, 125, 50, 50, 50, null);
		
		g.setColor(Color.black);
		g.drawString("Привет, это опять я!", 230, 50);
		g.drawString("Сегодня ты познакомишься с оператором switch!", 230, 100);
		g.drawString("switch(ВыражениеДляСравнения){", 230, 150);
		g.drawString("    case Совпадение1: ", 230, 170);
		g.drawString("        оператор;", 230, 190);
		g.drawString("        break;", 230, 210);
		g.drawString("    case Совпадение2: ", 230, 230);
		g.drawString("        оператор;", 230, 250);
		g.drawString("        break;}", 230, 270);
		
		g.drawString("Ну а теперь помоги мне пожайлусто с написанием одной игры.", 230, 320);
		g.drawString("Я тебе говорю \"лови\" или \"кидай\"(String string).", 230, 370);
		g.drawString("И если я сказал лови, ты должен ответить \"ловлю!\"", 230, 390);
		g.drawString("А если кидай - \"кидаю!\"", 230, 410);
		
		if(check==1){
			g.setColor(Color.green);
			g.drawString("Отлично! Ты научился выводить пользоваться оператором switch", 230, 430);
		}else{
		if(check==2){
			g.drawString("В коде допущена ошибка!", 260, 300);
		}
		}
	}
	
	class L1Listener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			String code=Main.ta.getText();
			//проверяем код, который ввел пользователь
			if(code.equals("switch(string){\ncase \"лови\":\nSystem.out.println(\"ловлю!\");\nbreak;\ncase \"кидай\":\nSystem.out.println(\"кидаю!\");\nbreak;\n}")){
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
