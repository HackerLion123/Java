import javax.swing.*;

class  Time{
	int hr;
	int min;
	int sec;

	public Time(){
		hr = 0; 
		min = 0;
		sec = 0;
	}

	public void setHr(int a){ hr = a; }
	public void setMin(int a){ min = a;  }
	public void setSec(int a){ sec = a; }

	public int getHr(){ return hr; }
	public int getMin(){ return min; }
	public int getSec(){ return sec; }	
}

,lo9class TimeThread extends Thread{
	Time t;
	int temp;

	public void run(){
		t = new Time();
		while(true){
			try { Thread.sleep(1000); } catch(Exception e){ System.out.println(e); }
			if(t.getSec() <= 3){
				temp = t.getSec();
				temp++;
				t.setSec(temp);
			}
			if(t.getSec() > 3){
				temp = t.getMin();
				t.setSec(0);
				t.setMin(++temp);
			}
			if(t.getMin() > 3){
				temp = t.getHr();
				t.setSec(0);
				t.setMin(0);
				temp++;
				t.setHr(temp);
			}	
			System.out.println(t.getHr()+":"+t.getMin()+":"+t.getSec());	
		}
	}
}

public class DigitalCounter extends JFrame{
		JPanel p1;
		TimeThread t1;
		JLabel l1,l2,l3;

		public DigitalCounter(){
			setSize(500,200);
			setVisible(true);
			setTitle("DigitalCounter");	
			//p1 = new JPanel(new GridLayout(1,3));
			l1 = new JLabel("1");
			l2 = new JLabel("1");
			l3 = new JLabel("1");

			p1.add(l1);
			p1.add(l2);
			p1.add(l3);

			//p1.setColor(Color.WHITE);
			//p1.setFontSize(25);
			add(p1);		
		}

		public static void main(String[] args){
			//DigitalCounter dc = new DigitalCounter();
			TimeThread t1 = new TimeThread();
			t1.start(); 
		}
} 
