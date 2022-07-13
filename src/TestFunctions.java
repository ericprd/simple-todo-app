public class TestFunctions {
    // test show todo list
    public static void testShowTodoList() {
        for (int i = 0; i < 3; i++) {
            TodoApp.todo[i] = "Task ke - " + (i + 1);
        }
        Functions.showTodoList();
    }

    public static void testAddTodoList(){
        for(int i = 0; i < 12; i++){
            Functions.addTodoList("Task ke - " + (i + 1));
        }
        Functions.showTodoList();
    }

    public static void testRemoveTodoList(){
        for(int i = 0; i < 5; i++){
            Functions.addTodoList("Task ke - " + (i + 1));
        }
        Functions.showTodoList();
        System.out.println(Functions.removeTodoList(12)); // test if task to remove is out of length => false
        System.out.println(Functions.removeTodoList(7)); // test if there is no task in number 7 => false
        System.out.println(Functions.removeTodoList(4));
        System.out.println(Functions.removeTodoList(2));
        Functions.showTodoList();
    }

    public static void testInput(){

        System.out.print("Input some string: ");
        String str = ViewTodoApp.scanner.nextLine();

        System.out.print("Input some number: ");
        int num = ViewTodoApp.scanner.nextInt();

        System.out.println(str);
        System.out.println(num);
    }

    public static void testViewShowTodoList(){
        ViewTodoApp.viewShowTodoList();
    }

    public static void testViewAddTodoList(){
        ViewTodoApp.viewAddTodoList();
        Functions.showTodoList();
    }

    public static void testViewRemoveTodoList(){
        for(int i = 0; i < 5; i++){
            Functions.addTodoList("Task - " + i);
        }
        Functions.showTodoList();
        ViewTodoApp.viewRemoveTodoList();
        Functions.showTodoList();
    }

}
