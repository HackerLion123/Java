import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import static java.lang.System.out;
import java.awt.event.*;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class IPdfReader extends JFrame{
	JTextArea a1;
	JLabel l1;
	int size;
	JMenuItem zoomin,zoomout,close;
	JPanel p1,p2,p3;
	JPopupMenu popup;	
	PdfReader reader;
	JScrollPane scrollbar;
	Font f1;
	String path;
	boolean flag;

	public IPdfReader(String path){
		setSize(700,700);
		//setVisible(true);
		setTitle("E-Library");
		path = path;
		a1 = new JTextArea();
		size = 22;
		f1 = new Font("FreeSans",Font.PLAIN,size);
		a1.setFont(f1);

		p1 = new JPanel();
		p2 = new JPanel();
		ImageIcon loading = new ImageIcon("Images/giphy.gif");
		l1 = new JLabel("loading... ", loading, JLabel.CENTER);
		loading.setImageObserver(l1);
		add(l1);

		popup = new JPopupMenu();
		zoomin = new JMenuItem("Zoomin");
		zoomin = new JMenuItem("Zoomout");
		close = new JMenuItem("Close");

		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit tk = Toolkit.getDefaultToolkit();
		setIconImage(tk.getImage("Images/images.png"));
		//add(p1);
		JFrame frame = new JFrame();
		frame.add(l1);
		setVisible(false);
		frame.setSize(200,300);
		frame.setVisible(true);
			new Thread(new Runnable(){

			@Override
			public void run(){
					//addReader();
					flag = true;		 		
			   		if(flag){
						 SwingUtilities.invokeLater(new Runnable(){
					 	    @Override public void run(){
					     	   frame.setVisible(false);
								setVisible(true);      
				 	 	 }
				  		});
			   		}
				
    		}

    	}).start();
		scrollbar  = new JScrollPane(a1,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//a1.revalidate();
		scrollbar.setPreferredSize(new Dimension(400, 400));
		//scrollbar.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//addReader();
		  try{
					
					//add(p1);
					reader = new PdfReader(path);
					
					
					int pgcount = reader.getNumberOfPages();
					for(int i = 2; i < pgcount;i++){
						String textFromPage = PdfTextExtractor.getTextFromPage(reader, i);
						
						a1.setText(""+a1.getText()+textFromPage+"\n----------------------------------------------------------------page"+i+"------------------------------------------------------------------\n\n");
					}
					add(scrollbar);
					addMenuItems();
					//popup.show(a1,200,200);
					//frame.setVisible(false);
					//setVisible(true);	
					a1.setInheritsPopupMenu(true);
					reader.close();
			}
			catch(Exception e){} 
		//add(p1);
		
}
	//add menusItems and corresponding listener to popup

	void addReader(){
		try{
					
					//add(p1);
					reader = new PdfReader(path);
					
					
					int pgcount = reader.getNumberOfPages();
					for(int i = 2; i < pgcount;i++){
						String textFromPage = PdfTextExtractor.getTextFromPage(reader, i);
						
						a1.setText(""+a1.getText()+textFromPage+"\n----------------------------------------------------------------page"+i+"------------------------------------------------------------------\n\n");
					}
					add(scrollbar);
					addMenuItems();
					//popup.show(a1,200,200);
					//frame.setVisible(false);
					//setVisible(true);	
					scrollbar.addMouseListener(new MouseAdapter(){
						@Override
						public void mousePressed(MouseEvent me){
							if(me.isPopupTrigger()){
								popup.show(me.getComponent(),me.getX(),me.getY());
							}
						}
		
						public void mouseReleased(MouseEvent me){
							if(me.isPopupTrigger()){
								popup.show(me.getComponent(),me.getX(),me.getY());
							}
						}
					});
					reader.close();
			}
			catch(Exception e){}
	}

	void addMenuItems(){
		popup.add(zoomin);
		popup.add(zoomout);
		popup.add(close);
		
		zoomin.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent ae){
							size = size+2;
							f1 = new Font("FreeSans",Font.PLAIN,size);
							a1.setFont(f1);
					}
		});

		zoomout.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent ae){
							size = size-2;
							f1 = new Font("FreeSans",Font.PLAIN,size);
							a1.setFont(f1);
					}
		});
		
		close.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent ae){
							//System.close();
					}
		});	
	}
}
