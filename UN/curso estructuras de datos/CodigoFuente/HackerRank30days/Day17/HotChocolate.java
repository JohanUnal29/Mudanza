package HackerRank30days.Day17;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp)throws TooHotException, TooColdException{
        if (cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        }
    }

    // minuto 9:40

    public static void main(String[] args) throws TooHotException, TooColdException, InterruptedException{
        double currentCocoaTemp = 200;
        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("That cocoa was good!");
                wrongTemp = false;
            } catch (TooHotException el) {
                System.out.println("THAT'S TOO HOT!");
                currentCocoaTemp = currentCocoaTemp-5;
            } catch (TooColdException el) {
                System.out.println("THAT'S SO COLD! It's like the arctic");
                currentCocoaTemp = currentCocoaTemp+5;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("And it´s gone.");
    }
}
