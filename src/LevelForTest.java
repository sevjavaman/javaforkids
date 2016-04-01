import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.istack.internal.logging.Logger;
public class LevelForTest {

	public void main(int check) {
		// TODO Auto-generated method stub
		   JPanel jPanel1 = new javax.swing.JPanel(){
			    public void paint(Graphics g) {
			        super.paint(g);
			        ImageIcon i10 = new ImageIcon(getClass().getResource("img/null.png"));
					Image im10=i10.getImage();
					g.drawImage(im10, 1, 1, 200, 200, null);
					
					ImageIcon i11 = new ImageIcon(getClass().getResource("img/1.png"));
					Image im11=i11.getImage();
					g.drawImage(im11, 201, 1, 200, 200, null);
					
					ImageIcon i12 = new ImageIcon(getClass().getResource("img/2.png"));
		    		Image im12=i12.getImage();
		    		g.drawImage(im12, 401, 1, 200, 200, null);
		    		
		    		ImageIcon i13 = new ImageIcon(getClass().getResource("img/3.png"));
		    		Image im13=i13.getImage();
		    		g.drawImage(im13, 1, 201, 200, 200, null);
		    		
		    		ImageIcon i14 = new ImageIcon(getClass().getResource("img/4.png"));
		    		Image im14=i14.getImage();
		    		g.drawImage(im14, 201, 201, 200, 200, null);
		    		
		    		ImageIcon i15 = new ImageIcon(getClass().getResource("img/5.jpg"));
		    		Image im15=i15.getImage();
		    		g.drawImage(im15, 401, 201, 200, 200, null);
		    		
		    		ImageIcon i16 = new ImageIcon(getClass().getResource("img/6.png"));
		    		Image im16=i16.getImage();
		    		g.drawImage(im16, 1, 401, 200, 200, null);
		    		
		    		ImageIcon i17 = new ImageIcon(getClass().getResource("img/7.png"));
		    		Image im17=i17.getImage();
		    		g.drawImage(im17, 201, 401, 200, 200, null);
		    		
		    		ImageIcon i18 = new ImageIcon(getClass().getResource("img/8.png"));
		    		Image im18=i18.getImage();
		    		g.drawImage(im18, 401, 401, 200, 200, null);
			    }
			};
			JFrame frame = new JFrame("Хорошо!");
			frame.setSize(610, 630);
			frame.setResizable(false);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setVisible(true);
			
			frame.add(jPanel1);
	}
	
}
