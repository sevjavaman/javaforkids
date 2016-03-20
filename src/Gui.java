import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//класс, в котором происходит рисование
public class Gui extends JPanel{
	
	//список объектов для отрисовки
	ArrayList<IRenderToConvas> renders = new <IRenderToConvas>ArrayList();
	//добавить объект для отрисовки
	public void addRender(IRenderToConvas render) {
        renders.add(render);
    }
	//очистить список для отрисовки
	public void removeRenders() {
        renders.clear();
    } 
	
	public void paintComponent(Graphics g){
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
        for(IRenderToConvas render : renders) {
            render.render(g);
        }
	}

}
