package controller.listing;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Listing;

public class ListingDTO {
	private static EntityManagerFactory entityManagerFactory =
			Persistence.createEntityManagerFactory("WebHousingLists");
	
	public void addListing(Listing listing) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.merge(listing);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public List<Listing> showAllListings(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		List<Listing> allListings = entityManager.createQuery(
													"SELECT listing "
													+ "FROM Listing listing")
				.getResultList();
		
		return allListings;
	}
	
	public Listing getListingById(int listingId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Listing found = entityManager.find(Listing.class, listingId);
		
		entityManager.close();
		
		return found;
	}
	
	public void removeListing(Listing listing) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		TypedQuery<Listing> typedQuery = entityManager.createQuery(
														"SELECT listing "
														+ "FROM Listing listing "
														+ "WHERE listing.id = :selectedListingId",
														Listing.class);
		
		typedQuery.setParameter("selectedListingId", listing.getId());
		
		Listing result = typedQuery.getSingleResult();
		
		entityManager.remove(result);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void updateListing(Listing listing) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.merge(listing);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
}
