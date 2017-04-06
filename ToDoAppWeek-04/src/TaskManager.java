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
  private static void printList() {
    Path path = Paths.get(FILE_NAME);
    try {
      List<String> myToDoList = Files.readAllLines(path);
      if(myToDoList.size() == 0) {
        System.out.println("No todos for today! :) ");
      } else {
        for (int i = 0; i < myToDoList.size(); i++) {
          System.out.println(i + 1 + "." + myToDoList.get(i) + "\n");
        }
      }
    } catch (IOException e) {
      e.getStackTrace();
    }
  }

  private static void writeToFile(List<String> data) {
    Path path = Paths.get(FILE_NAME);
    try {
      Files.write(path, data);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  private static List<String> readLinesFromFile() {
    Path path = Paths.get(FILE_NAME);
    List<String> rawLines;

    try {
      rawLines = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
      rawLines = new ArrayList<>();
    }

    return rawLines;
  }

  private static void processData(List<String> rawLines) {
    for (String line : rawLines) {
      String[] splittedLine = line.split(";");
    }
  }


}
