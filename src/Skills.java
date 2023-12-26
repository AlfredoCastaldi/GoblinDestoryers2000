public enum Skills {
    steadyShot (5, StatusEffect.None,false),
    poisonShot(3,StatusEffect.Poison,false),
    Slash(3, StatusEffect.None,false),
    Price(2, StatusEffect.None,false),
    Steady(0, StatusEffect.Taunt,false),
    multiShot (2, StatusEffect.None,true),

    fireball(10, StatusEffect.Fire,true),
    scorch(5, StatusEffect.Fire, false),
    arcaneDardus(5, StatusEffect.None, false);

    public Boolean isArea;

    public int damage;
    public StatusEffect statusEffect;

    Skills(int dmg, StatusEffect status, boolean isArea){
        this.damage = dmg ;
        this.statusEffect = status;
        this.isArea = isArea;
    }
}
