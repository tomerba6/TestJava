/**
 * test
 */
import java.util.Scanner;
import java.util.Stack;
public class test {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        input.close();
        System.out.println(x);
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(20);
        System.out.println(stack.pop());
    }
}