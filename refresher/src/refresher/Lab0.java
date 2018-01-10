package refresher;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Lab0 implements ActionListener{

	JButton button,subButton;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
	
    public void Pane(Container pane) {

	pane.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	c.fill = GridBagConstraints.HORIZONTAL;
	
	button = new JButton("IIITD Fruit Stall");
	c.weightx = 0.0;
	c.ipady = 10;     
	c.fill = GridBagConstraints.HORIZONTAL;	
	c.gridwidth = 4;
	c.gridx = 0;
	c.gridy = 0;
	pane.add(button, c);

	button = new JButton("Inventory");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 2;
	c.gridx = 0;
	c.gridy = 1;
	pane.add(button, c);
	
	button = new JButton("User");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 2;
	c.gridx = 2;
	c.gridy = 1;
	pane.add(button, c);

	button = new JButton("Items");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 0;
	c.gridy = 2;
	pane.add(button, c);
	
	button = new JButton("Quantity");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 1;
	c.gridy = 2;
	pane.add(button, c);
	
	button = new JButton("Items");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 2;
	c.gridy = 2;
	pane.add(button, c);
	
	button = new JButton("Quantity");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 3;
	c.gridy = 2;
	pane.add(button, c);
	
	button = new JButton("Apple");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 0;
	c.gridy = 3;
	pane.add(button, c);
	
	button = new JButton("Mango");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 0;
	c.gridy = 4;
	pane.add(button, c);
	
	button = new JButton("Orange");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 0;
	c.gridy = 5;
	pane.add(button, c);
	
	button = new JButton("Pineapple");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 0;
	c.gridy = 6;
	pane.add(button, c);
	
	button = new JButton("Banana");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 0;
	c.gridy = 7;
	pane.add(button, c);
	
	button = new JButton("Total");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 0;
	c.gridy = 8;
	pane.add(button, c);
	

	button = new JButton("Apple");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 2;
	c.gridy = 3;
	pane.add(button, c);
	
	button = new JButton("Mango");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 2;
	c.gridy = 4;
	pane.add(button, c);
	
	button = new JButton("Orange");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 2;
	c.gridy = 5;
	pane.add(button, c);
	
	button = new JButton("Pineapple");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 2;
	c.gridy = 6;
	pane.add(button, c);
	
	button = new JButton("Banana");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 2;
	c.gridy = 7;
	pane.add(button, c);
	
	button = new JButton("Total");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 2;
	c.gridy = 8;
	pane.add(button, c);
	
	t1 = new JTextField("8");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 1;
	c.gridy = 3;
	pane.add(t1, c);
	
	t2 = new JTextField("3");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 1;
	c.gridy = 4;
	pane.add(t2, c);
	
	t3 = new JTextField("8");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 1;
	c.gridy = 5;
	pane.add(t3, c);
	
	t4 = new JTextField("1");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 1;
	c.gridy = 6;
	pane.add(t4, c);
	
	t5 = new JTextField("2");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 1;
	c.gridy = 7;
	pane.add(t5, c);
	
	t6 = new JTextField("22");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 1;
	c.gridy = 8;
	pane.add(t6, c);
	
	t7 = new JTextField(0);
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 3;
	c.gridy = 3;
	pane.add(t7, c);
	
	t8 = new JTextField(0);
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 3;
	c.gridy = 4;
	pane.add(t8, c);
	
	t9 = new JTextField(0);
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 3;
	c.gridy = 5;
	pane.add(t9, c);
	
	t10 = new JTextField(0);
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 3;
	c.gridy = 6;
	pane.add(t10, c);
	
	t11 = new JTextField(0);
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 3;
	c.gridy = 7;
	pane.add(t11, c);
	
	t12 = new JTextField(0);
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 3;
	c.gridy = 8;
	pane.add(t12, c);
    
	subButton = new JButton("SUBMIT");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.0;
	c.gridwidth = 1;
	c.gridx = 3;
	c.gridy = 9;
	pane.add(subButton, c);
	
	subButton.addActionListener(this);
	
    }
    
    public void actionPerformed(ActionEvent z) {  
        String s1=t1.getText();  
        String s2=t2.getText();
        String s3=t3.getText();  
        String s4=t4.getText();
        String s5=t5.getText();  
        String s7=t7.getText();  
        String s8=t8.getText();
        String s9=t9.getText();  
        String s10=t10.getText();
        String s11=t11.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2); 
        int c=Integer.parseInt(s3);  
        int d=Integer.parseInt(s4);
        int e=Integer.parseInt(s5);  
        int g=Integer.parseInt(s7);  
        int h=Integer.parseInt(s8);
        int i=Integer.parseInt(s9);  
        int j=Integer.parseInt(s10);
        int k=Integer.parseInt(s11);
        int tmp1=a+b+c+d+e;
        if(a>=g){
        	a-=g;       	
        }
        if(b>=h){
        	b-=h;     	
        }
        if(c>=i){
        	c-=i;     	
        }
        if(d>=j){
        	d-=j;        	
        }
        if(e>=k){
        	e-=k;       	
        }
        int tmp2=g+h+i+j+k;
        t1.setText(String.valueOf(a));
        t2.setText(String.valueOf(b));
        t3.setText(String.valueOf(c));
        t4.setText(String.valueOf(d));
        t5.setText(String.valueOf(e)); 
        t6.setText(String.valueOf(tmp1));
        t12.setText(String.valueOf(tmp2));
    }  

    private static void GUI() {
        JFrame frame = new JFrame("IIITD FRUIT STALL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lab0 L=new Lab0();
        L.Pane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI();
            }
        });
    }
}