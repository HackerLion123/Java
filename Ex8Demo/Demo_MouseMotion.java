/****MyMousemotion*********/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code=Demo_MouseMotion width=400 height=400></applet>
public class Demo_MouseMotion extends Applet implements MouseMotionListener
{
  String s="";
  public void init()
  {
    addMouseMotionListener(this);
  }
  public void mouseDragged(MouseEvent me)
  {
    s="Mouse Dragged";
    repaint();
    showStatus("Mouse Dragged : "+me.getX()+" "+me.getY());
  }
  public void mouseMoved(MouseEvent me)
  {
    repaint();
    s="Mouse Moved";
    showStatus("Mouse moved : "+me.getX()+" "+me.getY());
  }
  public void paint(Graphics g)
  {
    g.drawString(s,50,250);
  }
}

