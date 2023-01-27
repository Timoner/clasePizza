public class ComandesPizza {

    public static void main(String[] args) {
        Pizza_Marc_Estelrich p1 = new Pizza_Marc_Estelrich("margarita","mitjana");
        Pizza_Marc_Estelrich p2 = new Pizza_Marc_Estelrich("funghi","familiar");
        p2.sirve();
        Pizza_Marc_Estelrich p3 = new Pizza_Marc_Estelrich("quatre formatges","mitjana");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("demandes: "+Pizza_Marc_Estelrich.getTotalDemanades());
        System.out.println("servides: "+Pizza_Marc_Estelrich.getTotalServides());

    }
}