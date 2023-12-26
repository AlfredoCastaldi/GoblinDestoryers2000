public enum StatusEffect {
  Poison(1),
  Fire(2),
  Ice(1),
  Curse(0),
  None(0),
  Taunt(0),
  Confused(0);

  public int damage;

  StatusEffect(int damage){
    this.damage = damage;

  }
}
