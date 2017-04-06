import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 06..
 */
public class TaskManager {
  private ArrayList<Task> taskList;
  private CSVHelper dataManager;

  public TaskManager() {
     taskList = new ArrayList<>();
     dataManager = new CSVHelper("data.csv");
     load();
  }

  private void save() {
    dataManager.save(taskList);
  }

  private void load() {
    taskList = dataManager.load();
  }

  public void printUsage() {
    String help = "\n" +
            "Java ToDo Application" + "\n" +
            "=====================" + "\n" +
            "\n" +
            "Command line arguments: " + "\n" +
            "-l List all the tasks" + "\n" +
            "-a Adds a new task" + "\n"  +
            "-r Removes a task" + "\n" +
            "-c Completes a task";
    System.out.println(help);
  }

  public void addTask(String name) {
    taskList.add(new Task(name));
    save();
  }

  public void removeTask(int index) {
    if (taskList.size() >= 2) {
      taskList.remove(index - 1);
      save();
    }
  }

  public void completeTask(int index) {
    taskList.get(index - 1).setTaskDone();
    save();
  }

  public void printList() {
    if (taskList.size() == 0) {
      System.out.println("No todos today");
    }
    for(int i=0; i<taskList.size(); i++) {
      System.out.println(String.valueOf(i + 1) + " " + taskList.get(i).getDescription());
    }
  }

}
