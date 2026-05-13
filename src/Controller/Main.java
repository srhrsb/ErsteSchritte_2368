package Controller;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Eine Instanz der Klasse "Cloth" mit dem
        //Namen "tshirt" wird erzeugt
        Cloth tshirt = new Cloth("Baumwolle", 22.50);

        Cloth hose = new Cloth("Jeansstoff", 89.99);
        Cloth shirt = new Cloth(29.99);

        hose.setPrice(69.99);
        hose.setMaterial("");


//       tshirt.setMaterial("Baumwolle");
//       tshirt.setPrice(22.50);
        System.out.println("Preis: " + tshirt.getPrice());

        tshirt.setPrice(-10.50);
        System.out.println("Preis: " + tshirt.getPrice());
    }
}