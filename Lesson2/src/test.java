import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {
	public static void main(String[] args) {
		JFrame frame = new JFrame("FRAME NEW");
		
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lb1 = new JLabel("HELLO WORLD");
		JButton btn1 = new JButton("click");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setBackground(Color.cyan);
			}
		});
		
		frame.add(lb1);
		frame.add(btn1);
		frame.setVisible(true);
	}
}
