import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
//�����, � ������� ����������� ������ ������
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
		g.drawString("������, ��� ����� �!", 230, 50);
		g.drawString("������� �� ������������� � ���������� switch!", 230, 100);
		g.drawString("switch(���������������������){", 230, 150);
		g.drawString("    case ����������1: ", 230, 170);
		g.drawString("        ��������;", 230, 190);
		g.drawString("        break;", 230, 210);
		g.drawString("    case ����������2: ", 230, 230);
		g.drawString("        ��������;", 230, 250);
		g.drawString("        break;}", 230, 270);
		
		g.drawString("�� � ������ ������ ��� ���������� � ���������� ����� ����.", 230, 320);
		g.drawString("� ���� ������ \"����\" ��� \"�����\"(String string).", 230, 370);
		g.drawString("� ���� � ������ ����, �� ������ �������� \"�����!\"", 230, 390);
		g.drawString("� ���� ����� - \"�����!\"", 230, 410);
		
		if(check==1){
			g.setColor(Color.green);
			g.drawString("�������! �� �������� �������� ������������ ���������� switch", 230, 430);
		}else{
		if(check==2){
			g.drawString("� ���� �������� ������!", 260, 300);
		}
		}
	}
	
	class L1Listener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			String code=Main.ta.getText();
			//��������� ���, ������� ���� ������������
			if(code.equals("switch(string){\ncase \"����\":\nSystem.out.println(\"�����!\");\nbreak;\ncase \"�����\":\nSystem.out.println(\"�����!\");\nbreak;\n}")){
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
			//������� ��, ��� ���� ����������
			Main.gui.removeRenders();
			Level2 l2=new Level2();
			//������ 1-� �������
			Main.gui.addRender(l2);
			Main.gui.repaint();
			
		}
		
	}
	
	}
