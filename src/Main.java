import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main{
	static Gui gui = new Gui();
	int levelNumber = 1;
	//кнопка для отправки кода
	static JButton b;
	//кнопка для перехода далее
	static JButton next;
	//поле для ввода кода
	static JTextArea ta;

	public static void main(String[] args){
		new Main();
	}

	Main(){
		JFrame f = new JFrame("Java для школьников");
		f.setSize(850, 650);

		GridBagLayout gbl = new GridBagLayout();
		f.setLayout(gbl);
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridheight = 6;
		c.gridwidth = 6;
		c.insets = new Insets(5, 5, 5, 5);

		c.gridx = 0;
		c.gridy = 0;
		gui.setPreferredSize(new Dimension(800, 500));
		gui.setMinimumSize(new Dimension(800, 500));
		gbl.setConstraints(gui, c);
		f.add(gui);

		c.gridx = 0;
		c.gridy = 6;
		c.gridheight = 2;
		c.gridwidth = 6;
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		JLabel l = new JLabel("Напиши код:");
		ta = new JTextArea(5, 30);
		b = new JButton("Отправить");
		next = new JButton("Далее");

		p.add(l);
		p.add(ta);
		p.add(b);
		p.add(next);

		gbl.setConstraints(p, c);
		f.add(p);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		Level25 l25 = new Level25();
		//рисуем 1-й уровень
		gui.addRender(l25);
		gui.repaint();
	}

}

