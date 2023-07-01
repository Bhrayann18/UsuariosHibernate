package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//Se comienza declarando la clase como una entidad mediante la anotacion entity
@Entity
//Aqui se agrega la anotacion Table para indicar el nombre de la tabla a trabajar en la base de datos creada en MySQL
@Table(name = "usuarios")
public class Usuario {

	//Atributos con las anotaciones de ID Y Column
	@Id
	@Column(name = "id_Usuarios")
	private int id_Usuarios;

	@Column(name = "Nombre")
	private String Nombre;

	@Column(name = "Apellido")
	private String Apellido;

	@Column(name = "Correo")
	private String Correo;

	@Column(name = "Password")
	private String Password;

	//Constructor vacio
	public Usuario() {

	}
 
	//Constructor de los atributos a utilizar
	public Usuario(String nombre, String apellido, String correo, String password) {
		super();
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Correo = correo;
		this.Password = password;
	}

	
	//Getters and Setters
	public int getId_Usuarios() {
		return id_Usuarios;
	}

	public void setId_Usuarios(int id_Usuarios) {
		this.id_Usuarios = id_Usuarios;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	//Por ultimo para llevar a cabo los procesos de impresion se utiliza el metodo toString 
	@Override
	public String toString() {
		return "Usuario [id_Usuarios=" + id_Usuarios + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Correo="
				+ Correo + ", Password=" + Password + "]";
	}
}
