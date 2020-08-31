package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, "Matheus", "mat@email.com");
        Pessoa p2 = new Pessoa(null, "Lorenzo", "lore@email.com");
        Pessoa p3 = new Pessoa(null, "Pietra", "pi@email.com");

        // inicia/cria os entity managers
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        // começa a transação
        em.getTransaction().begin();

        // persistindo os dados no bd
        /*em.persist(p1);
        em.persist(p2);
        em.persist(p3);*/

        // comitando para o bd
        // em.getTransaction().commit();

        /*System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);*/

        // buscando no bd
        Pessoa p = em.find(Pessoa.class, 2);

        // remocao
        em.remove(p);
        // comitando para o bd
        em.getTransaction().commit();
        System.out.println(p);

        System.out.println("Pronto");

        em.close();
        emf.close();
    }
}
