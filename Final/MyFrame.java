import java.sql.*;
import javax.swing.*;
import java.awt.*;
import static java.lang.System.out;
import java.awt.event.*;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import java.io.*;

class WelcomeScreen extends JFrame{
	JButton b1;
	Image img;
	JPanel p1;

	public WelcomeScreen(){
		setSize(500,500);
		setVisible(true);
		setTitle("E-Library");
		
		this.setBackground(Color.BLUE);
		b1 = new JButton("Open Library");
		Toolkit tk = Toolkit.getDefaultToolkit();
		setIconImage(tk.getImage("Images/images.png"));
		p1 = new JPanel();

		p1.setOpaque(false);
		


		b1.setLocation(250, 250);
				
		//Image img = new Image("Images/Book_designed_by_Benny_Forsberg_from_the_Noun_Project_-_with_lines.png");		
			
		//setLocationByPlatform(true);

		b1.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent me){
				DisplayBooks frame = new DisplayBooks();
				setVisible(false);
			}
		});	

		p1.add(b1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultLookAndFeelDecorated(true);
	
		add(p1,BorderLayout.CENTER);
	}

}

class DisplayBooks extends JFrame{
	Connection con;
	JPanel selectPane;
	JPanel p1,p2,p3,p4,p5;
	JScrollPane jsp;
	JButton b1;
	AutoCompleteDecorator decorator;
    JComboBox combobox;
	JLabel[] labels;
	JScrollPane jp;
	Font f1;

	public DisplayBooks(){
		setSize(700,700);
		setVisible(true);
		setTitle("E-Library");
		
		f1 = new Font("FreeSans",Font.PLAIN,22);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		setIconImage(tk.getImage("Images/images.png"));

		try{ con = Connectivity.mysql(); }
		catch(Exception e){ out.println(e); }

		//BoxLayout(p1,BoxLayout.Y_AXIS)
		p1 = new JPanel(new GridLayout(2,1));
		p2 = new JPanel(new GridLayout(2,1));
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
 
		b1 = new JButton("Add");
		p2.setBackground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		//setDefaultLookAndFeelDecorated(true);
		
		jp = new JScrollPane(p5);
		displayBooks();
		addEveryThing();
		addListener();
	}

	public void displayBooks(){
		try{
			int totalRows,i=1;
			ResultSet rs;
			Statement st = con.createStatement();
			String qy = "select title,path from Book order by title;";
			rs = st.executeQuery(qy);
			//Reader rm = rs.getCharacterStream();
			rs.last();
        	totalRows = rs.getRow();
        	rs.beforeFirst();
			Object[] obj = new Object[totalRows+1];
			labels = new JLabel[totalRows+1];
			obj[0] = "";

			
			ImageIcon icon = new ImageIcon("Images/images.png");
			ImageIcon icon1 = new ImageIcon("Images/ic_menu_save.png");
			b1.setIcon(icon1);

			while(rs.next()){ 
				obj[i] = rs.getString(1);
				labels[i] = new JLabel(rs.getString(1));
				labels[i].setIcon(icon);
				labels[i].setFont(f1);
				labels[i].setPreferredSize(new Dimension(400,200));
				String path = rs.getString(2);
				labels[i].addMouseListener(new MouseAdapter(){
					@Override
					public void mouseClicked(MouseEvent me){
						try{
							IPdfReader pf = new IPdfReader(path);			
						}
						catch(Exception e){}
					}
				});

				p5.add(labels[i]);
				i++;
			}
			combobox = new JComboBox(obj);
			AutoCompleteDecorator.decorate(combobox);
			/*while(rs.next()){ 
				ta.setText(rs.getString(1) );
				
			}*/
		}
		catch(Exception e){
			out.println(e);
		}
	}
	
	public void addListener(){
		b1.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent me){
					AddNewBook frame = new AddNewBook();
					setVisible(false);
				}
			});
	}

	public void addEveryThing(){
		add(p1);
		p4.add(new JLabel("\t\t\t\t\tWelcome"));
		p2.add(p4);
		p2.add(p3);
		p3.add(combobox);
		p3.add(b1);
		p1.add(p2);
		p1.add(jp);
		
	}
}

class AddNewBook extends JFrame{
		Connection con;
		JPanel  insertPane;
		JTextField f1,f2,f3,f4,f5,f6;
		JFileChooser jfc;
		JButton b1,b2,b3;
		JLabel l1;
        JPanel p1,p2,p3;

		public AddNewBook(){
			setSize(700,700);
			setVisible(true);
			setTitle("E-Library");
			
			Toolkit tk = Toolkit.getDefaultToolkit();
			setIconImage(tk.getImage("Images/images.png"));
			try{ con = Connectivity.mysql(); }
			catch(Exception e){ out.println(e); }

			insertPane = new JPanel(new GridLayout(7,2));
			l1 = new JLabel("path");
			l1.setBackground(Color.WHITE);

			jfc = new JFileChooser();

			//setDefaultLookAndFeelDecorated(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		
			f1 = new JTextField(15);
			f2 = new JTextField(15);
			f3 = new JTextField(15);
			f4 = new JTextField(15);
			f5 = new JTextField(15);

			b1 = new JButton("Add");
			b2 = new JButton("click to add pdf");
			b3 = new JButton("back");			

            p1 = new JPanel();
            p2 = new JPanel();
			p3 = new JPanel();
                        
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
			insertPane.add(p2);
			insertPane.add(l1);
			insertPane.add(l1);
			insertPane.add(b2);
			insertPane.add(p1);
			insertPane.add(p3);

			p1.add(b1);
			p2.add(b2);
			p3.add(b3);
			add(insertPane);
		}

        public void addListener(){

			b1.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent me){
					int index = Integer.parseInt(f4.getText());
					float price = Float.parseFloat(f5.getText());
					try{			
						Statement st = con.createStatement();
						String query = "insert into Book(aurthor,title,publisher,bookIndex,price,path) values('"+f1.getText()+"','"+f2.getText()+"','"+f3.getText()+"',"+index+","+price+",'"+l1.getText()+"')";

						if(st.executeUpdate(query)>1)
							JOptionPane.showMessageDialog(null,f2.getText()+" is added");

						else
							JOptionPane.showMessageDialog(null,"Book is not added");
						
					}
					catch(Exception e){ out.println(e); }
				}
			});
				
			b2.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent me){
					jfc.showOpenDialog(null);
					File f1 = jfc.getSelectedFile();
					l1.setText(jfc.getSelectedFile().getAbsolutePath());
				}
			});
			
			b3.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent me){
					DisplayBooks frame = new DisplayBooks();
					setVisible(false);
				}
			});
		}
                
}

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
		setTitle("E-Libray");
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		setIconImage(tk.getImage("pic1jpeg"));
		try{ con = Connectivity.mysql(); }
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
			while(rs.next()){ 
				ta.setText(rs.getString(1) + "\t" + rs.getString(2) +"\t"+ rs.getString(3) );
				
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
				catch(Exception e){ out.println(e); }
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
					String query = "delete table Book where bookIndex = " + index;
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
		WelcomeScreen mf = new WelcomeScreen();
		
	}

}
