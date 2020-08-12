package _07_binary_converter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class B_C implements ActionListener{
	JFrame f = new JFrame("Convert 8 bits of binary to ASCII");
	JButton b = new JButton();
	JTextField t = new JTextField(25);
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	B_C(){
		f.setVisible(true);
		f.add(p);
		p.add(t);
		p.add(b);
		p.add(l);
		b.setText("Convert");
		b.addActionListener(this);
		f.pack();
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
	public static void main(String[] args) {
		B_C c = new B_C();
	/*run*/;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = convert(t.getText());
		l.setText(s);
	}
}
