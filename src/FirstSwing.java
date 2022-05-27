import javax.swing.JButton;
import javax.swing.JFrame;

class Swing {
	public Swing() {
		JFrame f = new JFrame();// create instance of JFrame
		JButton b = new JButton("click");// create instance of JButton
		b.setBounds(150, 150, 100, 40); // x axis, y axis, width, height sets the position of the button.
		f.add(b); // add button to the frame
		f.setSize(500, 500); // frame size, width, height
		f.setLayout(null);// using no layout manager.
		f.setVisible(true);// making the frame visible.

	}
}

public class FirstSwing {

	public static void main(String[] args) {
		new Swing();

	}

}
