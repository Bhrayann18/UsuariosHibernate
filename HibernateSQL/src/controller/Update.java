package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Usuario;

public class Update {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Usuario.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			//Aqui se indica que se realizara una consulta atravez del objeto session
			//Ademas se obtiene una referencia donde se utiliza el nombre de la clase y se selecciona la Id de la columna para realizar el proceso 
			Usuario User = session.get(Usuario.class, 1);
			
			//**METODO UPDATE**
			
			//Aqui se selecciona el atributo el cual se quiere cambiar que en este caso es Apellido
			// 1.METODO=User.setApellido("Alvarez");

			//Otro proceso seria por el metodo HQL donde se realiza el proceso de actualizacion mediante el objeto de Usuario que se renombra mediante una u
			//Ahora se selecciona el atributo a actualizar que en este caso es Password y se sobrescribe tanto el nuevo valor a implementar y el viejo valor 
			// 2.METODO=session.createQuery("update Usuario u set u.Password = 'User333' where u.userPassword = 'TCC22').executeUpdate();

			//**METODO DELETE**
			//Este metodo seria una de las formas para eliminar un objeto persistente con la desventaja de que elimina una columna completa de datos
			session.delete(User);

			//Este metodo HQL se basaria en realizar una consulta para luego eliminar el atributo el cual se especifica
			session.createQuery("delete from Usuario u where u.Apellido = 'Alvarez'").executeUpdate();

			session.getTransaction().commit();

			System.out.println("Tarea Finalizada");

		} finally {
			session.close();
		}
	}

}
