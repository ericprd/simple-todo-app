import java.util.Scanner;

public class ViewTodoApp {

    // Input
    public static Scanner scanner = new Scanner(System.in);

    // view show todo list
    public static void viewShowTodoList(){
        while(true){
            System.out.println("Todo:");
            Functions.showTodoList();
            System.out.println();
            System.out.println("Select Menu:");
            System.out.println("1. Add Todo.");
            System.out.println("2. Remove Todo.");
            System.out.println("q. Quit.");

            System.out.print("Input: ");
            String input = scanner.next();
            scanner.nextLine();
            if(input.equals("1")){
                // run add view function
                viewAddTodoList();
            } else if(input.equals("2")){
                // run remove view
                viewRemoveTodoList();
            } else if(input.equals("q")){
                break;
            } else {
                System.out.println("Input yang dimasukkan tidak valid");
            }
        }
    }

    // view add todo list
    public static void viewAddTodoList(){
        System.out.println("Add Todo");
        System.out.print("Todo (c. Cancel): ");
        String todo = scanner.nextLine();
        if(todo.equals("c")){
            // cancel
        } else {
            Functions.addTodoList(todo);
        }
    }

    // view remove todo from list
    public static boolean viewRemoveTodoList(){
        System.out.println("Remove Todo");
        System.out.print("Index (c. Cancel): ");
        String num = scanner.next();
        if(num.equals("c")){
            // cancel
            return false;
        } else {
            Integer number = Integer.valueOf(num);
            Functions.removeTodoList(number);
            return true;
        }
    }
}
