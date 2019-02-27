package controller.housingunit;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.HousingUnit;

public class HousingUnitDTO {
	
	private static EntityManagerFactory entityManagerFactory =
			Persistence.createEntityManagerFactory("WebHousingLists");
	
	public void addHousingUnit(HousingUnit housingUnit) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(housingUnit);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public List<HousingUnit> showAllHousingUnits(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		List<HousingUnit> allHousingUnits = entityManager.createQuery(
													"SELECT housingUnit "
													+ "FROM HousingUnit housingUnit")
				.getResultList();
		
		return allHousingUnits;
	}
	
	public HousingUnit getHousingUnitById(int housingUnitId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		HousingUnit found = entityManager.find(HousingUnit.class, housingUnitId);
		
		entityManager.close();
		
		return found;
	}
	
	public void removeHousingUnit(HousingUnit housingUnit) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		TypedQuery<HousingUnit> typedQuery = entityManager.createQuery(
																"SELECT housingUnit "
																+ "FROM HousingUnit housingUnit "
																+ "WHERE housingUnit.id = :selectedHousingUnitId",
																HousingUnit.class);
		
		typedQuery.setParameter("selectedHousingUnitId", housingUnit.getId());
		
		HousingUnit result = typedQuery.getSingleResult();
		
		entityManager.remove(result);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void updateHousingUnit(HousingUnit housingUnit) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.merge(housingUnit);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
