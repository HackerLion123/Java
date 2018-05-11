import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;
//<applet code=beeam width=400 height=400></applet>
public class beeam extends Applet implements MouseListener
{
  TextField t1,t2,t3;
  Button b1;
  CheckboxGroup cg;
  Checkbox c1,c2,c3;
  Choice ch1,ch2;
  Label l1;
  String a,b;
  int res,flag=0;
  int Money;
  public void init()
  {
  l1=new Label("Money");
  add(l1);
  t1=new TextField(20);
  add(t1);
  t1.addTextListener(new TextListener(){
  public void textValueChanged(TextEvent te)
  {
    Money=Integer.parseInt(t1.getText());
  }
  });
  l1=new Label("pwd");
  add(l1);
  //setBackground(Color.RED);
  t2=new TextField(20);
  t3=new TextField(20);
  add(t2);
  l1=new Label("cpwd");
  add(l1);
  add(t3);
  t2.setEchoCharacter('*');
  t3.setEchoCharacter('*');
  t2.addTextListener(new TextListener(){
  public void textValueChanged(TextEvent te)
  {
    //System.out.println(t2.getText());
    a=t2.getText();
    t3.setText(a);
    //repaint();
  }
  });  
  cg=new CheckboxGroup();
  c1=new Checkbox("Red",cg,false);
  c2=new Checkbox("Blue",cg,false);
  add(c1);
  add(c2);
  c1.addItemListener(new ItemListener(){
	  public void itemStateChanged(ItemEvent ie)
	  {
		  setBackground(Color.RED);
	  }
  });
   c2.addItemListener(new ItemListener(){
	  public void itemStateChanged(ItemEvent ie)
	  {
		  setBackground(Color.BLUE);
	  }
  });
  ch1=new Choice();
  ch1.add("Rupee");
  ch1.add("Dollar");
  add(ch1);
  ch2=new Choice();
  ch2.add("Dollar");
  ch2.add("Rupee");
  add(ch2);
  c3=new Checkbox("I agree the terms and condition");
  add(c3);
  b1=new Button("Submit");
  add(b1);
  b1.setEnabled(false);
  b1.setBackground(Color.BLUE);
  c3.addItemListener(new ItemListener(){
	  public void itemStateChanged(ItemEvent ie)
	  {
		  b1.setEnabled(true);
	  }
  });
  b1.addMouseListener(this);
  b1.addActionListener(new ActionListener(){
	  public void actionPerformed(ActionEvent ae)
	  {
		  a=ch1.getSelectedItem();
		  b=ch2.getSelectedItem();
		  if(a.equals(b))
	         res=Money;
          else if(a.equals("Rupee"))
		    res=Money*66;
		  else if(a.equals("Dollar"))
	        res=Money/66;
		  flag=1;
		  repaint();
	  }
  });
  }
  public void mouseEntered(MouseEvent me)
  {
	  b1.setBackground(Color.GREEN);
  }
  public void mouseExited(MouseEvent me)
  {
	  b1.setBackground(Color.BLUE);
  }
  public void mousePressed(MouseEvent me)
  {
	  
  }
  public void mouseClicked(MouseEvent me)
  {
	  
  }
  public void mouseReleased(MouseEvent me)
  {
	  
  }
  public void paint(Graphics g)
  {
      if(flag==1)
		g.drawString("Your Answer is.."+res,100,150);
  }
}

