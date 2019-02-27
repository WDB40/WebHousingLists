package controller.schooldistrict;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.SchoolDistrict;

public class SchoolDistrictDTO {
	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("WebHousingLists");

	public void addSchoolDistrict(SchoolDistrict schoolDistrict) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.merge(schoolDistrict);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public List<SchoolDistrict> showAllSchoolDistricts() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		List<SchoolDistrict> allSchoolDistricts = entityManager
				.createQuery("SELECT schoolDistrict " + "FROM SchoolDistrict schoolDistrict").getResultList();

		return allSchoolDistricts;
	}

	public SchoolDistrict getSchoolDistrictById(int schoolDistrictId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		SchoolDistrict found = entityManager.find(SchoolDistrict.class, schoolDistrictId);

		entityManager.close();

		return found;
	}

	public void removeSchoolDistrict(SchoolDistrict schoolDistrict) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		TypedQuery<SchoolDistrict> typedQuery = entityManager.createQuery("SELECT schoolDistrict "
				+ "FROM SchoolDistrict schoolDistrict " + "WHERE schoolDistrict.id = :selectedSchoolDistrictId",
				SchoolDistrict.class);

		typedQuery.setParameter("selectedSchoolDistrictId", schoolDistrict.getId());

		SchoolDistrict result = typedQuery.getSingleResult();

		entityManager.remove(result);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void updateSchoolDistrict(SchoolDistrict schoolDistrict) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.merge(schoolDistrict);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}