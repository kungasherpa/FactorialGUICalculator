import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FactorialView extends JFrame {

	private JButton button;
	private JTextField numberField;
	private JTextArea resultField;
	private JPanel panel;
	private JLabel myLabel;
	private JLabel message;
	private JFrame myFrame;
	public FactorialView() {
		
		myFrame = new JFrame();
		
		panel = new JPanel();
		button = new JButton("Calculate factorial");
		numberField = new JTextField(10);
		resultField = new JTextArea(15, 30);

		resultField.setEditable(false);
		resultField.setBackground(Color.white);

		numberField.setPreferredSize(new Dimension(25, 30));

		myLabel = new JLabel("Enter Your Number");
		message = new JLabel("by kDs");

		JScrollPane pane = new JScrollPane(resultField,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		pane.setPreferredSize(new Dimension(400, 350));

		panel.add(myLabel);
		panel.add(numberField);
		panel.add(pane);
		panel.add(button);

		Font f = new Font("Serif", Font.BOLD, 20);
		Font newFont = new Font("Serif", Font.PLAIN, 20);

		button.setFont(f);
		myLabel.setFont(f);
		resultField.setFont(newFont);

		resultField.setLineWrap(true);

		myFrame.add(panel);

		myFrame.setTitle("Kunga Sherpa Factorial Calculator");
		myFrame.setVisible(true);
		myFrame.setSize(450, 550);
		myFrame.setResizable(false);

	}

	public String getNumberField() {
		return numberField.getText();
	}

	public void setResultField(String results) {
		resultField.setText(results);
	}

	public void addActionLisetner(ActionListener listener) {

		button.addActionListener(listener);
	}

	public void displayErrorMessage() {
		JOptionPane.showMessageDialog(myFrame, "Error! Please enter a Numeric Value",
				"Error", JOptionPane.ERROR_MESSAGE, null);
	}
	
	public void clearAllField()
	{
		resultField.setText("");
	}
	
	public void displayErrorMessage2() {
		JOptionPane.showMessageDialog(myFrame, "Error! Please enter a Value less than 1000",
				"Error", JOptionPane.ERROR_MESSAGE, null);
	}
	

}
