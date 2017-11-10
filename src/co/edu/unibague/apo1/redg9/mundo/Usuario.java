/**
 * MIT License
 * 
 * Copyright (c) 2017 Luis Felipe Mendivelso Osorio
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package co.edu.unibague.apo1.redg9.mundo;

import java.util.ArrayList;

/**
 * This class was created to manage the logic required for users information.
 * @author lfmendivelso
 * @since 09-11-2017
 */
public class Usuario {
	
	/**
	 * Define a constant for male gender users.
	 */
	public static final char GENERO_MASCULINO = 'M';
	/**
	 * Define a constant for female gender users.
	 */
	public static final char GENERO_FEMENINO = 'F';
	/**
	 * Define a constant for other gender users.
	 */
	public static final char GENERO_OTRO = 'O';
	/**
	 * Define a constant for user who's never been in a relationship.
	 */
	public static final String ESTADO_RELACION_FOREVER = "Forever Alone";
	/**
	 * Define a constant for single users.
	 */
	public static final String ESTADO_RELACION_SOLTERO = "Soltero";
	/**
	 * Define a constant for married users.
	 */
	public static final String ESTADO_RELACION_CASADO = "Casado";
	/**
	 * Define a constant for widowed users.
	 */
	public static final String ESTADO_RELACION_VIUDO = "Viudo";
	/**
	 * Define a constant for users in courtship.
	 */
	public static final String ESTADO_RELACION_NOVIAZGO = "En noviazgo";
	/**
	 * Define a constant for users in the friend zone.
	 */
	public static final String ESTADO_RELACION_FRIENDZONE = "Friendzone";
	
	/**
	 * It's the name of the user.
	 */
	private String nombre;
	
	/**
	 * It's the gender of the user.
	 */
	private char genero;
	
	/**
	 * It's the current relationship status of the user.
	 */
	private String relacion;
	
	/**
	 * It's the email of the user. 
	 */
	private String correo;
	
	/**
	 * It's the country where user is.
	 */
	private String pais;
	
	/**
	 * It's the phone number of the user.
	 */
	private String telefono;
	
	/**
	 * List of publications made by the user
	 */
	private ArrayList<Publicacion> publicaciones;
	
	

	/**
	 * @param nombre
	 * @param genero
	 * @param relacion
	 * @param correo
	 * @param pais
	 * @param telefono
	 */
	public Usuario(String nombre, char genero, String relacion, String correo, String pais, String telefono) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.relacion = relacion;
		this.correo = correo;
		this.pais = pais;
		this.telefono = telefono;
		this.publicaciones = new ArrayList<>();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the genero
	 */
	public char getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}

	/**
	 * @return the relacion
	 */
	public String getRelacion() {
		return relacion;
	}

	/**
	 * @param relacion the relacion to set
	 */
	public void setRelacion(String relacion) {
		this.relacion = relacion;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the publicaciones
	 */
	public ArrayList<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	/**
	 * @param publicaciones the publicaciones to set
	 */
	public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
	
	public void agregarNuevaPublicacion(String mensaje) {
		publicaciones.add(new Publicacion(mensaje));
	}
	
	public String verUltimaPublicacion() {
		int ultimo = publicaciones.size()-1;
		return publicaciones.get(ultimo).toString();
	}
	
	public String toString() {
		String muro = "";
		for(Publicacion publicacion : publicaciones) {
			muro += publicacion.toString();
		}
		return muro;
	}
	

}
