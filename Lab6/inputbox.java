import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class inputbox{
	public static void main(String[] args) {
		JFrame frame = new JFrame("JOptionPane showMessageDialog example");
		JOptionPane.showMessageDialog(frame, "Shut down your PC quickly!","Inane warning",
    JOptionPane.WARNING_MESSAGE);
		System.exit(0);
	}
}