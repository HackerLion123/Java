import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Screensaver_02 extends JFrame{
	Dimension dim;
	Toolkit tk;
	MyComponent cp;
	JPanel p1;
	public Screensaver_02() throws Exception{
		setTitle("My Screensaver 01");
		setVisible(true);
		tk = Toolkit.getDefaultToolkit();
		dim =  tk.getScreenSize();
		cp = new MyComponent();
		p1 = new JPanel(new GridLayout(1,1));
		setSize(dim);
		p1.setBackground(Color.BLACK);
		p1.add(cp);
		add(p1);
	}
}

class MyComponent extends JComponent{
	Dimension dim;
	Toolkit tk;
	Random rand;
	
	public MyComponent() throws Exception{
		rand = new Random();
	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D )g;

		//rand = new Random();
		tk = Toolkit.getDefaultToolkit();
		dim =  tk.getScreenSize();
		//String []list = tk.getFontList();
		GraphicsEnvironment local = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String []fonts = local.getAvailableFontFamilyNames();
		//Font []list = local.getAllFonts();	
		g2d.setColor(Color.GREEN);
		int x = rand.nextInt((int)dim.getWidth());
		int y = rand.nextInt((int)dim.getHeight());
		Font f1 = new Font(fonts[rand.nextInt(fonts.length)],Font.PLAIN,60);
		try{
				Thread.sleep(1000);
				for(int i = 0; i < 6; i ++){
					g2d.setFont(f1);
					g2d.drawString("Matrix",x,y);
					Thread.sleep(100);
			        /*Font.decode(list[rand.nextInt(list.length)]);*/
					x = rand.nextInt(((int)dim.getWidth())-10);
					y = rand.nextInt((int)dim.getHeight()-10);
				}
				repaint();				
		}
		catch(InterruptedException e){
				System.out.println("Error");
		}
	}
}
