import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plant a = new Plant();
        Scanner sc = new Scanner(System.in);
        a.setTitle("Rugštynė");
        a.setLatin("Rumex acetosa");
        a.setAnnual(false);
        a.setContinent("Europa");
        a.setHeight(60);
        a.setEatable(true);

        Plant b = new Plant();
        b.setTitle("Dilgėlė");
        b.setLatin("Urtica dioica ");
        b.setAnnual(false);
        b.setContinent("Europa");
        b.setHeight(150);
        b.setEatable(true);


        Plant c = new Plant("Sojos pupelė", "Glycine fabaceae", true, "Azija", 60, true);

        Plant d = new Plant("Cūga", "Tsuga canadensis", false, "Šiaurės Amerika", 160, true);

        Plant.botanic.add(a);
        Plant.botanic.add(b);
        Plant.botanic.add(c);
        Plant.botanic.add(d);


        while (true) {
            Plant.info();
            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    Plant.printBotanic();
                    break;
                case 2:
                    Plant.addPlant();
                    break;
                case 3:
                    Plant.editPlant();
                    break;
                case 4:
                    Plant.deletePlant();
                    break;
                case 5:
                    System.exit(1);
                    break;


            }
        }


    }


}