package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

public class Pozolillo extends Pozole {
    public Pozolillo() {
        name = "Pozolillo";
        broth = "Caldo Blanco";
        toppings.add("Col");
    }

    @Override
    public void serve() {
        System.out.println("Serving xtra hot in special pozolillo plate..." );
    }
}
