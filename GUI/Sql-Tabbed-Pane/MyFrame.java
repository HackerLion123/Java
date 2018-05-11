import java.util.*;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import static java.lang.System.out;
import java.awt.event.*;
import javax.swing.event.*;

public class MyFrame extends JFrame{
	Connection con;
	JTabbedPane tab;
	JPanel  insertPane,DeletePane,UpdatePane,SelectPane;
	JPanel p1,p2,p3,p4,p5;
	JTextField f1,f2,f3,f4,f5,f6,f7,f8;
	JButton b1,b2,b3;
	JTextArea ta;

	public MyFrame(){
		setSize(700,700);
		setVisible(true);
		setTitle("Sql");
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		setIconImage(tk.getImage("pic1jpeg"));
		try{ con = Connectivity.mysql("jdbc:mysql://localhost:3306/Book","root",""); }
		catch(Exception e){ out.println(e); }

		tab = new JTabbedPane();
		insertPane = new JPanel(new GridLayout(6,2));
		DeletePane = new JPanel();
		UpdatePane = new JPanel(new GridLayout(2,1));
		SelectPane = new JPanel();
		ta = new JTextArea(30,30);
		
		p1 = new JPanel();
		p2 = new JPanel(new GridLayout(2,1));
		p3 = new JPanel();
		p4 = new JPanel(new GridLayout(3,2));
		p5 = new JPanel();

		f1 = new JTextField(15);
		f2 = new JTextField(15);
		f3 = new JTextField(15);
		f4 = new JTextField(15);
		f5 = new JTextField(15);
		f6 = new JTextField(15);
		f7 = new JTextField(15);
		f8 = new JTextField(15);
 		
		b1 = new JButton("Summit");
		b2 = new JButton("Update");
		b3 = new JButton("Delete");
		
		addEveryThing();
		addListener();
	}

	public void addEveryThing(){
		insertPane.add(new JLabel("Aurthor :"));
		insertPane.add(f1);
		insertPane.add(new JLabel("Title :"));
		insertPane.add(f2);
		insertPane.add(new JLabel("Publisher :"));
		insertPane.add(f3);
		insertPane.add(new JLabel("BookIndex :"));
		insertPane.add(f4);
		insertPane.add(new JLabel("Price :"));
		insertPane.add(f5);
		insertPane.add(p1);
		
		p1.add(b1);

		UpdatePane.add(p2);
		UpdatePane.add(p3);
		p2.add(p4);
		p2.add(p5);

		p4.add(new JLabel("BookIndex : "));
		p4.add(f6);
		p4.add(new JLabel("Price : "));
		p4.add(f7);
		p4.add(b2);

		DeletePane.add(new JLabel("BookIndex : "));
		DeletePane.add(f8);
		DeletePane.add(b3);
	
		SelectPane.add(new JLabel("Book Details :"));
		SelectPane.add(ta);		
		
		add(tab);
		tab.add(insertPane,"Insert");
		tab.add(DeletePane,"Delete");
		tab.add(UpdatePane,"Update");
		tab.add(SelectPane,"Select");
		Display();
	}

	public void Display(){
		try{
			ResultSet rs;
			Statement st = con.createStatement();
			String qy = "select * from Book;";
			rs = st.executeQuery(qy);
			//Reader rm = rs.getCharacterStream();
			ResultSetMetaData metadata = rs.getMetaData();
			int columnCount = metadata.getColumnCount(); 			

			while(rs.next()){ +++++++++++++++++++++++++
					ta.setText(ta.getText()+rs.getString(1) + "\t" + rs.getString(2) +"\t"+ rs.getString(3)+"\n" );
				
			}
		}
		catch(Exception e){
					out.println(e);
		}
	}

	public void addListener(){
		b1.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent me){
				int index = Integer.parseInt(f4.getText());
				float price = Float.parseFloat(f5.getText());
				try{			
					Statement st = con.createStatement();
					String query = "insert into Book values('"+f1.getText()+"','"+f2.getText()+"','"+f3.getText()+"',"+index+","+price+")";

					if(st.executeUpdate(query)>1)
						JOptionPane.showMessageDialog(null,"Query is successfully executed");

					else
						JOptionPane.showMessageDialog(null,"Query is not executed");
					
				}
				catch(Exception e){
					out.println(e);
				}
			}
		});
		
		b2.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent me){
				int index = Integer.parseInt(f6.getText());
				float price = Float.parseFloat(f7.getText());
				try{
					Statement st = con.createStatement();
					String query = "update Book set price = "+price+"where bookIndex = "+index+";";
					if(st.executeUpdate(query)>0)
						JOptionPane.showMessageDialog(null,"Query is successfully executed");

					else
						JOptionPane.showMessageDialog(null,"Query is not executed");
				}
				catch(Exception e){
					out.println(e);
				}
			}
		});

		b3.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent me){
				int index = Integer.parseInt(f8.getText());
				try{
					Statement st = con.createStatement();
					String query = "delete from Book where bookIndex = " + index;
					if(st.executeUpdate(query)>=0)
						JOptionPane.showMessageDialog(null,"Query is successfully executed");

					else
						JOptionPane.showMessageDialog(null,"Query is not executed");

				}
				catch(Exception e){
					out.println(e);
				}
			}
		});


	}

	public static void main(String [] args){
		MyFrame mf = new MyFrame();
		
	}

}
