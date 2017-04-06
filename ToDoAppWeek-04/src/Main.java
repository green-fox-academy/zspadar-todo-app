import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by zsuzsanna.padar on 2017. 04. 06..
 */
public class Main {
  public static void main(String[] args) {

    TaskManager taskManager = new TaskManager();

    if (args.length == 0) {
      taskManager.printUsage();
    } else if (args[0].equals("-l")) {
      taskManager.printList();
    } else if (args[0].equals("-a")) {
      taskManager.addTask( String.join(" ", Arrays.copyOfRange(args, 1, args.length)) );
    } else if (args[0].equals("-r")){
      taskManager.removeTask(Integer.parseInt(args[1]));
    } else if (args[0].equals("-c")) {
      taskManager.completeTask(Integer.parseInt(args[1]));
    } else {
      System.out.println("Unsupported argument");
    }

  }

}
