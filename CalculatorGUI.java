package calproject;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

/** JFrame container is used for adding components 
 * 
 * @author akirit
 *
 */
public class Test {

	private JFrame frmCalculator;
	private JTextField textField;

	double num1;
	double num2;
double result;
	String operation;
	String ans;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.getContentPane().setBackground(new Color(95, 158, 160));
		frmCalculator.setBounds(100, 100, 349, 365);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setBounds(17, 9, 326, 60);
		textField.setColumns(10);

		/*btn1*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 *    */
		
		final JButton btn1 = new JButton("1");
		btn1.setBounds(33, 223, 50, 29);
		btn1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		String numb1=textField.getText()+btn1.getText();
		textField.setText(numb1);
				
			}
		});
		
		/*btn 2*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 *    */
		final JButton btn2 = new JButton("2");
		btn2.setBounds(109, 223, 50, 29);
		btn2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		String num2=textField.getText()+btn2.getText();
		textField.setText(num2);
				
			}
		});
		
		/*btn 3*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 *    */
		final JButton btn3 = new JButton("3");
		btn3.setBounds(172, 223, 50, 29);
		btn3.addActionListener(new ActionListener() 
		{
		public void actionPerformed(ActionEvent e) {	
		String num3=textField.getText()+btn3.getText();
		textField.setText(num3);
			}
		});
		
		/*btn 4*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 *    */
		final JButton btn4 = new JButton("4");
		btn4.setBounds(33, 174, 50, 29);
		btn4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		String num4=textField.getText()+btn4.getText();
		textField.setText(num4);
			}
		});
		
		/*btn 5*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 *    */
		final JButton btn5 = new JButton("5");
		btn5.setBounds(102, 174, 50, 29);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num5=textField.getText()+btn5.getText();
				textField.setText(num5);
				
			}
		});
		
		/*btn 6*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 *    */
		final JButton btn6 = new JButton("6");
		btn6.setBounds(172, 174, 50, 29);
		btn6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		String num6=textField.getText()+btn6.getText();
		textField.setText(num6);
				
			}
		});
		
		/*btn 7*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 *    */
		final JButton btn7 = new JButton("7");
		btn7.setBounds(33, 133, 50, 29);
		btn7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		String num7=textField.getText()+btn7.getText();
		textField.setText(num7);
				
			}
		});

		/*btn 8*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 *    */
		final JButton btn8 = new JButton("8");
		btn8.setBounds(102, 133, 50, 29);
		btn8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		String num8=textField.getText()+btn8.getText();
		textField.setText(num8);
				
			}
		});
		
		/*btn 9*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 *    */
		final JButton btn9 = new JButton("9");
		btn9.setBounds(172, 133, 50, 29);
		btn9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	    String num9=textField.getText()+btn9.getText();
		textField.setText(num9);
				
			}
		});
		
		/*btn 0*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 *    */
		final JButton btn0= new JButton("0");
		btn0.setBounds(236, 277, 50, 36);
		btn0.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		String num0=textField.getText()+btn0.getText();
		textField.setText(num0);
				
			}
		});

        /*btndot*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 *    */
		final JButton btndot = new JButton(".");
		btndot.setBounds(172, 277, 50, 36);
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String num=textField.getText()+btndot.getText();
			textField.setText(num);
			}
			
		});
		
		/*btnBackspace*/
		final JButton btnback = new JButton("BS");
		btnback.setBounds(102, 81, 50, 29);
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String S=null;
				/** 
				 * Checking the length of textField to see if there is data.
				 * String Builder class is used to modify String without creating a new object
				 * After obtaining the length String Builder deletCharAt(int index) is used to delete char at specific location
				 * 
				 */
				if(textField.getText().length()>0)
				{
					StringBuilder sb=new StringBuilder(textField.getText());
					sb.deleteCharAt(textField.getText().length()-1);
					S=sb.toString();
					textField.setText(S);
				}
				
				
			}
		});
		
		/*btnAdd*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 *  Taking first user input and storing the value in a double variable
		 *  Set operation = "+"
		 *    */
		JButton btnAdd = new JButton("+");
		btnAdd.setBounds(236, 81, 50, 29);
		btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	    num1=Double.parseDouble(textField.getText());
	    textField.setText("");
		operation="+";
			}
		});
		
		/*btnSub*/
		
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 *  Taking first user input and storing the value in a double variable
		 *  Set operation = "-"
		 *    */
		JButton btnminus = new JButton("-");
		btnminus.setBounds(172, 81, 50, 29);
		btnminus.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	    num1=Double.parseDouble(textField.getText());
		textField.setText("");
	     operation ="-";
				
		}
		});
		
		/*btnDiv*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 * Taking first user input and storing the value in a double variable 
		 *  Set operation = "/"
		 *    */
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(236, 175, 50, 26);
		btnDiv.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		num1=Double.parseDouble(textField.getText());
		textField.setText("");
		operation="/";
			}
		});
	
		/*btnmul*/
		
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 * Taking first user input and storing the value in a double variable 
		 *  Set operation = "*"
		 *    */
		JButton btnMul1 = new JButton("*");
		btnMul1.setBounds(236, 134, 50, 26);
		btnMul1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		num1=Double.parseDouble(textField.getText());
		textField.setText("");
		operation="*";
			}
			
		});
		
		/*btnequal*/
		/** Creating a Jbutton using Application Window and setting the position of the button on Jframe using setbounds property  
		 *  Register the button with ActionListener
		 *  Handle the event with ActionEvent handling code
		 * Taking second user input and storing the value in a double variable 
		 *  Choosing the operation based on user choice
		 *  After displaying the desired operation output value on JTextField, numeric button components and textfield are  disabled
		 *  so as to not to enter any extra values in the textfield.
		 *    */
		
		JButton btnequal = new JButton("=");
		btnequal.setBounds(236, 223, 50, 29);
		btnequal.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		String ans;
		num2=Double.parseDouble(textField.getText());
		if(operation=="+")
		{
		result=num1+num2;
		ans=Double.toString(result);
		textField.setText(ans);
	
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn0.setEnabled(false);
		btndot.setEnabled(false);
		btnback.setEnabled(false);
		textField.setEnabled(false);
		
			}
		else if(operation=="-")
		{
			result=num1-num2;		
			ans=Double.toString(result);
			textField.setText(ans);
			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);
			btn9.setEnabled(false);
			btn0.setEnabled(false);
			btndot.setEnabled(false);
			btnback.setEnabled(false);
			textField.setEnabled(false);
			
		}
		else if(operation=="*")
		{
			result=num1*num2;
			ans=Double.toString(result);
			textField.setText(ans);
			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);
			btn9.setEnabled(false);
			btn0.setEnabled(false);
			btndot.setEnabled(false);
			btnback.setEnabled(false);
			textField.setEnabled(false);
			
		}
		else if(operation=="/")
		{
			if(num2!=0)
			{	
				
			result=num1/num2;
			ans=Double.toString(result);
		    textField.setText(ans);
			}
			else
			{
				//String msg="error";
				//msg=textField.getText();
				 textField.setText( "Error");
				
			}
		   /* ans=Double.toString(result);
		    textField.setText(ans);*/
		    btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);
			btn9.setEnabled(false);
			btn0.setEnabled(false);
			btndot.setEnabled(false);
			btnback.setEnabled(false);
			textField.setEnabled(false);
			
		 
		}
			}
		});
		
		/**
		 * After clicking on CE all the disabled buttons and textfield are enabled
		 * 
		 */
		
		/*btn CE*/
		final JButton btnCE = new JButton("CE");
		btnCE.setBounds(27, 81, 49, 29);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);
				btndot.setEnabled(true);
				btnback.setEnabled(true);
				textField.setEnabled(true);
				textField.setText(null);
			}
		});
		frmCalculator.getContentPane().setLayout(null);
		frmCalculator.getContentPane().add(textField);
		frmCalculator.getContentPane().add(btn1);
		frmCalculator.getContentPane().add(btn2);
		frmCalculator.getContentPane().add(btn3);
		frmCalculator.getContentPane().add(btn4);
		frmCalculator.getContentPane().add(btn5);
		frmCalculator.getContentPane().add(btn6);
		frmCalculator.getContentPane().add(btn7);
		frmCalculator.getContentPane().add(btn8);
		frmCalculator.getContentPane().add(btn9);
		frmCalculator.getContentPane().add(btn0);
		frmCalculator.getContentPane().add(btndot);
		frmCalculator.getContentPane().add(btnback);
		frmCalculator.getContentPane().add(btnAdd);
		frmCalculator.getContentPane().add(btnminus);
		frmCalculator.getContentPane().add(btnDiv);
		frmCalculator.getContentPane().add(btnMul1);
		frmCalculator.getContentPane().add(btnequal);
		frmCalculator.getContentPane().add(btnCE);
		
		
		
	}
}
		
		
		

	

