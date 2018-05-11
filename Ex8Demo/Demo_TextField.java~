import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=Demo_TextField.class width=200 height=200>
</applet>*/
public class Demo_TextField extends Applet implements ActionListener,TextListener
{
  TextField t1,t2;
  String s="";
  Label l1,l2;
  public void init()
  {
  l1=new Label("TextEvent");
  l2=new Label("ActionEvent");
    t1=new TextField(20);
    t2=new TextField(20);
    add(l1);
    add(t1);
    t1.addTextListener(this);//to listen the TextEvent
    add(l2);
    add(t2);
    t2.setEchoCharacter('*');
    t2.addActionListener(this);//to listen the ActionEvent
  }
  public void actionPerformed(ActionEvent ae)
  {
    System.out.println(t2.getText());
    s=t2.getText();
    repaint();
  }
  public void textValueChanged(TextEvent te)
  {
    s=t1.getText();
    repaint();
  }
  public void paint(Graphics g)
  {
    g.drawString(s,100,190);
  }
}

