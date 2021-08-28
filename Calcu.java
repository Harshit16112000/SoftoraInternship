import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Calcu {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String first1;
	String second1;
	
	String operation;
	String answer;
	private final Action action = new SwingAction();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcu window = new Calcu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calcu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 507, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Myanmar Text", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 471, 36);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setBounds(10, 46, 471, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(Color.WHITE);
		btnClear.setFont(new Font("Myanmar Text", Font.BOLD, 16));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(406, 107, 56, 36);
		frame.getContentPane().add(btnClear);
		
		JButton BtnDivision = new JButton("/");
		BtnDivision.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		BtnDivision.setBackground(Color.WHITE);
		BtnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		BtnDivision.setBounds(406, 143, 56, 36);
		frame.getContentPane().add(BtnDivision);
		
		JButton BtnMultiplication = new JButton("*");
		BtnMultiplication.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		BtnMultiplication.setBackground(Color.WHITE);
		BtnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		BtnMultiplication.setBounds(406, 180, 56, 36);
		frame.getContentPane().add(BtnMultiplication);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnPlus.setBackground(Color.WHITE);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setBounds(406, 219, 56, 36);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btnMinus.setBackground(Color.WHITE);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
			
		});
		btnMinus.setBounds(406, 258, 56, 36);
		frame.getContentPane().add(btnMinus);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btnEqual.setBackground(Color.WHITE);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				
				if(operation=="+")
				{
					
					result=first+second;
					
					first1 = String.format("%.2f", first);
					second1=String.format("%.2f", second);
					
					answer=String.format("%.2f", result);
					
					
					textField.setText(first1  + "+ " +  second1  + "= "  + answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					
					first1 = String.format("%.2f", first);
					second1=String.format("%.2f", second);
							
					textField.setText(first1 + "- " + second1  + "= " + answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					
					first1 = String.format("%.2f", first);
					second1=String.format("%.2f", second);
							
					textField.setText(first1 + "* " + second1  + "= " + answer);
			
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					
					first1 = String.format("%.2f", first);
					second1=String.format("%.2f", second);
							
					textField.setText(first1 + "/ " + second1  + "= " + answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setBounds(406, 296, 56, 36);
		frame.getContentPane().add(btnEqual);
		
		JButton btnexp = new JButton("e^x");
		btnexp.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btnexp.setBackground(Color.WHITE);
		btnexp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+ a);
			}
		});
		btnexp.setBounds(295, 107, 56, 36);
		frame.getContentPane().add(btnexp);
		
		JButton btnSqrt = new JButton("\u221A");
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSqrt.setBackground(Color.WHITE);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+ a);
				
			}
		});
		btnSqrt.setBounds(295, 143, 56, 36);
		frame.getContentPane().add(btnSqrt);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.WHITE);
		btn9.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBounds(295, 180, 56, 36);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.WHITE);
		btn6.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBounds(295, 219, 56, 36);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.WHITE);
		btn3.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(295, 258, 56, 36);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btnDot.setBackground(Color.WHITE);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setBounds(295, 296, 56, 36);
		frame.getContentPane().add(btnDot);
		
		JButton btnlogx = new JButton("logx");
		btnlogx.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btnlogx.setBackground(Color.WHITE);
		btnlogx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+ a);
				
			}
		});
		btnlogx.setBounds(237, 107, 56, 36);
		frame.getContentPane().add(btnlogx);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btnPercent.setBackground(Color.WHITE);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
				
			}
		});
		btnPercent.setBounds(237, 143, 56, 36);
		frame.getContentPane().add(btnPercent);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.WHITE);
		btn8.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBounds(237, 180, 56, 36);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.WHITE);
		btn5.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(237, 219, 56, 36);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.WHITE);
		btn2.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(237, 258, 56, 36);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btn0.setBackground(Color.WHITE);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(175, 296, 118, 36);
		frame.getContentPane().add(btn0);
		
		JButton btnfactorial = new JButton("n!");
		btnfactorial.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btnfactorial.setBackground(Color.WHITE);
		btnfactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
						double fact =1;
				while(a!=0)
				{
					fact = fact*a;
					a--;
		
				}
				textField.setText("");
				textField.setText(textField.getText() + fact);
			}
		
			
		});
		btnfactorial.setBounds(175, 107, 56, 36);
		frame.getContentPane().add(btnfactorial);
		
		JButton btnReciprocal = new JButton("1/x");
		btnReciprocal.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btnReciprocal.setBackground(Color.WHITE);
		btnReciprocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+ a);
			}
		});
		btnReciprocal.setBounds(175, 143, 56, 36);
		frame.getContentPane().add(btnReciprocal);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.WHITE);
		btn7.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(175, 180, 56, 36);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.WHITE);
		btn4.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBounds(175, 219, 56, 36);
		frame.getContentPane().add(btn4);
		
		
		JButton btn1 = new JButton("1");
		
		btn1.setBackground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btn1.setBounds(175, 258, 56, 36);
		frame.getContentPane().add(btn1);
		
		JButton btnsinxh = new JButton("sinxh");
		btnsinxh.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btnsinxh.setBackground(Color.WHITE);
		btnsinxh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+ a);
			}
		});
		btnsinxh.setBounds(24, 219, 118, 36);
		frame.getContentPane().add(btnsinxh);
		
		JButton btntanx = new JButton("tanx");
		btntanx.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btntanx.setBackground(Color.WHITE);
		btntanx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+ a);
			}
		});
		btntanx.setBounds(24, 180, 118, 36);
		frame.getContentPane().add(btntanx);
		
		JButton btsinx = new JButton("Sinx");
		btsinx.setForeground(Color.BLACK);
		btsinx.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btsinx.setBackground(Color.WHITE);
		btsinx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+ a);
			}
		});
		btsinx.setBounds(24, 107, 118, 36);
		frame.getContentPane().add(btsinx);
		
		JButton btcosx = new JButton("cosx");
		btcosx.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btcosx.setBackground(Color.WHITE);
		btcosx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+ a);
			}
		});
		btcosx.setBounds(24, 143, 118, 36);
		frame.getContentPane().add(btcosx);
		
		JButton btncosh = new JButton("cosxh");
		btncosh.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btncosh.setBackground(Color.WHITE);
		btncosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+ a);
			}
		});
		btncosh.setBounds(24, 258, 118, 36);
		frame.getContentPane().add(btncosh);
		
		JButton btntanxh = new JButton("tanxh");
		btntanxh.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		btntanxh.setBackground(Color.WHITE);
		btntanxh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+ a);
			}
		});
		btntanxh.setBounds(24, 296, 118, 36);
		frame.getContentPane().add(btntanxh);
		
		JLabel btnVal = new JLabel("");
		btnVal.setBounds(10, 70, 471, 26);
		frame.getContentPane().add(btnVal);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
