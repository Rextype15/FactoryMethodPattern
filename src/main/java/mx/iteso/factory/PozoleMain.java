package mx.iteso.factory;

import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import mx.iteso.factory.stores.PozoleVerdeStore;

public class PozoleMain {
    public static void main (String[] args) {
        PozoleStore blancoStore = new PozoleBlancoStore();
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore menuderia = new MenudoStore();
        PozolilloStore pozolilloStore = new PozolilloStore();

        Pozole pozole = verdeStore.orderPozole("pollo");
        System.out.println("First order is: "+ pozole.getName());
        System.out.println();

        pozole = rojoStore.orderPozole("pollo");
        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();

        pozole = menuderia.orderPozole("pollo");
        System.out.println("Third order is: "+ pozole.getName());

        System.out.println();
        
        pozole = pozolilloStore.orderPozole("pollo");
        System.out.println("Fourth order is: " + pozole.getName());
        System.out.println();

        pozole = blancoStore.orderPozole("pollo");
        System.out.println("Fifth order is :" + pozole.getName());
        System.out.println();
    }
}