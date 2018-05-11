import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener{
		JPanel p1,p2,p3,p4;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bdiv,bmod,bmul;
		TextField t1,t2;

		public MyFrame(){
			setTitle("Calculator");
			setVisible(true);
			setSize(450,450);
			//setResizable(false);

			p1 = new JPanel(new GridLayout(1,1,2,4));
			t1 = new TextField(30);
			p2 = new JPanel(new GridLayout(1,2,2,4));
			t2 = new TextField(25);
			p3 = new JPanel(new GridLayout(1,1));
			p4 = new JPanel(new GridLayout(4,4));			
			b1 = new JButton("1");
			b2 = new JButton("2");
			b3 = new JButton("3");
			b4 = new JButton("4");
			b5 = new JButton("5");
			b6 = new JButton("6");
			b7 = new JButton("7");
			b8 = new JButton("8");
			b9 = new JButton("9");
			b0 = new JButton("0");
			badd = new JButton("+");
			bsub = new JButton("-");
			bdiv = new JButton("/");
			bmod = new JButton("%");
			bmul = new JButton("*");

			b1.addActionListener(this);
			b2.addActionListener(this);

		/*	b1.addMouseListener(new MouseAdapter(){
				public void mouseEntered(MouseEvent me){
					b1.setBackground(Color.GRAY);
				}
				public void mouseExited(MouseEvent me){
					b1.setBackground(Color.BLUE);
				}
			});	*/		

			p1.add(t1);
			add(p2,BorderLayout.SOUTH);
			p2.add(new JLabel("Result : "));
			p3.add(t2);
			p2.add(p3);
			add(p1,BorderLayout.NORTH);
	
			p4.add(b1);
			p4.add(b2);
			p4.add(b3);
			p4.add(badd);
			p4.add(b4);
			p4.add(b5);
			p4.add(b6);
			p4.add(bsub);
			p4.add(b7);
			p4.add(b8);
			p4.add(b9);
			p4.add(b0);
			p4.add(bmul);
			p4.add(bdiv);
			p4.add(bmod);

			add(p4,BorderLayout.CENTER);			
		}

		/*
		 * click event should be Specified Each time or it will cause problems
		 * From this example this code executes both events even if a single button is pressed. 
		*/

		public void actionPerformed(ActionEvent ae){
			 if(b1.isEnabled()){
			 	t1.setText(t1.getText()+1);
			 }
			 if(b2.isEnabled()){
				t1.setText(t1.getText()+2);
			}
		} 

}
	
