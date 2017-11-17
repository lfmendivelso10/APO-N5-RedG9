package co.edu.unibague.apo1.redg9.interfaz;

import java.awt.GridLayout;
import javax.swing.JFrame;

import co.edu.unibague.apo1.redg9.mundo.Red;

public class InterfazPrincipal extends JFrame{
	
	private PanelDeBotones botones;
	private PanelDePublicaciones publicaciones;
	private Red redSocial;
	
	public InterfazPrincipal(){
		
		redSocial = new Red();
		
		// Inicializo los paneles
		botones = new PanelDeBotones(redSocial);
		publicaciones = new PanelDePublicaciones();
		
		// Asignar el Layout
		this.setLayout(new GridLayout(1, 2));
		
		// Agrego el primer panel
		this.add(botones);
		// Agrego el segundo panel
		this.add(publicaciones);
		// Acomodo la ventana al contenido de los paneles.
		this.pack();
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String agrs[]){
		new InterfazPrincipal().setVisible(true);
		
	}
	
}
