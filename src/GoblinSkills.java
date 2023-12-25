public enum GoblinSkills {
    steadyShot (5, "no status"),
    poisonShot(3,"poison"),
    multiShot (2, "no status");



    public int damage;
    public String statusEffect;

    GoblinSkills(int dmg, String status){
        this.damage = dmg ;
        this.statusEffect = status;
    }
}
