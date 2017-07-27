import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BasicCalculator extends JFrame {

	public BasicCalculator() {

		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 25));
		
		//Defining settings for our buttons and textFields
		Dimension dimension = new Dimension(20, 30);
		Dimension buttonDimension = new Dimension(115, 35);
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		
		JLabel number1Label = new JLabel("Number 1");
		number1Label.setFont(font);
		add(number1Label);
		
		JTextField number1Field = new JTextField(8);
		number1Field.setPreferredSize(dimension);
		number1Field.setFont(font);
		add(number1Field);
		
		JLabel number2Label = new JLabel("Number 2");
		number2Label.setFont(font);
		add(number2Label);
		
		JTextField number2Field = new JTextField(8);
		number2Field.setPreferredSize(dimension);
		number2Field.setFont(font);
		add(number2Field);
		
		JLabel resultLabel = new JLabel("Result");
		resultLabel.setFont(font);
		add(resultLabel);
		
		JTextField resultField = new JTextField(8);
		resultField.setPreferredSize(dimension);
		resultField.setFont(font);
		resultField.setEditable(false);
		add(resultField);
		
		Action action = new AbstractAction() {
		    public void actionPerformed(ActionEvent e) {
		    	double number1 = Double.parseDouble(number1Field.getText());
				double number2 = Double.parseDouble(number2Field.getText());
				double result = 0;
				
				if(e.getActionCommand().equals("Add"))
					 result = number1+number2;
				else if(e.getActionCommand().equals("Subtract"))
					result = number1-number2;
				else if(e.getActionCommand().equals("Multiply"))
					result = number1*number2;
				else if (e.getActionCommand().equals("Divide"))
					result = number1/number2;
				
				resultField.setText(String.valueOf(new DecimalFormat("#.##").format(result)));
		    }
		};
		
		JButton addButton = new JButton("Add");
		addButton.setPreferredSize(buttonDimension);
		addButton.setFont(font);
		addButton.addActionListener(action);
		addButton.setMnemonic('A');
		add(addButton);
		
		JButton subtractButton = new JButton("Subtract");
		subtractButton.setPreferredSize(buttonDimension);
		subtractButton.setFont(font);
		subtractButton.addActionListener(action);
		subtractButton.setMnemonic('S');
		add(subtractButton);
		
		JButton multiplyButton = new JButton("Multiply");
		multiplyButton.setPreferredSize(buttonDimension);
		multiplyButton.setFont(font);
		multiplyButton.addActionListener(action);
		multiplyButton.setMnemonic('M');;
		add(multiplyButton);
		
		JButton divideButton = new JButton("Divide");
		divideButton.setPreferredSize(buttonDimension);
		divideButton.setFont(font);
		divideButton.setFocusable(true);
		divideButton.addActionListener(action);
		divideButton.setMnemonic('D');
		add(divideButton);
		
	}
}
