package com.cfc.sample.persistence;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class FBPersonBean
 */
@Stateless
@LocalBean
public class FBPersonBean {

	@PersistenceContext
	private EntityManager em;


    /**
     * Default constructor. 
     */
    public FBPersonBean() {
        // TODO Auto-generated constructor stub
    	System.out.println("in the FBPersonBean");
    }
    
    @SuppressWarnings("unchecked")
	public List<FBPerson> getAllPersons() {
		return em.createNamedQuery("AllPersons").getResultList();

	}

	public void addPerson(FBPerson person) {
		em.persist(person);
		em.flush();
	}


}
