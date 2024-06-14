package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

  public static void main(String[] args) {
    Path path = Path.of("JavaCourse.txt");

    try {
      Files.writeString(path, "継続は力なり！", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("例外が発生した。");

      //例外処理の中でさらに例外になった場合、どうなるのかを確認する
      try {
        Files.writeString(path, "再試行 - 継続は力なり！", StandardOpenOption.APPEND);
        System.out.println(Files.readString(path));
      } catch (IOException ex) {
        ex.printStackTrace();
        System.out.println("再試行中にさらに例外が発生した！");
      }
    }
  }
}
