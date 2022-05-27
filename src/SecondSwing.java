import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SecondSwing implements ActionListener{

	public static void main(String[] args) {
		new SecondSwing();

	}
	public SecondSwing() {
		JFrame f = new JFrame("This is a new application");
		final JTextField tf = new JTextField("Welcome to Javapoint");
		tf.setBounds(50,30,260,260);
		JButton b = new JButton("click");
		b.setBounds(100,100,95,30);
		b.addActionListener(new ActionListener(){
			public void actionPerfomed(ActionEvent e) {
				tf.setText("Welcome to Javapoint");
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				
			
			}
			
		});
		f.add(b);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,400);
		f.add(tf);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
