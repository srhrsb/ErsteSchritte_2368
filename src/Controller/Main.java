package Controller;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        //Eine Instanz der Klasse "Cloth" mit dem
//        //Namen "tshirt" wird erzeugt
//        Cloth tshirt = new Cloth("Baumwolle", 22.50);
//
//        Cloth hose = new Cloth("Jeansstoff", 89.99);
//        Cloth shirt = new Cloth(29.99);
//
//        hose.setPrice(69.99);
//        hose.setMaterial("");
//
//
//        //       tshirt.setMaterial("Baumwolle");
//        //       tshirt.setPrice(22.50);
//        System.out.println("Preis: " + tshirt.getPrice());
//
//        tshirt.setPrice(-10.50);
//        System.out.println("Preis: " + tshirt.getPrice());
//
//






        //Tshirt erzeugen als abgeleitete Klasse---------------------------
        Cloth tshirt2 = new Tshirt("T-Shirt", "Leinen", 29.99, "XL" );

        //Diese 3 Methode sind von Cloth geerbt
        System.out.println(tshirt2.getName());
        System.out.println(tshirt2.getMaterial());
        System.out.println(tshirt2.getPrice());

        //Diese Methode ist nur in Tshirt vorhanden
        Tshirt tshirt3 = (Tshirt) tshirt2; //Konvertierung (Downcast)
        System.out.println(tshirt3.getSize());
    }
}