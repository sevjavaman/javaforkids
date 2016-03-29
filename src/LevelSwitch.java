import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class LevelSwitch implements IRenderToConvas {
	boolean glowRed = false;
	boolean glowYellow = false;
	boolean glowGreen = false;

	Font font;

	public LevelSwitch(JTextArea ta, JButton b) {
		font = new Font("Arial", Font.PLAIN, 16);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check(ta.getText())){
					ta.setText("");
					b.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							switch (ta.getText()) {
							case "1":
								glowRed = !glowRed;
								glowYellow = false;
								glowGreen = false;
								break;
							case "2":
								glowRed = false;
								glowYellow = !glowYellow;
								glowGreen = false;
								break;
							case "3":
								glowRed = false;
								glowYellow = false;
								glowGreen = !glowGreen;
								break;

							}
							ta.setText("");
							ta.requestFocus();
						}
					});
				}
			}
		});
	}


	private boolean check(String str){
		String string = "switch(цвет){case1:красный;break;case2:желтый;break;case3:зеленый;break;}";
		str = str.replaceAll("(\\s|\")", "");
		str = str.toLowerCase();
		if (str.compareToIgnoreCase(string) == 0) {
			return true;
		}
		return false;
	}


	public void render(Graphics g) {
		if (glowRed) {
			g.setColor(new Color(0xffff0000));
		} else {
			g.setColor(new Color(0xff222222));
		}
		g.fillOval(100, 100, 50, 50);

		if (glowYellow) {
			g.setColor(new Color(0xffebeb00));
		} else {
			g.setColor(new Color(0xff222222));
		}
		g.fillOval(100, 175, 50, 50);

		if (glowGreen) {
			g.setColor(new Color(0xff00ff00));
		} else {
			g.setColor(new Color(0xff222222));
		}
		g.fillOval(100, 250, 50, 50);

		g.setColor(new Color(0xff000000));
		g.setFont(font);

		g.drawString("Привет!", 175, 100);
		g.drawString("Сегодня ты напишешь программу для управления светофором!", 175, 125);
		g.drawString("А для этого тебе придется познакомиться с оператором \"switch\"", 175, 150);
		g.drawString("Форма этого оператора выглядит так:", 175, 175);

		g.drawString("switch(ВыражениеДляСравнения){", 175, 200);
		g.drawString("    case Совпадение1: ", 175, 225);
		g.drawString("        оператор;", 175, 250);
		g.drawString("        break;", 175, 275);
		g.drawString("    case Совпадение2: ", 175, 300);
		g.drawString("        оператор;", 175, 325);
		g.drawString("        break;", 175, 350);
		g.drawString("}", 175, 375);

	}

	private void drawString(Graphics g, String text, int x, int y) {
		for (String line : text.split("\n"))
			g.drawString(line, x, y += g.getFontMetrics().getHeight());
	}

}
