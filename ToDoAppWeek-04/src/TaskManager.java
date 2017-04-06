import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 06..
 */
public class TaskManager {
  static List<String> myToDoList;
  private final static String FILE_NAME = "data.csv";

  public TaskManager() {
     myToDoList = new List<String>();
  }

  private static void printUsage() {
    String help = "\n" + "Java ToDo Application" + "\n" + "=====================" + "\n"  + "\n" +
            "Command line arguments: " + "\n" + "list List all the tasks" + "\n" +
            "add Adds a new task" + "\n"  +
            "remove Removes a task" + "\n" + "complete Completes a task";
    System.out.println(help);
  }

  private static void printList() {
    Path path = Paths.get(FILE_NAME);
    try {
      List<String> myToDoList = Files.readAllLines(path);
      if(myToDoList.size() == 0) {
        System.out.println("No to dos for today! :) ");
      } else {
        for (int i = 0; i < myToDoList.size(); i++) {
          System.out.println(i + 1 + "." + myToDoList.get(i) + "\n");
        }
      }
    } catch (IOException e) {
      System.out.println("Something is wrong...oh-ooh! :(");
    }
  }

  private static void addNewTask(String name) {
    Path path = Paths.get(FILE_NAME);
    try {
      List<String> myToDoList = Files.readAllLines(path);
      myToDoList.add(name);
      Files.write(path, myToDoList);
    } catch (IOException e) {
      System.out.println("Something is wrong...oh-ooh! :(");
    }
  }

  private static void writeToFile(List<String> data) {
    Path path = Paths.get(FILE_NAME);
    try {
      Files.write(path, data);
    } catch (IOException e) {
      System.out.println("Something is wrong...oh-ooh! :(");
    }
  }



}
