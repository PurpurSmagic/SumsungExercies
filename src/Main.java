public class Main {
    public static void main(String[] arg){
        Game game = new Game();

        Unit unit1 = new Unit("Sasha");
        Unit unit2 = new Unit("Aleksey");

//        System.out.println(unit1);
//        System.out.println(unit2);
//        unit1.attack(unit2);
//        System.out.println(unit1);
//        System.out.println(unit2);
//        unit2.attack(unit1);
//        System.out.println(unit1);
//        System.out.println(unit2);


//        unit1.print();
//        unit1.print("Value of");
        Game game2 = new Game();

        Wizard wizard1 = new Wizard("W1");
        Wizard wizard2 = new Wizard("W2");


//        System.out.println(wizard1);
//        System.out.println(wizard2);

//        wizard1.attack(wizard2);

//        System.out.println(wizard1);
//        System.out.println(wizard2);

//        wizard2.attack(wizard1);

//        System.out.println(wizard1);
//        System.out.println(wizard2);



//        System.out.println(Game.countOfUnits);
        Game.print();



    }
}