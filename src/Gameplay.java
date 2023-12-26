import java.util.Scanner;


public class Gameplay {

  /* l'incontro si svolgera in un ciclo for che contiene:
      inizializzazione goblins ( ancora da rivedere )
      informazioni complessive incontro, numero nemici, statistiche ecc ecc.
      scelta del bersaglio da parte giocatore,
      scelta abilità da parte giocatore,
      1 attacco o abilità da ogni entità con vita maggiore di 0
     Il ciclo for principale dell'incontro non uscirà fino a che la somma degli hp di tutte le entità nemiche o
     gli hp del giocatore non toccano 0
   */
    public static void gestioneIncontro() {
        // qui si assegnano le variabili che determineranno la fine del ciclo for principale
        Scanner input = new Scanner(System.in);
        // per la vita dei nemici un for che itera attraverso tutti i nemici e ne somma la vita
        int heroHp = Eroe.myHeroes[0].getHeroHp();

        System.out.println("stai affrontando " + Goblin.goblins.size() + " goblins");
        // qui inizia l'incontro ed il while principale
        while (!Goblin.goblins.isEmpty() && heroHp > 0) {
            for (int i = 0; i < Goblin.goblins.size(); i++) {
                System.out.println(i + 1 + ": " + Goblin.goblins.get(i).getGoblinName() +
                        " Hp: " + Goblin.goblins.get(i).getGoblinHp());
            }

            int bersaglio = input.nextInt() -1;
            System.out.println("scegli la tua abilità ");
            for (int i = 0; i < Eroe.myHeroes[0].skills.size(); i++) {
                System.out.print(i + ": ");
                System.out.println(Eroe.myHeroes[0].skills.get(i));
            }

            int abilità = input.nextInt();

            //una volta scelta l'abilità calcola la differenza tra hp goblin e dmg e scrive una montagna di testo
            int danniEroe = Eroe.myHeroes[0].skills.get(abilità).damage;
            String nomeTarget = Goblin.goblins.get(bersaglio).getGoblinName();
            int hpTarget = Goblin.goblins.get(bersaglio).getGoblinHp();

            int result = hpTarget - danniEroe;
            System.out.println(nomeTarget + " subisce " + danniEroe + " danni !");
            System.out.println(nomeTarget + " Hp: " + (hpTarget - danniEroe));
            Goblin.goblins.get(bersaglio).setGoblinHp(result);


            if (result <= 0){
                System.out.println(nomeTarget + " Schiatta malissimo!");
                Goblin.goblins.remove(bersaglio);
            }
            if (!Goblin.goblins.isEmpty()){
            System.out.println("turno dei goblins");
                 for (int i = 0; i < Goblin.goblins.size(); i++){

                        System.out.println(Goblin.goblins.get(i).getGoblinName() + " sferra il suo attacco !");
                        int goblinDmg = Goblin.goblins.get(i).goblinAbilities.get(0).damage;
                        heroHp -= goblinDmg;
                        System.out.println(Eroe.myHeroes[0].getName() + " subisce " + goblinDmg + " danni !");
                        if (heroHp <= 0){
                            break;
                        }
                 }
            }
            if (heroHp <= 0){
                break;
            }
            Eroe.myHeroes[0].setHeroHp(heroHp);
            System.out.println(Eroe.myHeroes[0].getName() + " Hp: " + Eroe.myHeroes[0].getHeroHp());
        }
        // fine ciclo while
        if (heroHp <= 0){
            System.out.println("GAME OVER");
        } else {
        System.out.println(" VICTORY FANFARE !!! ");
        }
    }
}
