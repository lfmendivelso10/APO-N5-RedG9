package co.edu.unibague.apo1.redg9.interfaz;

import javax.swing.JFrame;

import co.edu.unibague.apo1.redg9.mundo.Red;

public class InterfazCrearUsuario extends JFrame{
	
	private PanelCrearUsuario panel;
	
	
	public InterfazCrearUsuario(Red redSocial){
		panel = new PanelCrearUsuario(redSocial,this);
		this.add(panel);
		this.pack();
	}

}
