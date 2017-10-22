/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livreprogramacao.practise;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Fabio Santos Almeida <livre.programacao at gmail.com>
 */
public class NewClass {

    public void insert() {
        System.out.println("\n\n\n\n\tThe NewClass is here!\n\n\n\n");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("postgres");
        EntityManager manager = factory.createEntityManager();

        Collection<String> memberIds = new ArrayList<>();

        for (int i = 1; i < 101; i++) {
            memberIds.add(String.valueOf(i));
            System.out.format("\n\n\n\n\tThe Member Id is %d!\n\n\n\n", i);
        }

        try {

            for (String memberId : memberIds) {
                System.out.println(memberId);
                UserData user = new UserData();
                user.setUserid(memberId);
                manager.getTransaction().begin();
                manager.persist(user);
                manager.getTransaction().commit();
            }

            manager.close();
            factory.close();

        } catch (Exception e) {
            System.out.format("\nException message %s", e.getMessage());
            System.out.format("\nException localized message %s\n\n", e.getLocalizedMessage());
            throw e;
        }

    }
}
