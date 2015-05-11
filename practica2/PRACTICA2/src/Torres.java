import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Canvas;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Torres extends javax.swing.JFrame{
	private JFrame frmTorresDeHanoi;
    static int[][] torre = new int[64][64];// matriz
    int i;
    int j;
    int escalones = 3;
    static int jj = 4;
    public int desde = 0;
    public int hasta = 0;
    int contador; //solo hasta 1
    int torreDesde;
    int guardaIDesde;
    int torreHasta;
    int guardaIHasta;
    //int jugadasPosibles;//almacena resultado de formula matematica
    int jugadasRealizadas;
    //int aciertos;
    //int avisos;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Torres window = new Torres();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */


	public Torres() {
		initComponents();
        jlblNewLabel_5.setText("");// borra desde
        jlblNewLabel_6.setText("");// borra hasta

        //laman a estos metodos
        ultimaPosicionMatriz();
        llenarMatriz();
    }

    /*
     * Este metodo carga la ultima posicion de la columna con el valor del
     * numero de escalones. Permite detectar el primer lugar disponible de cada
     * torre para colocar un nuevo escalon. Igual no es necesario Comprobare mas
     * adelante
     */
    public void ultimaPosicionMatriz() {
        torre[escalones][1] = escalones;
        torre[escalones][2] = escalones;
        torre[escalones][3] = escalones;
        
        for (i = 1; i < escalones + 1; i++) {
            for (j = 1; j < jj; j++) {
                System.out.print("               " + torre[i][j]);
            }
            System.out.println();
        }
        System.out.println("prueba    ==========      ==========       =========");
        System.out.println("               1               2               3");
    }

    public void llenarMatriz() {
        System.out.println("------------------------------------------------------------");
        for (i = 1; i < escalones; i++) {
            for (j = 1; j < jj; j++) {
                torre[i][j] = 0;
                torre[i][1] = i;
            }
        }
        mostrarMatriz();
    }

    /*
     * Este modulo solo imprime en pantalla en modo texto el contenido de cada
     * base. Puede comentarse las lineas con "System.out.println" pero el modulo
     * es imprescindible para que el programa conozca que escalones hay en cada
     * base.
     */
    public void mostrarMatriz() {
        for (i = 1; i < escalones; i++) {
            for (j = 1; j < jj; j++) {
                System.out.print("               " + torre[i][j]);
            }
            System.out.println();
        }
        System.out.println("          ==========      ==========       =========");
        System.out.println("               1               2               3");
        //jLabel7.setVisible(false);//Muestra cara con sonrisa


    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
    	jbtnTorre = new javax.swing.JButton();
        jbtnNewButton = new javax.swing.JButton();
        jbtnNewButton_1 = new javax.swing.JButton();
        jlblNewLabel = new javax.swing.JLabel();
        jlblNewLabel_1 = new javax.swing.JLabel();
        jlblSexto = new javax.swing.JLabel();
        jlblNewLabel_2 = new javax.swing.JLabel();
        jlblNewLabel_3 = new javax.swing.JLabel();
        jlblNewLabel_4 = new javax.swing.JLabel();
        jlblNewLabel_5= new javax.swing.JLabel();
        jlblNewLabel_6 = new javax.swing.JLabel();
        jlblNewLabel_7 = new javax.swing.JLabel();
        jlblNewLabel_8 = new javax.swing.JLabel();
        jlblNewLabel_9= new javax.swing.JLabel();
        jlblNewLabel_11  = new javax.swing.JLabel();


		setTitle("Torres de Hanoi");
		setBounds(100, 100, 925, 529);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnTorre = new JButton("TORRE 1");
		btnTorre.setBounds(26, 301, 265, 50);
		btnTorre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTorreActionPerformed1(evt);
            }

		
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnTorre);
		
		JButton btnNewButton = new JButton("TORRE 2");
		btnNewButton.setBounds(330, 301, 265, 50);
		btnNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewButtonActionPerformed(evt);
            }
		});
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("TORRE 3");
		btnNewButton_1.setBounds(634, 301, 265, 50);
		btnNewButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewButton_1ActionPerformed(evt);
            }
		});
		getContentPane().add(btnNewButton_1);
		
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.setBounds(811, 456, 77, 23);
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal obj=new principal();
				obj.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(btnMenu);
		btnNewButton_2addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mauricio\\Pictures\\imagens\\images-4.jpeg"));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setBounds(70, 279, 186, 23);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Mauricio\\Pictures\\imagens\\images-4.jpeg"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(88, 255, 153, 23);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblSexto = new JLabel("");
		lblSexto.setIcon(new ImageIcon("C:\\Users\\Mauricio\\Pictures\\imagens\\images-4.jpeg"));
		lblSexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblSexto.setBounds(99, 231, 132, 23);
		getContentPane().add(lblSexto);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Mauricio\\Pictures\\imagens\\images-4.jpeg"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(111, 207, 110, 23);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Mauricio\\Pictures\\imagens\\images-4.jpeg"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(125, 153, 83, 23);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Mauricio\\Pictures\\imagens\\images-4.jpeg"));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(120, 176, 95, 30);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Mauricio\\Pictures\\imagens\\images-4.jpeg"));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(131, 130, 71, 23);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Mauricio\\Pictures\\imagens\\images-4.jpeg"));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(143, 107, 47, 23);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Jugadas posibles");
		lblNewLabel_7.setBounds(26, 364, 176, 23);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Aciertos");
		lblNewLabel_8.setBounds(26, 398, 176, 23);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Jugadas realizadas");
		lblNewLabel_9.setBounds(26, 433, 176, 23);
		getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Avisos");
		lblNewLabel_10.setBounds(309, 362, 203, 23);
		getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Tiempo (seg.)");
		lblNewLabel_11.setBounds(307, 402, 205, 23);
		getContentPane().add(lblNewLabel_11);
	}


	private void btnNewButton_2addActionListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}

	protected void jbtnNewButton_1ActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void jbtnTorreActionPerformed1(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void jbtnNewButtonActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	public JFrame getFrmTorresDeHanoi() {
		return frmTorresDeHanoi;
	}

	public void setFrmTorresDeHanoi(JFrame frmTorresDeHanoi) {
		this.frmTorresDeHanoi = frmTorresDeHanoi;
		
	}


    private void jbtnTorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (desde == 0) {
            desde = 1;
            jlblNewLabel_5.setText("" + desde);
        } else {
            if (hasta == 0) {

                hasta = 1;
                jlblNewLabel_6.setText("" + hasta);

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnNewButtonActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (desde == 0) {
            desde = 2;
            jlblNewLabel_5.setText("" + desde);
        } else {
            if (hasta == 0) {

                hasta = 2;
                jlblNewLabel_6.setText("" + hasta);
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnNewButton_1ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (desde == 0) {
            desde = 3;
            jlblNewLabel_5.setText("" + desde);
        } else {
            if (hasta == 0) {

                hasta = 3;
                jlblNewLabel_6.setText("" + hasta);
            }
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //torreHastaVacia();
        jugadasRealizadas = jugadasRealizadas + 1;
        jlblNewLabel_3.setText("" + jugadasRealizadas);
        colocarEscalones();
        mostrarMatriz();
        desde = 0;
        jlblNewLabel_5.setText("");
        hasta = 0;
        jlblNewLabel_6.setText("");

    }//GEN-LAST:event_jButton4ActionPerformed

    public void colocarEscalones() {
        for (i = 1; i < escalones; i++) {
            if (torre[i][desde] == 0) {
            } else {
                contador = contador + 1;
                if (contador == 1) {
                    torreDesde = torre[i][desde];
                    guardaIDesde = i;// imprescindible para retornar valores en caso de poner escalon grande encima de pequeño
                    torre[i][desde] = 0;
                }
            }
        }
        contador = 0;

        for (i = 1; i < escalones; i++) {
            if (torre[i + 1][hasta] == 0) {
            } else {
                contador = contador + 1;
                if (contador == 1) {
                    guardaIHasta = i; //imprescindible para retornar valores en caso de poner escalon grande encima de pequeño
                    torre[i][hasta] = torreDesde;
                }
            }
        }
        contador = 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main1(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new torre().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnTorre;
    private javax.swing.JButton jbtnNewButton;
    private javax.swing.JButton jbtnNewButton_1;
    private javax.swing.JLabel jlblNewLabel;
    private javax.swing.JLabel jlblNewLabel_1;
    private javax.swing.JLabel jlblSexto;
    private javax.swing.JLabel jlblNewLabel_2;
    private javax.swing.JLabel jlblNewLabel_3;
    private javax.swing.JLabel jlblNewLabel_4;
    private javax.swing.JLabel jlblNewLabel_5;
    private javax.swing.JLabel jlblNewLabel_6;
    private javax.swing.JLabel jlblNewLabel_7;
    private javax.swing.JLabel jlblNewLabel_8;
    private javax.swing.JLabel jlblNewLabel_9;
    private javax.swing.JLabel jlblNewLabel_10;
    private javax.swing.JLabel jlblNewLabel_11;
    // End of variables declaration//GEN-END:variables
}
