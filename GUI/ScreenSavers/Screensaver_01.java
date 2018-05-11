import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Screensaver_01 extends JFrame{
	Dimension dim;
	Toolkit tk;
	MyComponent cp;
	JPanel p1;
	public Screensaver_01() throws Exception{
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
		String []list = tk.getFontList();	
		g.setColor(Color.GREEN);	
		//g2d.drawString("Hello World",100,200);

		//for(int i = 8; i < dim.getWidth(); i = i + 5){
			for(int j = 0; j < dim.getWidth(); j = j+30){
				g2d.setColor(Color.GREEN);
				//g2d.setFont(Font.d0ecode(list[rand.nextInt(list.length)]));
				Font f1 = new Font(list[rand.nextInt(list.length)],Font.PLAIN,rand.nextInt(23));
				g2d.setFont(f1);
				g2d.drawString("Hello World!",j,j);
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException e){
					System.out.println("Error");
				}
				repaint();
			} 
		//}
	/*	for(int i = 0; i < (int )dim.getHeight()/2; i = i + 15){
				g2d.drawString("Hello",i,i);
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException e){
					System.out.println("Error");
				}
				repaint();
		} */
	/*	for(int i = (int )dim.getHeight(); i > 0; i = i - 15){
				g2d.drawString("Hello",i*2,i);
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException e){
					System.out.println("Error");
				}
				repaint();
		} */
	}
}
