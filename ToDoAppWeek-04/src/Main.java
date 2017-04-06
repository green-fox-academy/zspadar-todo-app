

/**
 * Created by zsuzsanna.padar on 2017. 04. 06..
 */
public class Main extends TaskManager {
  public static void main(String[] args) {


    if (args.length == 0) {
      printUsage();
    } else if (args[0].equals("list") && args.length == 4) {
      printList();
    } else if (args[0].equals("add")) {
      addNewTask(args[1]);
    } else if (args[0].equals("remove")){
      removeTask(Integer.parseInt(args[1]));
    } else if (args[0].equals("complete")) {
      completeTask(Integer.parseInt(args[1]));
    } else {
      handleArgument();
    }
    writeToFile(myToDoList);

  }

}
