public enum Skills {
    steadyShot (5, StatusEffect.None),
    poisonShot(3,StatusEffect.Poison),
    Slash(3, StatusEffect.None),
    Price(2, StatusEffect.None),
    Steady(0, StatusEffect.Taunt),
    multiShot (2, StatusEffect.None);

    public int damage;
    public StatusEffect statusEffect;

    Skills(int dmg, StatusEffect status){
        this.damage = dmg ;
        this.statusEffect = status;
    }
}
