import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;
public class Eroe extends Gameplay{

    public static Eroe[] myHeroes = new Eroe[1];
    private String name;
    private String classe;
    private int heroHp;

    private String[] classi = {"warrior", "mage", "archer"};
    
  protected ArrayList<Skills> skills = new  ArrayList<>(); // no private per provare gameplay


    public Eroe() {
        Scanner input = new Scanner(System.in);
        System.out.println("chose your name");
        this.name = input.nextLine();
        System.out.println("scegli la tua classe \n 0: warrior \n 1: mage \n 2: archer");
        this.classe = classi[input.nextInt()];
        if (this.classe.equalsIgnoreCase("warrior")){
            this.heroHp = 20;
            Collections.addAll(skills, Skills.Slash, Skills.Price, Skills.Steady);         //prende da skill
        }
        if (this.classe.equalsIgnoreCase("archer")){
            this.heroHp = 16;
            Collections.addAll(skills, Skills.multiShot, Skills.poisonShot, Skills.steadyShot);
        }
        if (this.classe.equalsIgnoreCase("mage")){
            this.heroHp = 12;
            Collections.addAll(skills, Skills.fireball, Skills.scorch, Skills.arcaneDardus);
        }

          
    }

    public static void heroCreation() {
        Eroe hero = new Eroe();
        System.out.println("nome " + hero.name);
        System.out.println("classe " + hero.classe);
        System.out.println("punti vita " + hero.heroHp);
        myHeroes[0] = hero;

    }
    public String getName(){
        return this.name;
    }
    public String getClasse(){
        return this.classe;
    }

    public int getHeroHp(){ return  this.heroHp;}
    public void setHeroHp(int hp){this.heroHp = hp;}
}



