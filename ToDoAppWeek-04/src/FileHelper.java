import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 06..
 */
public class FileHelper {

  private String filePath;

  FileHelper(String aFilePath) {
    filePath = aFilePath;
  }

  public void save(String content) {
    try {
      Files.write(Paths.get(filePath), content.getBytes());
    } catch(Exception e) {}
  }

  List<String> load() {
    try {
      return Files.readAllLines(Paths.get(filePath));
    } catch(Exception e) {
      List<String> list = new ArrayList<>();
      return list;
    }
  }


}
