import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame{
	public MyFrame()
	{
		setSize(500,600);
		setTitle("Frame");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1 = new JButton("Press Me");
		add(b1);
	}
}
