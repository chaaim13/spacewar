import javax.swing.JFrame;
import java.awt.BorderLayout;
public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 650);  //size display #1
		frame.getContentPane().setLayout(new BorderLayout());
		
		frame.setVisible(true);
	}
}