package co.edu.unibague.apo1.redg9.interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.unibague.apo1.redg9.mundo.Red;

public class PanelCrearUsuario extends JPanel implements ActionListener{
	
	private JLabel etiquetaNombre;
	private JTextField campoNombre;
	
	private JLabel etiquetaCorreo;
	private JTextField campoCorreo;
	
	private JLabel etiquetaGenero;
	private JTextField campoGenero;
	
	private JLabel etiquetaPais;
	private JTextField campoPais;
	
	private JLabel etiquetaTelefono;
	private JTextField campoTelefono;
	
	private JLabel etiquetaRelacion;
	private JTextField campoRelacion;
	
	private JButton botonCrear;
	private JButton botonSalir;
	
	private Red redSocial;
	
	public PanelCrearUsuario(Red pRedSocial){
		
		redSocial = pRedSocial;
		
		this.setLayout(new GridLayout(7, 2));
		
		etiquetaNombre = new JLabel("Nombre:");
		this.add(etiquetaNombre);
		campoNombre = new JTextField();
		this.add(campoNombre);
		
		etiquetaCorreo = new JLabel("Correo:");
		this.add(etiquetaCorreo);
		campoCorreo = new JTextField();
		this.add(campoCorreo);
		
		etiquetaGenero = new JLabel("Genero:");
		this.add(etiquetaGenero);
		campoGenero = new JTextField();
		this.add(campoGenero);
		
		etiquetaPais = new JLabel("Pais:");
		this.add(etiquetaPais);
		campoPais = new JTextField();
		this.add(campoPais);
		
		etiquetaTelefono = new JLabel("Telefono:");
		this.add(etiquetaTelefono);
		campoTelefono = new JTextField();
		this.add(campoTelefono);
		
		etiquetaRelacion = new JLabel("Relacion:");
		this.add(etiquetaRelacion);
		campoRelacion = new JTextField();
		this.add(campoRelacion);
		
		// Botonos
		botonCrear = new JButton("Crear");
		botonCrear.setActionCommand("Crear");
		botonCrear.addActionListener(this);
		this.add(botonCrear);
				
		botonSalir = new JButton("Salir");
		botonSalir.setActionCommand("Salir");
		botonSalir.addActionListener(this);
		
		this.add(botonSalir);
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		 
		if(evento.getActionCommand().equals(botonCrear.getActionCommand())){
			System.out.println("Crear usuario");
		}
		else{
			System.out.println("Salir");
		}
	}
	
	
	
	

}
