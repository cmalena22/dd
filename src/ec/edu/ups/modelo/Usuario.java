package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario extends Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private String correo;
	private String contrasena;
	@Transient
	private boolean editable;
	 @ManyToOne
	private Rol roles;
	
	private String estado ="A";
	
	public Usuario() {
		super();
	}

	public Usuario(int id,String nombre, String apellido, String telefono,String correo, String contrasena,Rol roles,String estado) {
		super(id,nombre, apellido, telefono);
		this.correo = correo;
		this.contrasena = contrasena;
		this.roles=roles;
		this.estado=estado;
	}



	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Rol getRoles() {
		return roles;
	}

	public void setRoles(Rol roles) {
		this.roles = roles;
	}

//usuario
	

	public boolean isEditable() {
		return editable;
	}



	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	

	
	
	
	
	//@Override
	//public String toString() {
	//	return "Usuario [correo=" + correo + ", contrase�a=" + contrase�a + ", roles=" + roles +"]";
	//}
	
	
	
	
   
	
}
