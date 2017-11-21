package co.edu.unibague.apo1.redg9.interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.unibague.apo1.redg9.mundo.Red;
import co.edu.unibague.apo1.redg9.mundo.Usuario;

public class PanelCrearUsuario extends JPanel implements ActionListener{
	
	private JLabel etiquetaNombre;
	private JTextField campoNombre;
	
	private JLabel etiquetaCorreo;
	private JTextField campoCorreo;
	
	private JLabel etiquetaGenero;
	//private JTextField campoGenero;
	private JComboBox<String> selectorGenero;
	
	private JLabel etiquetaPais;
	private JTextField campoPais;
	
	private JLabel etiquetaTelefono;
	private JTextField campoTelefono;
	
	private JLabel etiquetaRelacion;
    //private JTextField campoRelacion;
	private JComboBox<String> selectorRelacion;
	
	private JButton botonCrear;
	private JButton botonSalir;
	
	private JFrame ventana;
	private Red redSocial;
	
	public PanelCrearUsuario(Red pRedSocial, JFrame ventana){
		
		redSocial = pRedSocial;
		this.ventana = ventana;
		
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
		//campoGenero = new JTextField();
		//this.add(campoGenero);
		String[] generos = { Usuario.GENERO_FEMENINO+"" , Usuario.GENERO_MASCULINO+"", Usuario.GENERO_OTRO+"" };
		selectorGenero = new JComboBox<>(generos);
		this.add(selectorGenero);
		
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
		//campoRelacion = new JTextField();
		//this.add(campoRelacion);
		String[] relaciones = { Usuario.ESTADO_RELACION_SOLTERO, Usuario.ESTADO_RELACION_CASADO, Usuario.ESTADO_RELACION_VIUDO, Usuario.ESTADO_RELACION_FOREVER, Usuario.ESTADO_RELACION_FRIENDZONE, Usuario.ESTADO_RELACION_NOVIAZGO };
		selectorRelacion = new JComboBox<>(relaciones);
		this.add(selectorRelacion);
		
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
	
	public void agregarNuevoUsuario() {
		
		String nombre = campoNombre.getText();
		String correo = campoCorreo.getText();
		String pais = campoPais.getText();
		String telefono = campoTelefono.getText();
		String relacion = (String)selectorRelacion.getSelectedItem();
		String genero = (String)selectorGenero.getSelectedItem();
		try {
			redSocial.agregarUsuario(nombre, correo, genero.charAt(0), relacion, pais, telefono);
			JOptionPane.showMessageDialog(null, "Se ha podido agregar el usuario.","Mensaje de Confirmacion",JOptionPane.INFORMATION_MESSAGE);
			ventana.dispose();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha podido agregar el usuario.","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		 
		if(evento.getActionCommand().equals(botonCrear.getActionCommand())){
			System.out.println("Crear usuario");
			agregarNuevoUsuario();
		}
		else{
			ventana.dispose();
			System.out.println("Salir");
		}
	}
	
	
	
	

}
