import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=Demo_List.class width=250 height=400>
</applet>*/
public class Demo_List extends Applet implements ItemListener,ActionListener
{
  List l1,l2;
  Label a,b;
  String s="";
  public void init()
  {
    a=new Label("ItemEvent demo");
    add(a);
    l1=new List();
    add(l1);
    l1.add("CSE");
    l1.add("ECE");
    l1.add("EEE");
    l1.add("EIE");
    l1.add("Mech");
    l1.addItemListener(this);//to listen the ItemEvent
    l2=new List(3,true);
    b=new Label("Action demo");
    add(b);
    add(l2);
    l2.add("BSNL");
    l2.add("AirTel");
    l2.add("AirVoice");
    l2.add("Aircel");
    l2.add("Vodafone");
    l2.add("Hutch");
    l2.addActionListener(this);
  }
  public void itemStateChanged(ItemEvent ae)
  {
    System.out.println("You have Selected :"+l1.getSelectedItem());
    s="You have selected :"+l1.getSelectedItem();
    repaint();
  }
  public void actionPerformed(ActionEvent ae)
  {
    System.out.println("You have Double Clicked :"+l2.getSelectedItem());
    s="You have Double clicked :"+l2.getSelectedItem();
    repaint();
  }
  public void paint(Graphics g)
  {
    g.drawString(s,50,300);
  }
}

