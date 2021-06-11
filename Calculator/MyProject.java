import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class PersonalFrame extends JFrame{
	Container c;
	JTextField tf1,tf2;
	JLabel lb1,lb2,lb3;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JPasswordField p1;
	JButton b8;

	public PersonalFrame(){
		c = this.getContentPane();
		c.setLayout(null);

		tf1 = new JTextField();
		tf2 = new JTextField();
		tf1.setEnabled(true);
		lb1 = new JLabel("1st Num");
		lb2 = new JLabel("2nd Num");
		lb3 = new JLabel();
		Font f1 = new Font("Arial",Font.BOLD,35);

		b1 = new JButton("+");
		b1.setFont(f1);
		b2 = new JButton("-");
		b2.setFont(f1);
		b3 = new JButton("*");
		b3.setFont(f1);
		b4 = new JButton("/");
		b4.setFont(f1);
		b5 = new JButton("Invert");
		b6 = new JButton("Clear");
		b7 = new JButton("%");
		b7.setFont(f1);
		p1 = new JPasswordField();
		b8 = new JButton("History");

		lb1.setBounds(50,50,100,35);
		tf1.setBounds(120,50,100,35);
		lb2.setBounds(50,100,100,35);
		tf2.setBounds(120,100,100,35);
		lb3.setBounds(400,70,300,35);
		b1.setBounds(50,170,65,65);
		b2.setBounds(135,170,55,65);
		b3.setBounds(220,170,65,65);
		b4.setBounds(305,170,65,65);
		b7.setBounds(390,170,65,65);
		b6.setBounds(50,305,70,35);
		b5.setBounds(130,305,70,35);
		b8.setBounds(210,305,100,35);

		b1.addActionListener(new AddNumbers());
		b2.addActionListener(new SubtractNumbers());
		b3.addActionListener(new MultiplyNumbers());
		b4.addActionListener(new DivisionNumbers());	
		b5.addActionListener(new InvertNumbers());
		b6.addActionListener(new ClearNumbers());
		b7.addActionListener(new ModulusNumbers());
		b8.addActionListener(new History());

		c.add(lb1);
		c.add(tf1);
		c.add(lb2);
		c.add(tf2);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(b7);
		c.add(lb3);
		c.add(b8);

	}
		class History implements ActionListener{
			public void actionPerformed(ActionEvent e){
				String text = lb3.getText();
				int a = Integer.parseInt(text);
				String d = Integer.toString(a);
				tf1.setEnabled(false);
				tf1.setText(d);
			}
		}

	class AddNumbers implements ActionListener{
		public void actionPerformed(ActionEvent e){

			try{
			String s1 = tf1.getText();
			String s2 = tf2.getText();
			int i = Integer.parseInt(s1);
			int j = Integer.parseInt(s2);
				int k = i + j;
				String d = Integer.toString(k);
				lb3.setText(d);
			}
			catch(Exception f){
				lb3.setText("Input is not Correct, Put Numbers only ");
			}
		}
	}

	class ModulusNumbers implements ActionListener{
		public void actionPerformed(ActionEvent e){

			try{
			String s1 = tf1.getText();
			String s2 = tf2.getText();
			int i = Integer.parseInt(s1);
			int j = Integer.parseInt(s2);
				int k = i % j;
				String d = Integer.toString(k);
				lb3.setText(d);
			}
			catch(Exception f){
				lb3.setText("Input is not Correct, Put Numbers only ");
			}
		}
	}

	class SubtractNumbers implements ActionListener{
		public void actionPerformed(ActionEvent e){

			try{
			String s1 = tf1.getText();
			String s2 = tf2.getText();
			int i = Integer.parseInt(s1);
			int j = Integer.parseInt(s2);
				int k = i - j;
				String d = Integer.toString(k);
				lb3.setText(d);
			}
			catch(Exception f){
				lb3.setText("Input is not Correct, Put Numbers only ");
			}
		}
	}
	
	class MultiplyNumbers implements ActionListener{
		public void actionPerformed(ActionEvent e){

			try{
			String s1 = tf1.getText();
			String s2 = tf2.getText();
			int i = Integer.parseInt(s1);
			int j = Integer.parseInt(s2);
				int k = i * j;
				String d = Integer.toString(k);
				lb3.setText(d);
			}
			catch(Exception f){
				lb3.setText("Input is not Correct, Put Numbers only ");
			}
		}
	}
	
	class DivisionNumbers implements ActionListener{
		public void actionPerformed(ActionEvent e){

			try{
			String s1 = tf1.getText();
			String s2 = tf2.getText();
			int i = Integer.parseInt(s1);
			int j = Integer.parseInt(s2);
				int k = i / j;
				String d = Integer.toString(k);
				lb3.setText(d);
			}
			catch(Exception f){
				lb3.setText("Input is not Correct, Put Numbers only ");
			}
		}
	}	
	
	class InvertNumbers implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String t1 = tf1.getText();
			String t2 = tf2.getText();
			if(tf1.isEnabled()==true){
				tf1.setText(t2);
				tf2.setText(t1);
			}
			else{
				lb3.setText("You Can't invert Disabled Field, type in the second field...");
			}
		}
	}

	class ClearNumbers implements ActionListener{
		public void actionPerformed(ActionEvent e){
			tf1.setText("");
			tf2.setText("");
			lb3.setText("");
		}
	}
}

public class MyProject{
	public static void main(String[] args) {
		PersonalFrame f = new PersonalFrame();
		f.setTitle("CALCULATOR");
		f.setVisible(true);
		f.setResizable(true);
		f.setBounds(100,100,1000,900);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}