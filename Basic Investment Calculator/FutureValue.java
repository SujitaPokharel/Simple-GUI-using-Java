import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;


public class FutureValue extends JFrame{
	
	public FutureValue(){
		
		JPanel p1 = new JPanel(new GridLayout(4, 2,2,5));
		
		Dimension dimension = new Dimension(20, 20);
		Dimension buttonDimension = new Dimension(115, 35);
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		
		JLabel investAmt = new JLabel("Investment Amount");
		investAmt.setFont(font);
		p1.add(investAmt);
		
		JTextField txtInvestAmt = new JTextField(10);
		txtInvestAmt.setPreferredSize(dimension);
		txtInvestAmt.setFont(font);
		p1.add(txtInvestAmt);
		
		JLabel yrs = new JLabel("Years");
		yrs.setFont(font);
		p1.add(yrs);	
		
		JTextField txtYrs = new JTextField(10);
		txtYrs.setPreferredSize(dimension);
		txtYrs.setFont(font);
		p1.add(txtYrs);
		
		JLabel annualRate = new JLabel("Annual Interest Rate");	
		annualRate.setFont(font);
		p1.add(annualRate);	
		
		JTextField txtAnnualRate = new JTextField(10);
		txtAnnualRate.setPreferredSize(dimension);
		txtAnnualRate.setFont(font);
		p1.add(txtAnnualRate);
		
		JLabel futureVal = new JLabel("Future Value");
		futureVal.setFont(font);
		p1.add(futureVal);
		
		JTextField txtFutureVal = new JTextField(10);
		txtFutureVal.setPreferredSize(dimension);
		txtFutureVal.setFont(font);
		txtFutureVal.setEditable(false);
		p1.add(txtFutureVal);
		
		Action action = new AbstractAction() {
		    public void actionPerformed(ActionEvent e) {
		    	double investAmt = Double.parseDouble(txtInvestAmt.getText());
				double yrs = Double.parseDouble(txtYrs.getText());
				double annualRate = Double.parseDouble(txtAnnualRate.getText());
				double futureVal = 0;
				
				futureVal = investAmt * Math.pow((1 + (annualRate/1200.0)), (yrs * 12.0));				
				
				txtFutureVal.setText(String.valueOf(new DecimalFormat("#.##").format(futureVal)));
		    }
		};
		
		JButton jbtCalculate = new JButton("Calculate");
		jbtCalculate.setPreferredSize(buttonDimension);
		jbtCalculate.setFont(font);
		jbtCalculate.addActionListener(action);
		jbtCalculate.setMnemonic('C');		
		add(jbtCalculate);
		
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(jbtCalculate);
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		
	}

}
