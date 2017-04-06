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
  public void setTaskDone() {
    status = "done";
  }

  public Boolean isDone() {
    return status.equals("done");
  }
  
  public String getStatus() {
    String statusMark = status.equals("done") ? "[x]" : "[ ]";
    return statusMark + " " + name;
  }

}
