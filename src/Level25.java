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
		g.drawString("������, ��� ���!", 230, 50);
		g.drawString("������� � ���� ��������, ��� ����� ���������� � ����� ��� �����", 230, 75);
		g.drawString("���������� - ��� ��������� ��� �������� �����-���� ����������(��� ����� ���� �����, �����, ������ � �.�)", 230, 100);
		g.drawString("� ������ ���������� � Java ������ ���� ��� � ��� ", 230, 125);
		g.drawString("���������� ������������ ����� �� ������� �������: ", 230, 150);
		g.setColor(Color.red);
		g.drawString("[��� ����������] [��� ����������] = [��������]", 230, 175);
		g.setColor(Color.black);
		g.drawString("��������: int a = 10", 230, 200);
		g.drawString("� Java ����� �������� �� ������������� � � ��������� ������", 230, 225);
		g.drawString("��� ��� int ������������ ������������� ������, � float ��� double ������������� ������ � ��������� ������ ", 230, 250);
		g.drawString("��� char - �������", 230, 275);
		g.drawString("String - ������", 230, 300);
		g.drawString("�������� ��������� ���������� � ����� String � ��������� \"Hello\"", 230, 325);
		if(result == 1){
			g.setColor(Color.green);
			g.drawString("�������", 230, 350);
		}else if(result == 2){
			g.setColor(Color.red);
			g.drawString("���-�� �� ���", 230, 350);
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
				//������� ��, ��� ���� ����������
				Main.gui.removeRenders();
				Level2 l2=new Level2();
				//������ 1-� �������
				Main.gui.addRender(l2);
				Main.gui.repaint();
				
			}
			
		}
		
	
}
