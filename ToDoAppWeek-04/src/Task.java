/**
 * Created by zsuzsanna.padar on 2017. 04. 06..
 */
public class Task {
  private String name;
  private boolean taskDone;

//  private static String TASK_DONE = "done";
//  private static String TASK_UNDONE = "undone";

  public Task(String name) {
    this.name = name;
  }
  public void setTaskDone() {
    this.taskDone = true;
  }

  @Override
  public String toString() {
    return (taskDone ? "[x] " : "[ ] ") + name;
  }





}
