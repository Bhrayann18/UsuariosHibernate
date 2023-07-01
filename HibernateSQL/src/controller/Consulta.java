package controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Usuario;

public class Consulta {

	public static void main(String[] args) {

		// Se crea el session factory para luego instanciar un objeto con el nombre de factory
		// Luego con el metodo configure se va a seleccionar el archivo de configuracion de hibernate en el formato XML
		// Esa configuracion realizada se enlaza con la clase a trabajar que en este caso es la clase de Usuarios
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Usuario.class)
				.buildSessionFactory();

		// Este metodo realizara las operaciones SQL
		Session session = factory.getCurrentSession();

		try {

			// Aqui la sesion en primer plano debe realizar una transaccion
			session.beginTransaction();

			// Se crea un objeto de respuesta y se seleccion la clase con la cual se realizara la operacion de consulta
			// El numero corresponde a la llave primaria o Id de las columnas de la tabla
			Usuario resultado = session.get(Usuario.class, 1);
			// Se imprime el objeto anteriormente creado
			System.out.println("Registro obtenido" + resultado);

			// Aqui se especifica una lista mediante el metodo createQuery para especificar una sentencia HQL donde selecciona el nombre de la clase
			List<Usuario> resultados = session.createQuery("from Usuario").list();
			System.out.println("Consulta general");

			// Ahora se realiza un recorrido mediante un For donde se utiliza la letra u la cual se declara para imprimir cada objeto que se encontro en la lista
			for (Usuario u : resultados) {
				System.out.println(u);
			}

			session.getTransaction().commit();

			System.out.println("Proceso Exitoso");
		} finally {

			factory.close();
		}
	}
}
