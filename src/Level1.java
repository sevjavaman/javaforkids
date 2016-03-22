import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
//класс, в котором реализуется логика уровня
public class Level1 implements IRenderToConvas{
	int check;
	
	Level1(){
		Main.b.addActionListener(new L1Listener());
		Main.next.addActionListener(new NextListener());
	}

	public void render(Graphics g){
		ImageIcon i3 = new ImageIcon(getClass().getResource("img/Duke_Wave.png"));
		Image im3=i3.getImage();
		g.drawImage(im3, 125, 50, 50, 50, null);
		
		g.setColor(Color.black);
		g.drawString("Привет, меня зовут Дюк!", 230, 50);
		g.drawString("Поздоровайся со мной!", 230, 100);
		g.drawString("Для этого напиши код: System.out.print(\"Привет!\")", 230, 150);
		
		if(check==1){
			g.setColor(Color.red);
			g.drawString("Привет!", 230, 300);
			g.setColor(Color.black);
			g.drawString("Отлично! Ты научился выводить информацию на экран!", 260, 300);
		}else{
		if(check==2){
			g.drawString("В коде допущена ошибка!", 260, 300);
		}
		}
	}
	
	class L1Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String code=Main.ta.getText();
			//проверяем код, который ввел пользователь
			if(code.equals("System.out.print(\"Привет!\")")){
				check=1;
				Main.gui.repaint();
			}else{
				check=2;
				Main.gui.repaint();
			}
			
		}
		
	}
	
	class NextListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//стираем то, что было нарисовано
			Main.gui.removeRenders();
			Level2 l2=new Level2();
			//рисуем 2-й уровень
			Main.gui.addRender(l2);
			Main.gui.repaint();
			
		}
		
	}
	
	}
