package co.edu.unibague.apo1.redg9.interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelDeBotones extends JPanel{
	
	private JButton agregarUsuario;
	private JButton verUsuario;
	private JButton listarUsuarios;
	private JButton eliminarUsuario;
	
	
	public PanelDeBotones(){
		
		// Organizo el Layout
		this.setLayout(new GridLayout(4, 1));
		
		// Creo el primer boton.
		agregarUsuario = new JButton("Agregar Usuario");
		agregarUsuario.setBackground(Color.orange);
		// Agrego el boton al panel.
		this.add(agregarUsuario);
		
		verUsuario = new JButton("Ver Usuario");
		this.add(verUsuario);
		
		listarUsuarios = new JButton("Listar Usuarios");
		this.add(listarUsuarios);
		
		eliminarUsuario = new JButton("Eliminar Usuario");
		this.add(eliminarUsuario);
		
	}
	
	
	
	
	

}
