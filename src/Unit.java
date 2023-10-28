public class Unit {
    protected String name;
    protected String surname = "Popov";
    protected int health = 100;
    protected int defence = 100;
    protected int power = 10;

    public Unit(String name){
        Game.countOfUnits++;
        this.name = name;
    }
//    public Unit(String name, String surname){
//        this(name);
//        this.surname = surname;
//    }
    protected float criticalChance = 0.1f;
    protected float parryChance = 0.1f;
    public int getHealth(){ //getter
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public void attack(Unit unit){
        unit.getDemage(power);
    }
    public void getDemage(int damage){
        this.health-=damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }
    public void print(){
        System.out.println(this);
    }
    public void print(String str){
        System.out.println(str + " " + this);
    }
}
