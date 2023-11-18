package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iautoable;
import model.TblAuto;


public class ClassCrudAuto implements Iautoable{

	@Override
	public void RegistrarAuto(TblAuto tblauto) {
		//ESTABLECER CONEXION CON LA UNIDAD PERSISTENCIA...
				EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENTDOS");
				EntityManager em=fabri.createEntityManager();
				
				em.getTransaction().begin();
				//REGISTRAMOS
				em.persist(tblauto);
				//CONFIRMAMOS
				em.getTransaction().commit();
				//CERRAMOS
				em.close();
	}//FIN DEL METODO ACTUALIZAR...

	@Override
	public void ActualizarAuto(TblAuto tblauto) {
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENTDOS");
		EntityManager em=fabri.createEntityManager();
		
		em.getTransaction().begin();
		//ACTUALIZAMOS
		em.merge(tblauto);
		//CONFIRMAMOS
		em.getTransaction().commit();
		//CERRAMOS
		em.close();		
	}//FIN DEL METODO ACTUALIZAR...

	@Override
	public void EliminarAuto(TblAuto tblauto) {
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENTDOS");
		EntityManager em=fabri.createEntityManager();
		
		em.getTransaction().begin();
		//RECUPERAR EL CODIGO A ELIMINAR
		TblAuto elim=em.merge(tblauto);
		//ELIMINAMOS
		em.remove(elim);
		//CONFIRMAMOS
		em.getTransaction().commit();
		//CERRAMOS
		em.close();		
	}//FIN DEL METODO ELIMINAR...

	@Override
	public TblAuto BuscarAuto(TblAuto tblauto) {
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENTDOS");
		EntityManager em=fabri.createEntityManager();
		
		em.getTransaction().begin();
		//INICIAMOS TRANSACCION
		em.getTransaction().begin();
		//BUSCAR POR CODIGO
		TblAuto buscar=em.find(TblAuto.class,tblauto.getIdauto());
		//CONFIRMAMOS
		em.getTransaction().commit();
		//CERRAMOS
		em.close();
		return buscar;
	}//FIN DEL METODO BUSCAR

	@Override
	public List<TblAuto> ListarAuto() {
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENTDOS");
		EntityManager em=fabri.createEntityManager();
		
		em.getTransaction().begin();
		//LISTADO
		List<TblAuto> listar=em.createQuery("select a from TblAuto a", TblAuto.class).getResultList();
		//CONFIRMAMOS
		em.getTransaction().commit();
		//CERRAMOS
		em.close();
		return listar;
	}//FIN DEL METODO LISTAR...

}
