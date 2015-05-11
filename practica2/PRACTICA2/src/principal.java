import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class principal extends JFrame {


	/**
	 * Create the application.
	 */
	public principal() {
		setTitle("Juego de Hanoi");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("INSTRUCCIONES");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instrucciones obj=new Instrucciones();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(51, 115, 134, 50);
		getContentPane().add(btnNewButton);
			
		JButton btnNewButton_1 = new JButton("DEMO DE JUEGO");
		btnNewButton_1.setBounds(261, 115, 148, 50);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("INICIAR JUEGO");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Torres obj=new Torres();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(144, 186, 155, 50);
		getContentPane().add(btnNewButton_2);
		
	}

	
}
