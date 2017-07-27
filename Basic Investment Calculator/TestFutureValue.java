import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;


public class TestFutureValue {

	public static void main(String[] args) {
		FutureValue futureVal = new FutureValue();
		futureVal.setSize(475, 300);
		futureVal.setTitle("Exercise16_5");
		futureVal.getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		futureVal.setResizable(false);
		futureVal.setLocationRelativeTo(null);
		futureVal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		futureVal.setVisible(true);

	}

}
