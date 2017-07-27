 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;

 import javax.swing.*;
	
public class GUIRadio extends JFrame{
	
	public GUIRadio(){
		
		JPanel p1= new JPanel(new GridLayout());
		p1.add(new JLabel("Select Message Panel Background"));
		JPanel p2= new JPanel(new GridLayout());
		
		JRadioButton red = new JRadioButton("Red");
		JRadioButton yellow = new JRadioButton("Yellow");
		JRadioButton white = new JRadioButton("White");
		JRadioButton gray = new JRadioButton("Gray");
		JRadioButton green = new JRadioButton("Green");
		
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(red);
		group.add(yellow);
		group.add(white);
		group.add(gray);
		group.add(green);
		p2.add(red);
		p2.add(yellow);
		p2.add(gray);
		p2.add(green);
		p2.add(white);
		
		JPanel p3 = new JPanel(new GridLayout());
		final JTextField text = new JTextField("Welcome to Java");
		p3.add(text);
		
		red.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){				
				text.setBackground(Color.RED);
			}
		});
		
		yellow.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent e)
			{
				text.setBackground(Color.YELLOW);
			}			
		});
		
	    white.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e)
			{
				text.setBackground(Color.WHITE);
			}			
		});
		
		gray.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e)
			{
				text.setBackground(Color.GRAY);
			}			
		});
		
		green.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e)
			{
				text.setBackground(Color.GREEN);
			}			
		});
		
		JPanel p4 = new JPanel(new GridLayout());
		JButton left= new JButton("<=");
		JButton righht= new JButton("=>");
		p4.add(left);
		p4.add(righht);
		
		left.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e)
			{
				text.setHorizontalAlignment(text.LEFT);				
			}			
		});
		
		righht.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				text.setHorizontalAlignment(text.RIGHT);				
			}			
		});
		
		JPanel p5=new JPanel(new GridLayout(4,0));
		p5.add(p1);
		p5.add(p2);
		p5.add(p3);
		p5.add(p4);
		add(p5);
	}	
	}


