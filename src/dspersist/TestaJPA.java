package dspersist;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TestaJPA {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev-h2")
				.createEntityManager();
		em.close();
	}

}
