package HackerRank30days.Day18;

import java.util.Queue;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args){
        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("Hi");
        System.out.println(stacky.pop()+" ");
        System.out.println("Peek: "+stacky.peek());
        System.out.println(stacky.pop()+"!");
        System.out.print("Size: "+stacky.size());
        
        
    }
    
}
