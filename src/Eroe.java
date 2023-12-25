import java.util.Scanner;
public class Eroe {

    private String name;
    private String classe;

    private int heroHp;

    private String[] classi = {"warrior", "mage", "archer"};

    public Eroe() {
        Scanner input = new Scanner(System.in);
        System.out.println("chose your name");
        this.name = input.nextLine();
        System.out.println("scegli la tua classe \n 0: warrior \n 1: mage \n 2: archer");
        this.classe = classi[input.nextInt()];
        if (this.classe.equalsIgnoreCase("warrior")){
            this.heroHp = 20;
        }
        if (this.classe.equalsIgnoreCase("archer")){
            this.heroHp = 16;
        }
        if (this.classe.equalsIgnoreCase("mage")){
            this.heroHp = 12;
        }
          
    }

    public static void heroCreation() {
        Eroe hero = new Eroe();
        System.out.println("nome " + hero.name);
        System.out.println("classe " + hero.classe);
        System.out.println("punti vita " + hero.heroHp);
    }
    public String getName(){
        return this.name;
    }
    public String getClasse(){
        return this.classe;
    }
}



