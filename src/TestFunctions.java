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

    public static  void testRemoveTodoList(){
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

}
