package bataillenavale;

public class Test {

    public static void main(String[] args) {

        TestCoordonnees();
        TestNavires();
        
    }

    private static void TestCoordonnees() {
        Coordonnee coordonnee1 = new Coordonnee("B6");
        Coordonnee coordonnee2 = new Coordonnee(4, 3);
        Coordonnee coordonnee3 = new Coordonnee(0, 7);
        Coordonnee coordonnee4 = new Coordonnee(1, 6);

        boolean c1egalc2 = coordonnee1.equals(coordonnee2);
        boolean c1egalc4 = coordonnee1.equals(coordonnee4);

        System.out.println("Coordonnées 1 : " + coordonnee1);
        System.out.println("Coordonnées 2 : " + coordonnee2);
        System.out.println("Coordonnées 3 : " + coordonnee3);
        System.out.println("Coordonnées 3 : " + coordonnee3);

        System.out.println("Coordonnées 1 et 2 égales : " + c1egalc2);
        System.out.println("Coordonnées 1 et 4 égales : " + c1egalc4);
    }
    
    private static void TestNavires(){
        
        Navire navire1 = new Navire(new Coordonnee("B3"), 3, false);
        System.out.println("Navire 1 début : " + navire1.getDebut());
        System.out.println("Navire 1 fin : " + navire1.getFin());
        
        Navire navire2 = new Navire(new Coordonnee("C2"), 3, true);
        System.out.println("Navire 2 début : " + navire2.getDebut());
        System.out.println("Navire 2 fin : " + navire2.getFin());
        
        Navire navire3 = new Navire(new Coordonnee("E2"), 3, true);
        System.out.println("Navire 3 début : " + navire3.getDebut());
        System.out.println("Navire 3 fin : " + navire3.getFin());
        
        boolean n1chevauche2 = navire1.chevauche(navire2);
        boolean n1chevauche3 = navire1.chevauche(navire3);
        System.out.println("Navire 1 et 2 se chevauchent : " + n1chevauche2);
        System.out.println("Navire 1 et 3 se chevauchent : " + n1chevauche3);
        
    }

}
