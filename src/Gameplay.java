import java.util.Scanner;


public class Gameplay {
    public static Eroe token = Eroe.heroCreation();

    public static void gestioneIncontro(){

        Scanner input = new Scanner(System.in);
        System.out.println("stai affrontando " + Goblin.goblins.size() + " goblins");
        System.out.println("scegli il tuo bersaglio tra 0 e " + Goblin.goblins.size());
        for (int i = 0; i < Goblin.goblins.size(); i++){
            System.out.println("bersaglio numero " + i + " ha vita " + Goblin.goblins.get(i).getGoblinHp());
        }
        int bersaglio = input.nextInt();
        System.out.println("scegli la tua abilità ");
        for (int i = 0; i < token.heroSkills.size(); i++){
            System.out.println(token.heroSkills.get(i));
        }
        int abilità = input.nextInt();
        int result = Goblin.goblins.get(bersaglio).getGoblinHp() - token.heroSkills.get(abilità).dmg;
        System.out.println(result);
    }
}
