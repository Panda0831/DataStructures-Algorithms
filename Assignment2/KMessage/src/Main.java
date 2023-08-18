import implementations.Queue;
import implementations.Stack;
import java.io.*;
public class Main {
    public static Queue<String> queue = new Queue<>();
    public static Stack<String> stack = new Stack<>();
    public static void main(String[] args) {
        System.out.println("MESSENGER");
        Methods.Menu();
        int choice = 0;
        do {
            try {
                String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
                if (input.isEmpty()) {
                    System.out.println("Invalid choice! Please enter a number.");
                    continue;
                }
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice! Please enter a number.");
                continue;
            } catch (IOException e) {
                System.out.println("Invalid choice! Please enter a number.");
                continue;
            }
            switch (choice) {
                case 1://enter message
                    System.out.println("Enter message");
                    try {
                        String[] message = Methods.SendMessage(new BufferedReader(new InputStreamReader(System.in)));
                        Methods.Transfer(message, queue);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Methods.Menu();
                    break;
                case 2: //print message in queue
                    Methods.PrintMessage(queue);
                    Methods.Menu();
                    break;
                case 3: //send message from queue to stack
                    Methods.Process(queue, stack);
                    double beginTime = System.nanoTime();
                    double endTime = System.nanoTime();
                    double time = endTime - beginTime;
                    System.out.println("Time: " + time + "ns");
                    Methods.Menu();
                    break;
                case 4: //print newest message
                    Methods.PrintNewestMessage(stack);
                    Methods.Menu();
                    break;
                case 5: //print all message in stack
                    Methods.SPrintAllMessages(stack);
                    Methods.Menu();
                    break;
                case 6: //delete newest message in stack
                    Methods.DeleteNewestMessage(stack);
                    Methods.SPrintAllMessages(stack);
                    Methods.Menu();
                    break;
                case 7: //exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number.");
                    break;
            }
        } while (choice != 7);
    }
}