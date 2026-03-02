package com.cmc.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("simplePU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(new com.cmc.entity.Student("Dung", 20));
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
