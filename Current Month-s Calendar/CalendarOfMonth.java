import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.DateFormatSymbols;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class CalendarOfMonth extends JFrame {

	CalendarOfMonth() {

		GregorianCalendar date = new GregorianCalendar();

		setLayout(new BorderLayout(5, 5));
		setSize(700, 400);
		// set the title
		setTitle("Week11 Homework");

		int month = date.get(GregorianCalendar.MONTH) + 1;// Gregorian calendar starts with 0 i.e. January = 0
		int year = date.get(GregorianCalendar.YEAR);
		String monthYear = new String(month+"/"+year);
		JLabel monthYearLabel = new JLabel(monthYear, SwingConstants.CENTER);
		monthYearLabel.setFont(new Font("SansSerif", Font.PLAIN, 17));
		
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(monthYearLabel, BorderLayout.NORTH);

		Border border = LineBorder.createBlackLineBorder();

		DateFormatSymbols symbols = new DateFormatSymbols();
		String[] weekday_symbols = symbols.getWeekdays();

		JPanel weekday_labels = new JPanel(new GridLayout(0, 7));
		weekday_labels.setBorder(border);
		// populate the weekday names row
		for (int i = 1; i < weekday_symbols.length; i++) {
			JLabel weekday = new JLabel(weekday_symbols[i]);
			weekday.setHorizontalAlignment(JLabel.CENTER);
			weekday.setVerticalAlignment(JLabel.BOTTOM);
			weekday.setFont(new Font("SansSerif", Font.PLAIN, 17));
			weekday_labels.add(weekday);
		}


		int first = date.get(date.DAY_OF_WEEK);

		int days_in_month = date.getActualMaximum(date.DAY_OF_MONTH);

		for (int i = 1; i < days_in_month + first; i++) {

			if (i - first + 1 > 0) {
				JLabel day = new JLabel("" + (i - first + 1));
				day.setBorder(border);
				day.setHorizontalAlignment(JLabel.RIGHT);
				weekday_labels.add(day);
			} else {
				// placeholder, since you can't skip cells.
				JPanel empty = new JPanel();
				weekday_labels.add(empty);
			}
		}
	
		mainPanel.add(weekday_labels, BorderLayout.CENTER);
		
		add(mainPanel);
		

		
	}
}
