package wtest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.ResourceBundle;	// import ResourceBundles

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Wtest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// properties definitions
	static String btn_str;	// button text srting
	// reading properties and bundles resource var r defs
	static ResourceBundle r = ResourceBundle.getBundle("test");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		// get properties from button text string by KEY1=ìåãû 
		btn_str = r.getString("KEY1");
		// create windows by WindowBuilder
		EventQueue.invokeLater(new Runnable() {;
			public void run() {
				try {
					Wtest frame = new Wtest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Wtest() {
		setTitle("button caption change");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 99);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// button text set to the text in properties
		JButton btnNewButton = new JButton(btn_str);
		btnNewButton.setBounds(12, 10, 91, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Caption change");
		// set button action for changing button text by clicking caption change button
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// get JEY2=ëÂç„ from properties
				btn_str = r.getString("KEY2");
				// change button text to KEY2 property value
				btnNewButton.setText(btn_str);
			}
		});
		btnNewButton_1.setBounds(115, 10, 111, 21);
		contentPane.add(btnNewButton_1);
	}
}
