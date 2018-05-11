import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Calculator extends JFrame{
	JPanel p1,p2,p3,p4;
	TextField t1,t2;
	JButton[] buttons;
	JButton bequal;
	private boolean flag;

	public Calculator(){
		setTitle("Calculator v2");
		setVisible(true);
		setSize(450,450);
		//setResizable(false);

		p1 = new JPanel(new GridLayout(1,1,2,4));
		t1 = new TextField(30);
		p2 = new JPanel(new GridLayout(1,2,2,4));
		t2 = new TextField(25);
		p3 = new JPanel(new GridLayout(1,1));
		p4 = new JPanel(new GridLayout(4,4));

		String[] Buttons = {"1","2","3","+","4","5","6","-","7","8","9","0","*","/","%"};
		buttons = new JButton[Buttons.length];

		for(int i = 0; i < Buttons.length; i ++){
			buttons[i] = new JButton(Buttons[i]);

			//Only final variables can be accessed in annoynomous inner class method
			final int j = i;
			p4.add(buttons[i]);

			buttons[i].addActionListener(new ActionListener(){
			
				@Override
				public void actionPerformed(ActionEvent ae){
					if(flag){
						t1.setText(Buttons[j]);
					}
					else
						t1.setText(t1.getText() + Buttons[j]);				
				}

			});
		}

		bequal = new JButton("=");

		bequal.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent ae){
				t2.setText(Evalute.quick(t1.getText()));
				flag = true;				
			}

		});

		p4.add(bequal);

		p1.add(t1);
		add(p2,BorderLayout.SOUTH);
		p2.add(new JLabel("Result : "));
		p3.add(t2);
		p2.add(p3);
		add(p1,BorderLayout.NORTH);	
		add(p4,BorderLayout.CENTER);
	}
}

class Evalute{
	public static String quick(String args)
    { 

        Scanner scan = new Scanner(System.in);

        /* Create stacks for operators and operands */

        Stack<Integer> op  = new Stack<Integer>();

        Stack<Double> val = new Stack<Double>();

        /* Create temporary stacks for operators and operands */

        Stack<Integer> optmp  = new Stack<Integer>();

        Stack<Double> valtmp = new Stack<Double>();

        String input = args;

        input = "0" + input;

        input = input.replaceAll("-","+-");

        /* Store operands and operators in respective stacks */

        String temp = "";

        for (int i = 0;i < input.length();i++)

        {

            char ch = input.charAt(i);

            if (ch == '-')

                temp = "-" + temp;

            else if (ch != '+' &&  ch != '*' && ch != '/')

               temp = temp + ch;

            else

            {

                val.push(Double.parseDouble(temp));

                op.push((int)ch);

                temp = "";

            }

        }

        val.push(Double.parseDouble(temp));

        /* Create char array of operators as per precedence */

        /* -ve sign is already taken care of while storing */

        char operators[] = {'/','*','+'};

        /* Evaluation of expression */

        for (int i = 0; i < 3; i++)

        {

            boolean it = false;

            while (!op.isEmpty())

            {

                int optr = op.pop();

                double v1 = val.pop();

                double v2 = val.pop();

                if (optr == operators[i])

                {

                    /* if operator matches evaluate and store in temporary stack */

                    if (i == 0)

                    {

                        valtmp.push(v2 / v1);

                        it = true;

                        break;

                    }

                    else if (i == 1)

                    {

                        valtmp.push(v2 * v1);

                        it = true;

                        break;

                    }

                    else if (i == 2)

                    {

                        valtmp.push(v2 + v1);

                        it = true;

                        break;

                    }                                        

                }

                else

                {

                    valtmp.push(v1);

                    val.push(v2);

                    optmp.push(optr);

                }                

            }    

            /* Push back all elements from temporary stacks to main stacks */            

            while (!valtmp.isEmpty())

                val.push(valtmp.pop());

            while (!optmp.isEmpty())

                op.push(optmp.pop());

            /* Iterate again for same operator */

            if (it)

                i--;                            

        }    

        return ""+val.pop();        

    }
}

/*class Expression{
	public static void evalute(String exp){
		char[] array = exp.toCharArray();
	
		Stack<Integer> operants = new Stack<Integer>();
		Stack<Character> operators = new Stack<Character>();
		
		for(int i = 0; i < array.length; i ++){
			//Numbers
			if(array[i] >= '0' && array[i] <= '9'){
				operants
			}

			//Symbols
			if{
				
			}
		}
	}		
}*/
