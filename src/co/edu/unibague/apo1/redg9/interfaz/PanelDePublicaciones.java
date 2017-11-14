package co.edu.unibague.apo1.redg9.interfaz;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelDePublicaciones extends JPanel{
	
	private JLabel titulo;
	private JTextArea publicaciones;
	
	public PanelDePublicaciones(){
		
		this.setLayout(new GridLayout(2, 1));
		
		// Creo la etiqueta
		titulo = new JLabel("Publicaciones:");
		this.add(titulo);
		
		// Creo el area de texto
		publicaciones = new JTextArea();
		this.add(publicaciones);
		
		
	}
	
	

}
