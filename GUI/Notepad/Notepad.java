import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class Notepad extends JFrame{
		public static int count = 0;
		JTextArea NotepadArea = new JTextArea();
		JScrollPane Scrollbar;
		JMenuBar mb;
		JMenu fileMenu,editMenu,helpMenu,viewMenu;
		String[] editItems;		
		JMenuItem []file,edit;
		JCheckBox cb;
		JTabbedPane jtp;		

		public Notepad(){
			count++;
			setTitle("Untitled "+count);
			setVisible(true);
			setSize(600,600);
 
			//Scrollbar = new JScrollPane(NotepadArea);
			Scrollbar = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

			String[] fileItems = {"New","Open","Save","Save as","Close"};
			String[] editItems = {"cut","copy","paste"};
			//editItems = ["Cut","Copy","Paste"];
			fileMenu = new JMenu("File");
			editMenu = new JMenu("Edit");
			viewMenu = new JMenu("View");
			helpMenu = new JMenu("Help");

			file = new JMenuItem[5];
			edit = new JMenuItem[5];
			for(int i = 0;i < editItems.length; i++){
				edit[i] = new JMenuItem(editItems[i]);
				editMenu.add(edit[i]);
			}
					
			
			cb = new JCheckBox();
			fileMenu.addSeparator();
			file[0] = new JMenuItem("New",'N');
			file[1] = new JMenuItem("Open",'O');
			file[2] = new JMenuItem("Save",'O');
			fileMenu.add(file[0]);
			fileMenu.add(file[1]);
			fileMenu.add(file[2]);
			fileMenu.add(cb);
			//fileMenu.add(new JMenuItem("close"));

			//Set Shortcut Keys
			file[1].setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
			file[2].setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
			
			viewMenu.add(new JMenu("Font"));
			fileMenu.setMnemonic('F');
			fileMenu.setToolTipText("u can open or Save a File");
			mb = new JMenuBar();

 			//setting the menu bar to mb and adding menus to it
			setJMenuBar(mb);
			mb.add(fileMenu);
			mb.add(editMenu);
			mb.add(viewMenu);
			mb.add(helpMenu);
			add(NotepadArea,BorderLayout.CENTER);
			add(Scrollbar,BorderLayout.EAST);

			file[1].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ae){
					//	Notepad src = new Notepad();
						try{
							JFileChooser openFileChooser = new JFileChooser();
							openFileChooser.setCurrentDirectory(new File("."));
							openFileChooser.showOpenDialog(null);
							File f1 = openFileChooser.getSelectedFile();
							Scanner sin = new Scanner(f1);
							//setTitle();
							while(sin.hasNext()){
								String x = sin.nextLine();
								NotepadArea.append(x+"\n");
							}
						}
						catch(Exception e){
						}					
					}
			});

			file[0].addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent ae){
							jtp = new JTabbedPane();
							JPanel p1 = new JPanel(),p2 = new JPanel();
							p1.add(new Notepad());
							add(jtp);
							jtp.add(p1,"New Tab");
							jtp.add(p2,"New Tab");
					}
			});

			file[2].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ae){
						//System.out.println("Open");
						try{
							int x = JOptionPane.showConfirmDialog(null,"Do you wanna Save?");
							if(x == 0){
								JFileChooser saveFileChooser = new JFileChooser();
								saveFileChooser.setCurrentDirectory(new File("/root/"));
								saveFileChooser.showSaveDialog(null);
								File f1 = saveFileChooser.getSelectedFile();
								PrintWriter pw = new PrintWriter(f1);
								pw.write(NotepadArea.getText());
								pw.close();
								JOptionPane.showMessageDialog(null,"Saved");
								JOptionPane.showInputDialog("Find?");
							}
						}
						catch(Exception e){
						}											
					}
			});		
		}
}
