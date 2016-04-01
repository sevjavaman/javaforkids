
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
//94- ������, 72 - ������
		ImageIcon i10 = new ImageIcon(getClass().getResource("img/java-duke-teaching.png"));
		Image im10=i10.getImage();
		g.drawImage(im10, 75, 75, 75, 75, null);

		g.setColor(Color.BLACK);
		g.drawString("������, ��� ����� � - ���!", 175, 50);
		g.drawString("������� � ���� ����� �������� � ������ "+"for", 175, 75);
		g.drawString("��� ������ ������ ��� ����� ����!", 175, 100);
		g.drawString("���� � ������������� ����������� ����������� "
				+ "� ��������������� ������ ����������������,",175, 125);
		g.drawString(" ��������������� ��� ����������� ������������� "
				+ "���������� ������ ����������.", 175, 150);
		g.drawString("���� ������������ ��������� ������� : ", 175, 175);
		g.setColor(Color.red);
		g.drawString("for (��������� �������� ����������; ���������� ��������� � ����������(������� ���������� �����);", 175, 200);
				g.drawString(" �������� ��� ����������, ���������� ��� ���������� �������) "
				+ "{���������, ������� ����� ��������� ",175, 225);
				g.drawString("����, ��� ������� ������ - true;"
						+ "}", 175, 250);
		g.setColor(Color.black);
		g.drawString("������ �������� �������� ��������� ��������� : ", 175, 275);
		g.setColor(Color.DARK_GRAY);
		g.setFont(BigFontTR);
		g.drawString("for(int i = 0; i < 9; i++) System.out.print(i);", 175, 325);

		if(check == 1){
			g.setColor(Color.green);
			g.setFont(BigFontTR);
			g.drawString("�������! �� �������� ������������ ������ for!", 50, 375);
			LevelForTest lft = new LevelForTest();
			lft.main(check);
		}if(check == 2){
			g.setFont(BigFontTR);
			g.setColor(Color.red);
			g.drawString("�� �������� ������! �������� ��� ���!", 100, 375);
		}
	}


	class L1Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String code=Main.ta.getText();
			//��������� ���, ������� ���� ������������
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
			//������� ��, ��� ���� ����������
			Main.gui.removeRenders();
			Level2 l2=new Level2();
			//������ 1-� �������
			Main.gui.addRender(l2);
			Main.gui.repaint();

		}

	}
}

