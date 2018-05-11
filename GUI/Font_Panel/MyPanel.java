import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MyPanel extends JFrame{
		JPanel p1,p2,p3,p4,p5,p6,p7,p8;
		JTextArea FontArea;
		JComboBox cb;
		String[] fonts;
		JRadioButton small,medium,large;
		JRadioButtonGroup rbg;
		GraphicsEnvironment ge;
		JCheckBox bold,italic,underline,none;
		JSlider red,green,blue;

		public MyPanel()
		{
			setTitle("Font-Panel");
			setVisible(true);
			setSize(500,400);
			//setResizable(false);
						
			
			p1 = new JPanel();
			p2 = new JPanel(new GridLayout(4,2,2,4));
			p3 = new JPanel(new GridLayout(1,2,4,4));
			p4 = new JPanel(new GridLayout(1,4));
			p5 = new JPanel(new GridLayout(1,3));
			p6 = new JPanel(new GridLayout(3,1));
			p7 = new JPanel(new GridLayout(1,2));
			p8 = new JPanel(new GridLayout(3,1));
	
			//p2.setBackground(Color.YELLOW);			

			FontArea = new JTextArea(4,43);
			cb = new JComboBox();

			bold = new JCheckBox("bold");
			italic = new JCheckBox("italic");
			underline = new JCheckBox("underline");
			none = new JCheckBox("none");

			small = new JRadioButton("small");
			medium = new JRadioButton("medium");
			large = new JRadioButton("large");

			red = new JSlider();
			blue = new JSlider();
			green = new JSlider();

			ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			String []fonts = ge.getAvailableFontFamilyNames();
			
			for(int i = 0; i < fonts.length; i ++)
				cb.addItem(fonts[i]);			
			
			p1.add(FontArea);
			add(p1,BorderLayout.NORTH);

			p4.add(bold);p4.add(italic);p4.add(underline);p4.add(none);
			
			p5.add(small);p5.add(medium);p5.add(large);

			p6.add(red);p6.add(green);p6.add(blue);
		
			p7.add(new JLabel("Font Color"));p7.add(p8);
		
			p8.add(new JLabel("red"));p8.add(new JLabel("green"));p8.add(new JLabel("blue"));			

			//p1.add(new JLabel(""));
			p2.add(new JLabel("Font Family"));
			p3.add(cb);
			p2.add(p3);
			p2.add(new JLabel("Font Style"));
			p2.add(p4);
			p2.add(new JLabel("Font Size"));
			p2.add(p5);p2.add(p7);p2.add(p6);

			add(p2);
			
		}	
}
