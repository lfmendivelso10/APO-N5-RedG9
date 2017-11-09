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

import java.util.Date;

/**
 * This class was created to manage the logic required for users publications information.
 * @author lfmendivelso
 * @since 09-11-2017
 */
public class Publicacion {
	
	public static final String PUBLICO = "Pública";
	public static final String PRIVADO = "Privada";
	public static final int MAX_CARACTERES = 140;
	
	private String mensaje;
	private Date fecha;
	
	/**
	 * @param mensaje
	 * @param fecha
	 */
	public Publicacion(String mensaje) {
		super();
		this.mensaje = mensaje;
		this.fecha = new Date();
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "-------------- \n"+
				mensaje+"\n"+
				fecha.toString()+"\n"+
				"-------------------";
	}
	
	
	
	

}
