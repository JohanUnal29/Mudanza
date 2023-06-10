package HackerRank30days.Day20;

import static HackerRank30days.Day20.HairColor.*;

public class Person {
    
    HairColor hairColor = BLACK;

    public Person(){
        
    }

    public static void main(String[] args){
        Person peterParker = new Person();
        Person spiderMan = peterParker;
    
        peterParker.hairColor = PINK;
        //Cambia el color en los dos ya que los dos apuntan a la misma cosa
        System.out.println("Hair color of Peter Parker: "+peterParker.hairColor);
        System.out.println("Hair color of Spiderman: "+spiderMan.hairColor);
        
    }
}
