package co.edu.unibague.apo1.redg9.interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import co.edu.unibague.apo1.redg9.mundo.Red;

public class PanelDeBotones extends JPanel implements ActionListener{
	
	private JButton agregarUsuario;
	private JButton verUsuario;
	private JButton listarUsuarios;
	private JButton eliminarUsuario;
	private Red redSocial;
	
	public PanelDeBotones(Red pRedSocial){
		
		redSocial = pRedSocial;
		
		// Organizo el Layout
		this.setLayout(new GridLayout(4, 1));
		
		// Creo el primer boton.
		agregarUsuario = new JButton("Agregar Usuario"); // Inicializar
		agregarUsuario.setActionCommand("Agregar"); // El comando
		agregarUsuario.addActionListener(this); // El escuchador
		this.add(agregarUsuario); // Se agrega al panel.
		
		verUsuario = new JButton("Ver Usuario");
		verUsuario.setActionCommand("Ver");
		verUsuario.addActionListener(this);
		this.add(verUsuario);
		
		listarUsuarios = new JButton("Listar Usuarios");
		listarUsuarios.setActionCommand("Listar");
		listarUsuarios.addActionListener(this);
		this.add(listarUsuarios);
		
		eliminarUsuario = new JButton("Eliminar Usuario");
		eliminarUsuario.setActionCommand("Eliminar");
		eliminarUsuario.addActionListener(this);
		this.add(eliminarUsuario);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getActionCommand().equals(agregarUsuario.getActionCommand())){
			agregarNuevoUsuario();
		}
		else{
			System.out.println(evento.getActionCommand());
		}
	}
	
	public void agregarNuevoUsuario(){
		new InterfazCrearUsuario(redSocial).setVisible(true);
	}

	
	
	
	
	

}
