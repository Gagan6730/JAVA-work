package ap;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculator extends JFrame {
	
	/**
 * 
 */

private static final long serialVersionUID = 1L;
	static JFrame f=new JFrame();
	
	public calculator()
	{
		f.setTitle("basic frame");
		f.setSize(300,100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JTextField text=new JTextField();
		JPanel panel=new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		c.weightx = 0.0;
		c.ipady = 10;
		c.ipadx=300;
		c.fill = GridBagConstraints.HORIZONTAL;	
		c.gridwidth = 4;
		c.gridx = 0;
		c.gridy = 0;
		panel.add(text,c);
		c.fill = GridBagConstraints.BOTH;
		c.weightx =0.0;
//		c.gridheight=1;
//		c.gridwidth=4;
		c.gridx=0;
		c.gridy=1;
		c.ipadx=1;
		c.ipady=1;
		panel.add(b1, c);
		c.gridx=1;
		c.gridy=1;
		c.ipadx=2;
		c.ipady=2;
//		c.gridy=2;
		panel.add(b2,c);
		JScrollPane scroll=new JScrollPane(panel);
		add(scroll);
		f.add(panel);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c=new calculator();
//		f.setTitle("basic frame");
//		f.setSize(500,500);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setVisible(true);
	}

}
