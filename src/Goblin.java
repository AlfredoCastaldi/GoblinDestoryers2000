import java.util.Collections;
import java.util.ArrayList;

public class Goblin {

    public static ArrayList<Goblin> goblins = new ArrayList<Goblin>();
    private static final String[] goblinType = {"goblin shaman","goblin warrior","goblin archer"};

    public ArrayList<Skills> goblinAbilities = new ArrayList<Skills>();

    private int goblinHp;
    private String goblinName;
    private int goblinMana;

    public Goblin(){
        double indexProva = Math.random();
      if (indexProva < 0.40){
            this.goblinName = goblinType[1];
            this.goblinHp = 10;
            this.goblinMana = 0;
        }
        if (indexProva < 0.80 && indexProva > 0.40){
            this.goblinName = goblinType[2];
            this.goblinHp = 6;
            this.goblinMana = 0;
            Collections.addAll(goblinAbilities, Skills.poisonShot, Skills.steadyShot,
            Skills.multiShot);

        }
        if (indexProva > 0.80){
            this.goblinName = goblinType[0];
            this.goblinHp = 4;
            this.goblinMana = 10;
        }
    }

    public static void incontroCasuale(){
    int rngGoblinSpawn = (int)(Math.random()*4)+1;
        for (int i = 1; i <= rngGoblinSpawn; i++){
            Goblin newGoblin = new Goblin();
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

    public int getGoblinMana() {
      return goblinMana;
    }
}
