package HackerRank30days.Day19;

import java.util.Random;

public class StartWarsInterfacePractice {

    public static Character summonCharacter(){
        Random rand = new Random();
        if(Math.abs(rand.nextInt())%2 == 0){
            return new Enemy();
        }else{
            return new Hero();
        }
    }

    public static void main(String[] args){
        Enemy darthVader = new Enemy();
        Hero Obiwankenobi = new Hero();
        darthVader.attack();
        Obiwankenobi.attack();
        darthVader.heal();
        Obiwankenobi.heal();
        System.out.println("Enemy weapon: "+darthVader.getWeapon());
        System.out.println("Hero weapon: "+Obiwankenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
}
