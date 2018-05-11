import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Demo_Mouse extends Applet implements MouseListener
{
/*
 <Applet code=Demo_Mouse width=500 height=500> </Applet>
*/
   String s="";
     int x=0,y=0;
   public void init()
   {
       addMouseListener(this);
   }
   public void paint(Graphics g)
   {	g.drawString(s,x,y);
	showStatus(" x = "+x+" y = "+y+" "+s);
   }
   public void mouseClicked(MouseEvent me)
   {
        x=me.getX();y=me.getY();
	s="MouseClicked";
	repaint();
   }
   public void mousePressed(MouseEvent me)
   {
        x=me.getX();y=me.getY();
        s="MousePressed";
        repaint();

   }
   public void mouseReleased(MouseEvent me)
   {
        x=me.getX();y=me.getY();
        s="Mouse released";
        repaint();

   }
   public void mouseEntered(MouseEvent me)
   {
        x=me.getX();y=me.getY();
        s="MouseEntered";
        repaint();
   }
   public void mouseExited(MouseEvent me)
   {
        x=me.getX();y=me.getY();
        s="MouseExited";
        repaint();
   }
}

