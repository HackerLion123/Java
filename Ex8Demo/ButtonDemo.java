import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=ButtonDemo width=400 height=400>
</applet>*/

public class ButtonDemo extends Applet implements ActionListener
{
 Button b1;
 public void init()
 {
  b1=new Button("Red");
  b1.addActionListener(this);
  add(b1);
 }
 public void actionPerformed(ActionEvent ae)
 {
  System.out.println(ae);
  setBackground(Color.RED);
 }
}

/*public class ButtonDemo extends Applet implements ActionListener
{
 Button b1;
 public void init()
 {
  b1=new Button("Red");
  b1.addActionListener(this);
  add(b1);
 }
 public void actionPerformed(ActionEvent ae)
 {
  System.out.println(ae);
  b1.setBackground(Color.RED);
 }
}
*/

/*public class ButtonDemo extends Applet implements ActionListener
{
 Button b1,b2;
 public void init()
 {
  b1=new Button("Red");
  b2=new Button("Blue");
b2.setActionCommand("ok");
  b1.addActionListener(this);b2.addActionListener(this);
  add(b1);  add(b2);
 }
 public void actionPerformed(ActionEvent ae)
 {
  System.out.println(ae);
  if(ae.getSource()==b1)
   setBackground(Color.RED);
  if(ae.getActionCommand().equals("ok"))
      setBackground(Color.BLUE);
 }
}*/
/*public class ButtonDemo extends Applet implements ActionListener
{
 Button b1,b2;
 TextField t1,t2; 
 int res=0;
 public void init()
 {
  t1=new TextField(2);
  t2=new TextField(2);
  add(t1);add(t2);
  b1=new Button("Add");
  b2=new Button("Sub");
  b1.addActionListener(this);b2.addActionListener(this);
  add(b1);  add(b2);
 }
 public void paint(Graphics g)
 {
  g.drawString("Result "+res,100,100);
 }
 public void actionPerformed(ActionEvent ae)
 {
  if(ae.getActionCommand().equals("Add"))
   res=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
  repaint();
 }
}*/
