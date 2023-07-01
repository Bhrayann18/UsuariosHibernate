package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Cargo;

public class CargoController {
    public static void main(String[] args) {
        	// Se crea el session factory para luego instanciar un objeto con el nombre de factory
		// Luego con el metodo configure se va a seleccionar el archivo de configuracion de hibernate en el formato XML
		// Esa configuracion realizada se enlaza con la clase a trabajar que en este caso es la clase de Usuarios
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cargo.class)
				.buildSessionFactory();

		// Este metodo realizara las operaciones SQL
		Session session = factory.getCurrentSession();

        try {

			// Aqui la sesion en primer plano debe realizar una transaccion
			session.beginTransaction();

			// Ahora se define un objeto de tipo usuario para especificar los paramentos realizados en la clase de Usuarios mediante el paramentro toString
			Cargo user = new Cargo("Operario Maquina plana", "6454-2757-9897-5355", "1,300,000");

			// Aqui se utiliza el metodo save ya que se quieren almacenar datos
			session.save(user);

			// Una vez finalizado el proceso anteriormente realizado mediante este metodo debera confirmar los cambios
			session.getTransaction().commit();

			System.out.println("Cargo almacenado");
		} finally {

			// Aqui se cierra la fabrica creada anteriormente
			factory.close();
		}
    }
}
