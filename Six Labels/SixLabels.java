package HWWeek10;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class SixLabels extends JFrame {
	public SixLabels() {
		setLayout(new GridLayout(2, 3));

		JLabel[] list = { new JLabel("black"), new JLabel("blue"), new JLabel("cyan"), new JLabel("green"), new JLabel("magenta"),
				new JLabel("orange") };

		// set foreground colors
		list[0].setForeground(Color.black);
		
		list[1].setForeground(Color.blue);
		
		list[2].setForeground(Color.cyan);
		
		list[3].setForeground(Color.green);
		list[4].setForeground(Color.magenta);
		list[5].setForeground(Color.orange);

		//adding handcursor for top three labels
		for(int i = 0; i<3; i++){
			list[i].addMouseListener(new MouseAdapter() {
	            public void mouseEntered(MouseEvent e) {
	                e.getComponent().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	                System.out.println("Top three labels has 'Hand-Cursor'");
	           } });    
		}
		// set background colors
		for (int i = 0; i < list.length; i++)
			list[i].setBackground(Color.white);

		// set fonts
		Font font = new Font("TimesRoman", Font.BOLD, 20);

		for (int i = 0; i < list.length; i++)
			list[i].setFont(font);

		// set borders
		Border lineBorder = new LineBorder(Color.yellow, 1);

		for (int i = 0; i < list.length; i++)
			list[i].setBorder(lineBorder);

		// set tooltip
		for (int i = 0; i < list.length; i++)
			list[i].setToolTipText(list[i].getText());

		// add all labels to container
		for (int i = 0; i < list.length; i++)
			add(list[i]);

	}

}
