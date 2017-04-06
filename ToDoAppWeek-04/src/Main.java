import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 06..
 */
public class Main {
  public static void main(String[] args) {
    List<String> rawLines = readLinesFromFile();

    if (args.length == 0) {
      System.out.println("Java ToDo Application" + "\n" + "=====================" + "\n" + "\n" +
              "Command line arguments: " + "\n" + "list List all the tasks" + "\n" + "add Adds a new task" + "\n" +
              "remove Removes a task" + "\n" + "complete Completes a task");
    } else if (args[0].equals("list"))

  }


  private final static String FILE_NAME = "data.csv";

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
