import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		JLabel label = new JLabel();
		label.setText("Hi Guys");
		label.setVerticalAlignment(JLabel.BOTTOM);
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.RED);
		redpanel.setBounds(0, 0, 100, 100);
		
		redpanel.setLayout(new BorderLayout());
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.BLUE);
		bluepanel.setBounds(0, 0, 200, 100);
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0, 0, 200, 200);
		

		JFrame frame =new JFrame();
		
		
		frame.setVisible(true);
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setTitle("Panel");
		
		redpanel.add(label);
		
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
		

	}

}
