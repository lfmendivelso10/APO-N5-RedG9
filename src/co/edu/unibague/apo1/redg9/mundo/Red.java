package co.edu.unibague.apo1.redg9.mundo;

import java.util.ArrayList;

public class Red {
	
	private ArrayList<Usuario> usuarios;
	
	public Red(){
		usuarios = new ArrayList<>();
	}
	
	
	/**
	 * Este metodo agrega un nuevo usuario.
	 * <b>pre:</b> La lista de usuario debe estar inicializada.
	 * <b>pos:</b> Se agrega un nuevo elemento a la lista de usuariuos.
	 * 
	 * @param nombre es el nombre del nuevo usuario.
	 * @param correo es el email del nuevo usuario.
	 * @param genero es el genero del nuevo usuario.
	 * @param relacion es el estado actual del nuevo usuario.
	 * @param pais es el país de procedencia del usuario.
	 * @param telefono es el número de contacto del usuario.
	 * 
	 * @throws no es posible agregar un nuevo usuario sin correo o nombre.
	 */
	public void agregarUsuario(String nombre, String correo, char genero, String relacion, String pais, String telefono){
		
		try{
			if(nombre.equals("") || correo.equals("")){
				throw new Exception("No se puede crear un usuario nuevo, dado que falta el nombre y el correo.");	
			}
			Usuario nuevo = new Usuario(nombre, genero, relacion, correo, pais, telefono);
			usuarios.add(nuevo);
		}
		catch(Exception miExcepcion){
			miExcepcion.printStackTrace();
		}
	}
	
	
	/**
	 * Retorna un usuario que tiene un correo específico.
	 * 
	 * @param correoBuscado es el correo del usuario deseado.
	 * @return retorna un usuario con el correo buscado.
	 * 
	 * @throws No puede hacer la busqueda de un usuario si el correo ingresado esta vacio.
	 */
	public Usuario verUsuario(String correoBuscado){
		
		Usuario usuario = null;
		
		try {
			if(correoBuscado.equals("")){
				throw new Exception("El correo buscado no puede ser vacio.");
			}		
			
			for(int indice=0; indice< usuarios.size() && usuario==null;indice++){
				Usuario temporal = usuarios.get(indice);
				if(temporal.getCorreo().equals(correoBuscado)){
					usuario = temporal;
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return usuario;
	}

}
