import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;


public class TestBasicCalculator {

	public static void main(String[] args) {
		
		BasicCalculator bCalc = new BasicCalculator();
		bCalc.setTitle("Week 13 Assignment");
		bCalc.setSize(650, 170);
		bCalc.getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		bCalc.setResizable(false);
		bCalc.setLocationRelativeTo(null);		
		bCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bCalc.setVisible(true);
	}

}
