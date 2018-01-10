package refresher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class events extends JFrame {
			/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
			private JLabel label;
			private JButton button;
			private JTable table;
			private JTextArea ta;
			private events()
			{
				setLayout(new BorderLayout());
				String[] columns={"Name","Quantity"};
				Object[][] data={
						{"Apple",10},{"Mango",6},{"Orange",8},{"Pineapple",4},{"Banana",2},{"Total",22}
				};
				ta=new JTextArea("",5,5);
				table=new JTable(data,columns);
//				table.add(ta);
				table.setShowGrid(true);
				table.setPreferredScrollableViewportSize(new Dimension(500,80));
				table.setFillsViewportHeight(true);
				JScrollPane scroll=new JScrollPane(table);
				
				add(scroll);
				setLayout(new FlowLayout());
				label=new JLabel("");
				add(label);
				button=new JButton("Submit");
				add(button);
				event e=new event();
				button.addActionListener(e);
			}
			public class event implements ActionListener
			{
				private JPanel panel;
				private JPanel panel1;
				private JTable table1;
				private JFrame frame;
				public void actionPerformed(ActionEvent evt)
				{
//					table.setFillsViewportHeight(false);
					label.setText("Hello");
					setLayout(new BorderLayout());
					String[] columns1={"Name","Quantity"};
					Object[][] data1={
							{"Apple",8},{"Mango",4},{"Orange",8},{"Pineapple",4},{"Banana",2},{"Total",22}
					};
//					panel=new JPanel();
//					panel1=new JPanel();
//					panel.add(table);
//					panel.remove(table);
//					panel.validate();
//					panel.repaint();
					events frame=new events();
					frame.removeAll();
//					table.setShowGrid(false);
//					table.setFillsViewportHeight(false);
					table1=new JTable(data1,columns1);
					table1.setShowGrid(true);
					table1.setPreferredScrollableViewportSize(new Dimension(500,80));
					table1.setFillsViewportHeight(true);
					table1.setAlignmentY(TOP_ALIGNMENT);;
					JScrollPane scroll1=new JScrollPane(table1);
					
					add(scroll1);
//					panel1.add(table1);


//	                System.exit(0);
				}
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 events f=new events();
		f.setTitle("basic frame");
		f.setSize(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
