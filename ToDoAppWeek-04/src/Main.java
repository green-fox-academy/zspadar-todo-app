import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 06..
 */
public class Main extends TaskManager {
  public static void main(String[] args) {

    String help = "\n" + "Java ToDo Application" + "\n" + "=====================" + "\n"  + "\n" +
                       "Command line arguments: " + "\n" + "list List all the tasks" + "\n" +
            "add Adds a new task" + "\n"  +
            "remove Removes a task" + "\n" + "complete Completes a task";

    if (args.length == 0) {
      printUsage();
    } else if (args[0].equals("list") && args.length == 4) {
      printList();
    } else if (args[0].equals("add")) {
      addNewTask();
    } else if (args[0].equals("remove")){
      removeTask();
//    } else if (args[0].equals("complete")) {
//      System.out.println(completeTask);
    } else {
      handleArgument();
    }

  }




}
