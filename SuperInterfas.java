

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuperInterfas {

	private JFrame frame;
	private String [] superHeroes;
	private String [] tipoHeroe;
	private String [] superPoderesKriptoniano;
	private String [] superPoderesVelocista; 
	private String [] superPoderSuperSoldado;
	Kriptoniano krp = new Kriptoniano();
	SuperSoldado sld = new SuperSoldado();
	Velocista vl = new Velocista();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperInterfas window = new SuperInterfas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SuperInterfas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		superHeroes  = new String [] {"Kryptoniano","Super Soldado","Velocista"};
		tipoHeroe = new String [] {"Fuerte","Manipular tiempo","Regeneración","Super Velocidad","Volador"};
		superPoderesKriptoniano = new String [] {"Golpear","Levantar peso","Empujar","Lanzar","Volar","Aterrizar","Flotar","Despegar","Curación","Dejar de envejecer","Recuperación rapida","Saludable","Correr rapido","Ondas sonicas","Aceleración Metabolismo","Velocidad de la luz"};
		superPoderesVelocista = new String [] {"Viajar al pasado","Viajar al futuro","Dobles de tiempo","Crear lineas de tiempo","Correr rapido","Ondas sonicas","Aceleración Metabolismo","Velocidad de la luz","Curación","Dejar de envejecer","Recuperación rapida","Saludable"};
		superPoderSuperSoldado = new String [] {"Curación","Dejar de envejecer","Recuperación rapida","Saludable","Golpear","Levantar peso","Empujar","Lanzar"};
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1160, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(SuperInterfas.class.getResource("superhero-png-1123213.png")));
		lblNewLabel_4.setBounds(319, 314, 284, 311);
		lblNewLabel_4.setVisible(false);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(155, 727, 700, 62);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		
		JLabel lblNewLabel_2_1 = new JLabel("Elija clase de heroe");
		lblNewLabel_2_1.setBounds(289, 690, 124, 26);
		lblNewLabel_2_1.setForeground(new Color(0, 0, 255));
		frame.getContentPane().add(lblNewLabel_2_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("Elija super poder");
		lblNewLabel_2.setBounds(289, 653, 124, 26);
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox_1_1 = new JComboBox(new Object[]{});
		comboBox_1_1.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		comboBox_1_1.setBounds(155, 646, 124, 41);
		frame.getContentPane().add(comboBox_1_1);
		
		JComboBox comboBox = new JComboBox(superHeroes);
		comboBox.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		comboBox.setBounds(155, 686, 124, 41);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switch(comboBox.getSelectedIndex()) {
				
				case 0: comboBox_1_1.removeAllItems();
						comboBox_1_1.setModel(new DefaultComboBoxModel(superPoderesKriptoniano));
						comboBox_1_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								if(comboBox_1_1.getSelectedItem() == "Golpear") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.golpear());	
									
								}else if(comboBox_1_1.getSelectedItem() == "Levantar peso") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.levantarPeso());
									
								}else if(comboBox_1_1.getSelectedItem() == "Empujar") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.empujar());
									
								}else if(comboBox_1_1.getSelectedItem() == "Lanzar") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.lanzar());
									
								}else if(comboBox_1_1.getSelectedItem() == "Volar") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.volar());
									
								}else if(comboBox_1_1.getSelectedItem() == "Aterrizar") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.aterrizar());
									
								}else if(comboBox_1_1.getSelectedItem() == "Flotar") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.flotar());
									
								}else if(comboBox_1_1.getSelectedItem() == "Despegar") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.despegar());
									
								}else if(comboBox_1_1.getSelectedItem() == "Curación") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.curacion());
									
								}else if(comboBox_1_1.getSelectedItem() == "Dejar de envejecer") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.dEvejecer());
									
								}else if(comboBox_1_1.getSelectedItem() == "Recuperación rapida") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.rRapida());
									
								}else if(comboBox_1_1.getSelectedItem() == "Saludable") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.saludable());
									
								}else if(comboBox_1_1.getSelectedItem() == "Correr rapido") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.correr_volar());
									
								}else if(comboBox_1_1.getSelectedItem() == "Ondas sonicas") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.ondasSonicas());
									
								}else if(comboBox_1_1.getSelectedItem() == "Aceleración Metabolismo") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.aMetabolismo());
									
								}else if(comboBox_1_1.getSelectedItem() == "Velocidad de la Luz") {
									lblNewLabel_4.setVisible(true);
									lblNewLabel_3.setText(krp.velocidadLuz());
									
								}
							}
						});
						
				case 1: comboBox_1_1.removeAllItems();
				comboBox_1_1.setModel(new DefaultComboBoxModel(superPoderesVelocista));
				comboBox_1_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						 if(comboBox_1_1.getSelectedItem() == "Correr rapido") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(vl.correr_volar());
							
						}else if(comboBox_1_1.getSelectedItem() == "Ondas sonicas") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(vl.ondasSonicas());
							
						}else if(comboBox_1_1.getSelectedItem() == "Aceleración Metabolismo") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(vl.aMetabolismo());
							
						}else if(comboBox_1_1.getSelectedItem() == "Velocidad de la Luz") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(vl.velocidadLuz());
							
						}else if(comboBox_1_1.getSelectedItem() == "Curación") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(vl.curacion());
							
						}else if(comboBox_1_1.getSelectedItem() == "Dejar de envejecer") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(vl.dEvejecer());
							
						}else if(comboBox_1_1.getSelectedItem() == "Recuperación rapida") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(vl.rRapida());
							
						}else if(comboBox_1_1.getSelectedItem() == "Saludable") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(vl.saludable());
							
						}else if(comboBox_1_1.getSelectedItem() == "Viajar al pasado") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(vl.vPasado());
							
						}
						else if(comboBox_1_1.getSelectedItem() == "Viajar al futuro") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(vl.vFuturo());
							
						}else if(comboBox_1_1.getSelectedItem() == "Dobles de tiempo") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(vl.doblesTiempo());
						
						}else if(comboBox_1_1.getSelectedItem() == "Crear lineas de tiempo") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(vl.clineasT());
							
						}
					}
				});	
				case 2: comboBox_1_1.removeAllItems();
				comboBox_1_1.setModel(new DefaultComboBoxModel(superPoderSuperSoldado));
				comboBox_1_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						 if(comboBox_1_1.getSelectedItem() == "Golpear") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(sld.golpear());	
							
						}else if(comboBox_1_1.getSelectedItem() == "Levantar peso") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(sld.levantarPeso());
							
						}else if(comboBox_1_1.getSelectedItem() == "Empujar") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(sld.empujar());
							
						}else if(comboBox_1_1.getSelectedItem() == "Lanzar") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(sld.lanzar());
							
						}if(comboBox_1_1.getSelectedItem() == "Curación") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(sld.curacion());
							
						}else if(comboBox_1_1.getSelectedItem() == "Dejar de envejecer") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(sld.dEvejecer());
							
						}else if(comboBox_1_1.getSelectedItem() == "Recuperación rapida") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(sld.rRapida());
							
						}else if(comboBox_1_1.getSelectedItem() == "Saludable") {
							lblNewLabel_4.setVisible(true);
							lblNewLabel_3.setText(sld.saludable());
							
						}
					}
				});	
				
				
				}
				
				
			}
		});
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Reiniciar super heroe");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboBox_1_1.removeAllItems();
				lblNewLabel_3.setText("");
				lblNewLabel_4.setVisible(false);
				
				
			}
		});
		btnNewButton.setBounds(506, 646, 124, 41);
		frame.getContentPane().add(btnNewButton);
		
	
		JPanel panel = new JPanel();
		panel.setBackground(new Color(170, 255, 255));
		panel.setBounds(151, 623, 768, 177);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SuperInterfas.class.getResource("Border final.png")));
		lblNewLabel.setBounds(96, 224, 700, 700);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(SuperInterfas.class.getResource("fin logo 2.png")));
		lblNewLabel_1.setBounds(270, 11, 400, 266);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		
		
	
		
		
		
		
		
		
		
				
		
		
	}
}
