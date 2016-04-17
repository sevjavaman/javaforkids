import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;
//класс, в котором происходит рисование
public class Gui extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//список объектов для отрисовки
	@SuppressWarnings("unchecked")
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
