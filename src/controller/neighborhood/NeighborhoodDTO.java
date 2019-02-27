package controller.neighborhood;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Neighborhood;

public class NeighborhoodDTO {
	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("WebHousingLists");

	public void addNeighborhood(Neighborhood neighborhood) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.merge(neighborhood);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public List<Neighborhood> showAllNeighborhoods() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		List<Neighborhood> allNeighborhoods = entityManager
				.createQuery("SELECT neighborhood " + "FROM Neighborhood neighborhood").getResultList();

		return allNeighborhoods;
	}

	public Neighborhood getNeighborhoodById(int neighborhoodId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		Neighborhood found = entityManager.find(Neighborhood.class, neighborhoodId);

		entityManager.close();

		return found;
	}

	public void removeNeighborhood(Neighborhood neighborhood) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		TypedQuery<Neighborhood> typedQuery = entityManager.createQuery("SELECT schoolDistrict "
				+ "FROM Neighborhood neighborhood " + "WHERE neighborhood.id = :selectedNeighborhoodId",
				Neighborhood.class);

		typedQuery.setParameter("selectedNeighborhoodId", neighborhood.getId());

		Neighborhood result = typedQuery.getSingleResult();

		entityManager.remove(result);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void updateNeighborhood(Neighborhood neighborhood) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.merge(neighborhood);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}