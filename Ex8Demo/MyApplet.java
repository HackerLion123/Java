import java.awt.*;
import java.applet.*;
public class MyApplet extends Applet
{
 int ini;
 int st;
 int sop;
 int destr;
 int pain;
  public void init()
  {
   ini++;
   System.out.println("init");
  }
  public void start()
  {
   st++;
   System.out.println("start");
  }
  public void paint(Graphics g)
  {
   pain++;
   System.out.println("init "+ini+" start "+st+" paint "+pain+" stop"+sop+" destr"+destr);
  }
  public void destroy()
  {
   destr++;
   System.out.println("destroy");
  }  
  public void stop()
  {
   sop++;
   System.out.println("stop");
  } 
} 
//<applet code=MyApplet width=500 height=200></applet>