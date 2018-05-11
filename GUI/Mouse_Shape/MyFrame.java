import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*;

public class MyFrame extends JFrame	{
	MyComponent mc = new MyComponent();;
	private int x,y;

	public MyFrame(){
		setTitle("Draw Shape");
		setSize(500,500);
		setVisible(true);
		mc.addMouseMotionListener(new MouseAdapter(){

			@Override
			public void mouseDragged(MouseEvent e){
				x = e.getX();
				y = e.getY();
				mc.setXY(x,y);
				repaint();
			}

		});

		//mc.addMouseMotionListener(this);
		add(mc);
	}
}

class MyComponent extends JComponent {
		private int x,y;
		private ArrayList<Point> al = new ArrayList<Point>();

		public void setXY(int x,int y){
			Point p = new Point(x,y);
			al.add(p);
		}

		@Override
		public void paintComponent(Graphics g){
			Graphics2D g2d = (Graphics2D )g;
			//Ellipse2D circle = new Ellipse2D.FLOAT(12,12,24,24);
			g2d.setColor(Color.RED);
			for(Point p:al)
				g2d.draw(new Ellipse2D.Double(p.getX(),p.getY(),8,8));
			
		}

}
