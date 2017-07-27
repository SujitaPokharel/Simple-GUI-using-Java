import javax.swing.JFrame;


public class TestGUIRadio {

	public static void main(String[] args) {
		
		GUIRadio frame= new GUIRadio();
		frame.pack();
		frame.setSize(500,250);
		frame.setTitle("Week 14 Assignment");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}

}
