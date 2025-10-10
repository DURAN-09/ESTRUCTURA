package U1.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args){
        Deque<String> history = new ArrayDeque<>();
        history.push("https://classroom.google.com");
        history.push("https://github.com");
        history.push("https://www.youtube.com");
        history.pop();
        System.out.println(history.peek());
        history.push("https://www.instagram.com");
        System.out.println("HISTORIAL: \n"+history);
    }
}
