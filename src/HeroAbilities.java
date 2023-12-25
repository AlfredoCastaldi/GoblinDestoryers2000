public enum HeroAbilities {
    // skills mago
    fireball(20, "no status",true),
    scorch(10, "burn", false),

    arcaneDardus(5, "cannot miss", false);

    public int dmg;
    public String status;

    public Boolean isArea;
    HeroAbilities(int dmg, String status, Boolean isArea){
        this.dmg = dmg;
        this.status = status;
        this.isArea = isArea;

    };
}
