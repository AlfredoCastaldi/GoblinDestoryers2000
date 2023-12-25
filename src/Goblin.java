import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Goblin extends Gameplay{

    public static ArrayList<Goblin> goblins = new ArrayList<Goblin>();
    private static String[] goblinType = {"goblin shaman","goblin warrior","goblin archer"};

    public ArrayList<GoblinSkills> goblinAbilities = new ArrayList<GoblinSkills>();

    private int goblinHp;
    private String goblinName;
    private int goblinMana;

    public Goblin(double indexProva){
        double rngClass = indexProva;
        if (rngClass < 0.40){
            this.goblinName = this.goblinType[1];
            this.goblinHp = 10;
        }
        if (rngClass < 0.80 && rngClass > 0.40){
            this.goblinName = this.goblinType[2];
            this.goblinHp = 6;
            Collections.addAll(goblinAbilities, GoblinSkills.poisonShot, GoblinSkills.steadyShot,
            GoblinSkills.multiShot);

        }
        if (rngClass > 0.80){
            this.goblinName = this.goblinType[0];
            this.goblinHp = 4;
        }
    }

    public static void incontroCasuale(){
    int rngGoblinSpawn = (int)(Math.random()*4)+1;
        for (int i = 1; i <= rngGoblinSpawn; i++){
            Goblin newGoblin = new Goblin(0.50);
            System.out.println("a " + newGoblin.goblinName + " appears !");
            goblins.add(newGoblin);
        }
        System.out.println("hai incontrato " + rngGoblinSpawn + " goblin");
    }
    public static void checkMyGoblins() {
        for (Goblin obj : goblins) {
             System.out.println(obj.getGoblinName());
        }
    }


    public String getGoblinName(){
        return this.goblinName;
    }
    public int getGoblinHp(){
        return this.goblinHp;
    }
}
