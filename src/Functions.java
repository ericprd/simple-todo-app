public class Functions {
    // show todo list
    public static void showTodoList(){
        for(int i = 0; i < TodoApp.todo.length; i++){
            if(TodoApp.todo[i] == null) continue;
            System.out.printf("%d. %s\n", (i + 1), TodoApp.todo[i]);
        }
    }

    // add todo to list
    public static void addTodoList(String task){
        for(int i = 0; i < TodoApp.todo.length; i++){
            if(TodoApp.todo[i] == null){
                TodoApp.todo[i] = task;
                break;
            } else if(TodoApp.todo[TodoApp.todo.length - 1] != null){
                String[] temp = TodoApp.todo;
                TodoApp.todo = new String[TodoApp.todo.length + 1];
                for(int j = 0; j < temp.length; j++){
                    TodoApp.todo[j] = temp[j];
                }
            }
        }
    }

    // remove todo from list
    public static boolean removeTodoList(int num){
        if(num >= TodoApp.todo.length){
            return false;
        } else if(TodoApp.todo[num - 1] == null){
            return false;
        } else {
            for(int i = (num - 1); i < TodoApp.todo.length; i++){
                if((TodoApp.todo.length - 1) == i) {
                    TodoApp.todo[i] = null;
                } else {
                    TodoApp.todo[i] = TodoApp.todo[i + 1];
                }
            }
            return true;
        }
    }
}
