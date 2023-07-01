package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rol")
public class Rol{

    //Atributos
    @Id
    //Con este strategy generante value se indica que la id sera auto_increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_Rol;

    @Column(name = "Nombre_Puesto")
	private String Nombre_Puesto;

    //Constructor vacio
    public Rol() {
        
    }
    //Constructor 
    public Rol(String nombre_Puesto) {
        this.Nombre_Puesto = nombre_Puesto;
    }
    //Getters and Setters
    public long getId_Rol() {
        return id_Rol;
    }

    public void setId_Rol(long id_Rol) {
        this.id_Rol = id_Rol;
    }

    public String getNombre_Puesto() {
        return Nombre_Puesto;
    }

    public void setNombre_Puesto(String nombre_Puesto) {
        Nombre_Puesto = nombre_Puesto;
    }

    @Override
    public String toString() {
        return "Rol [id_Rol=" + id_Rol + ", Nombre_Puesto=" + Nombre_Puesto + "]";
    }

}

