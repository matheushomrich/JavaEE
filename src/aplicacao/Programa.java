package aplicacao;

import dominio.Pessoa;

public class Programa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Matheus", "mat@email.com");
        Pessoa p2 = new Pessoa(1, "Lorenzo", "lore@email.com");
        Pessoa p3 = new Pessoa(1, "Pietra", "pi@email.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
