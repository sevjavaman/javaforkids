import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
//�����, � ������� ����������� ������ ������
public class Level2 implements IRenderToConvas{
	int check;
	
	Level2(){
		Main.b.addActionListener(new L1Listener());
	}

	public void render(Graphics g){
		ImageIcon i3 = new ImageIcon(getClass().getResource("img/duke_joker.png"));
		Image im3=i3.getImage();
		g.drawImage(im3, 125, 50, 50, 50, null);
		
		g.setColor(Color.black);
		g.drawString("������, ���� ����� ���!", 230, 50);
		g.drawString("������������ �� ����!", 230, 100);
		g.drawString("��� ����� ������ ���: System.out.print(\"������!\")", 230, 150);
		
		if(check==1){
			g.setColor(Color.red);
			g.drawString("������!", 230, 300);
			g.setColor(Color.black);
			g.drawString("�������! �� �������� �������� ���������� �� �����!", 260, 300);
		}else{
		if(check==2){
			g.drawString("� ���� �������� ������!", 260, 300);
		}
		}
	}
	
	class L1Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String code=Main.ta.getText();
			//��������� ���, ������� ���� ������������
			if(code.equals("System.out.print(\"������!\")")){
				check=1;
				Main.gui.repaint();
			}else{
				check=2;
				Main.gui.repaint();
			}
			
		}
		
	}
	
	}
