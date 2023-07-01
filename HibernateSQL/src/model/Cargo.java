package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cargo")
public class Cargo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Cargo;

    @Column(name = "Nombre_Puesto")
    private String Nombre_Puesto;

    @Column(name = "Numero_Cuenta")
    private String Numero_Cuenta;

    @Column(name = "Valor_Salario")
    private String Valor_Salario;

    public Cargo() {
    }

    public Cargo(String nombre_Puesto, String numero_Cuenta, String valor_Salario) {
        this.Nombre_Puesto = nombre_Puesto;
        this.Numero_Cuenta = numero_Cuenta;
        this.Valor_Salario = valor_Salario;
    }

    public long getId_Cargo() {
        return id_Cargo;
    }

    public void setId_Cargo(long id_Cargo) {
        this.id_Cargo = id_Cargo;
    }

    public String getNombre_Puesto() {
        return Nombre_Puesto;
    }

    public void setNombre_Puesto(String nombre_Puesto) {
        Nombre_Puesto = nombre_Puesto;
    }

    public String getNumero_Cuenta() {
        return Numero_Cuenta;
    }

    public void setNumero_Cuenta(String numero_Cuenta) {
        Numero_Cuenta = numero_Cuenta;
    }

    public String getValor_Salario() {
        return Valor_Salario;
    }

    public void setValor_Salario(String valor_Salario) {
        Valor_Salario = valor_Salario;
    }

    @Override
    public String toString() {
        return "Cargo [id_Cargo=" + id_Cargo + ", Nombre_Puesto=" + Nombre_Puesto + ", Numero_Cuenta=" + Numero_Cuenta
                + ", Valor_Salario=" + Valor_Salario + "]";
    }

}
