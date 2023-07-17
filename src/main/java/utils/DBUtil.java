package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import constants.JpaConst;

public class DBUtil {

    private static EntityManagerFactory emf;

    public static EntityManager createEntityManager() {
        return return_getEntityManagerFactory().createEntityManager();
    }

    private static EntityManagerFactory return_getEntityManagerFactory() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(JpaConst.PERSISTENCE_UNIT_NAME);
        }
        return emf;
    }

}
