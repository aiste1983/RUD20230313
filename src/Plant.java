import java.util.ArrayList;
import java.util.Scanner;

public class Plant {

    public static ArrayList<Plant> botanic = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    private static int idCount = 0;
    private int id;
    private String title;
    private String latin;

    private boolean annual;

    private String continent;

    private int height;

    private boolean eatable;

    public Plant() {
        this.id = ++idCount;
    }


    public Plant(String title, String latin, boolean annual, String continent, int height, boolean eatable) {
        this.id = ++idCount;
        this.title = title;
        this.latin = latin;
        this.annual = annual;
        this.continent = continent;
        this.height = height;
        this.eatable = eatable;
    }

    public int getId() {
        return this.getId();
    }


    public Plant (int id){
        this.id=id;
    }
    public static void setIdCount(int idCount) {
        Plant.idCount = idCount;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLatin() {
        return this.latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public boolean isAnnual() {
        return this.annual;
    }

    public void setAnnual(boolean annual) {
        this.annual = annual;
    }

    public String getContinent() {
        return this.continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isEatable() {
        return this.eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    @Override
    public String toString() {
        return (id + " Augalo pavadinimas " + title + "." + " Lotyniškas pavadinimas " +
                latin + "." + (this.annual ? "Vienmetis," : "Daugiametis,")) + " auga žemyne - " +
                continent + "." + " Suaugusio augalo aukštis " +
                height / 100.0 + " metrai. " + "Jis yra " + (this.eatable ? " valgomas. " : "nevalgomas.");
    }

    public static void info() {
        System.out.println("1. Pamatyti sąrašą");
        System.out.println("2. Pridėti augalą");
        System.out.println("3. Redaguoti augalą");
        System.out.println("4. Ištrinti augalą");
        System.out.println("5. Išeiti iš programos");

    }

    public static void printBotanic() {
        for (int i = 0; i < botanic.size(); i++) {
            System.out.println(botanic.get(i));
        }

    }

    public static void addPlant() {
        Plant plants = new Plant();
        Plant.botanic.add(creatPlant(0));

    }

    public static void editPlant() {
        System.out.println("Pasirinkite augalą id,kurį norite redaguoti");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < botanic.size(); i++) {
            if (botanic.get(i).id == id) {
                botanic.set(i,creatPlant(id));

                return;

            }
        }
    }

    public static void deletePlant() {
        System.out.println("Pasirinkite augalo id,kurį norite ištrinti");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < botanic.size(); i++) {
            if (botanic.get(i).id == id) {
                //Plant plants = new Plant(id);
                botanic.remove(i);
                return;

            }
        }
    }

    public static Plant creatPlant(int id) {
        Plant e;
        if (id == 0) {
            e = new Plant ();
        } else {
            e  = new Plant(id);

            System.out.println("Įveskite augalo pavadinimą");
            e.setTitle(sc.nextLine());
            System.out.println("Įveskite augalo lotynišką pavadinimą ");
            e.setLatin(sc.nextLine());
            System.out.println("Ar augalas vienmetis?");
            e.setAnnual(sc.nextBoolean());
            System.out.println(sc.nextLine());
            System.out.println("Įveskite šalį,kur auga ");
            e.setContinent(sc.nextLine());
            System.out.println("kokio  aukščio augalas auga ");
            e.setHeight(sc.nextInt());
            System.out.println(sc.nextLine());
            System.out.println("ar augalas valgomas ");
            e.setEatable(sc.nextBoolean());
            sc.nextLine();


        }
        return e;
    }



}