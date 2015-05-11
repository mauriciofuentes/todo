import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;


public class Instrucciones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instrucciones frame = new Instrucciones();
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
	public Instrucciones() {
		setTitle("Instrucciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("MENU");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				principal obj=new principal();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(310, 128, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextPane txtpndebeLlevarEl = new JTextPane();
		txtpndebeLlevarEl.setEditable(false);
		txtpndebeLlevarEl.setForeground(Color.BLACK);
		txtpndebeLlevarEl.setText("1.-Debe llevar el total de los discos hasta la torre 3.\r\n2.-Tome en cuenta que no debe de colocar un objeto grande sobre uno mas peque\u00F1o que el que esta moviendo.\r\n3.- El total de movimientos afectara su nota final\r\n4.- Tome en cuenta que se le tomara tiempo para la solucion total del juego.\r\n");
		txtpndebeLlevarEl.setToolTipText("");
		txtpndebeLlevarEl.setBounds(20, 11, 391, 106);
		contentPane.add(txtpndebeLlevarEl);
	}
}
