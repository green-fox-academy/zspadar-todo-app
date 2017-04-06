/**
 * Created by zsuzsanna.padar on 2017. 04. 06..
 */
public class Task  {
  private String name;
  private String status;

  public Task(String aName) {
    name = aName;
    status = "incomplete";
  }

  public Task(String aName, String aStatus) {
    name = aName;
    status = aStatus;
  }

  public void setTaskDone() {
    status = "done";
  }

  public Boolean isDone() {
    return status.equals("done");
  }

  public String getName() {
    return name;
  }

  public String getStatus() {
    return status;
  }

  public String getDescription() {
    String statusMark = status.equals("done") ? "[x]" : "[ ]";
    return statusMark + " " + name;
  }

}
