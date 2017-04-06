import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 06..
 */
public class CSVHelper {

  private FileHelper fileHelper;

  CSVHelper(String filePath) {
    fileHelper = new FileHelper(filePath);
  }

  void save(ArrayList<Task> tasks) {
    String content = "";
    for (int i = 0; i < tasks.size(); i++) {
      Task task = tasks.get(i);
      content += task.getStatus() + ";" + task.getName();
      if (i < tasks.size() - 1) {
        content += "\n";
      }
    }
    fileHelper.save(content);
  }

  ArrayList<Task> load () {
    ArrayList<Task> tasks = new ArrayList<>();
    List<String> lines = fileHelper.load();
    for(int i = 0; i < lines.size(); i++) {
      String[] parts = lines.get(i).split(";");
      tasks.add(new Task(parts[1], parts[0]));
    }
    return tasks;
  }


}
