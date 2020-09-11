package db;

import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

public class RepositorioCanchas implements WithGlobalEntityManager{
	public void registrar(Cancha cancha) {
		entityManager().persist(cancha);
	}

	@SuppressWarnings("unchecked")
	public List<Cancha> todas() {
		return entityManager()
				.createQuery("from Canchas")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Cancha> filtrarPorNombre(String nombre) {
		return entityManager()
				.createQuery("from Canchas where nombre = :nombre")
				.setParameter("nombre", nombre)
				.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Cancha> filtrarPorId(Long id) {
		return entityManager()
				.createQuery("from Canchas where id = :id")
				.setParameter("id", id)
				.getResultList();
	}

}
