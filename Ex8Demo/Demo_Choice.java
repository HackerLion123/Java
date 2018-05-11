import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=Demo_Choice.class width=200 height=200>
</applet>*/
public class Demo_Choice extends Applet implements ItemListener
{
   Choice c1;
   String s="";
   public void init()
   {
     c1=new Choice();
     c1.add("CSE");
     c1.add("ECE");
     c1.add("EEE");
     c1.add("EIE");
     c1.add("Mech");
	 add(c1);
     c1.addItemListener(this);//to listen the ItemEvent
   }
   public void itemStateChanged(ItemEvent ae)
   {
     System.out.println("You have Selected :"+c1.getSelectedItem());
     s="You have selected :"+c1.getSelectedItem();
     repaint();
   }
   public void paint(Graphics g)
   {
     g.drawString(s,50,100);
   }
}

