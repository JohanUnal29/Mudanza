package HackerRank30days.Day19;

public class Hero implements Character{

    public String weapon = "The force";

    public String getWeapon(){
        return weapon;
    }

    public void attack(){
        System.out.println("The heroe attacks the enemy");
    }

    public void heal(){
        System.out.println("The enemy heals you");
    }

}
