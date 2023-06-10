package HackerRank30days.Day19;

public class Enemy implements Character{

    public String weapon = "ligthsaber";

    public Enemy(){

    }

    public String getWeapon(){
        return weapon;
    }

    public void attack(){
        System.out.println("The enemy attacks YOU!");
    }

    public void heal(){
        System.out.println("The enemy heals himself");
    }

    public void weaponDraw(){
        System.out.println("draw out weapon");
    }


}
