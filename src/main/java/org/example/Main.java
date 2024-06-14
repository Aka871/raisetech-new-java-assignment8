package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

  public static void main(String[] args) {
    try {
      Path path = Path.of("JavaCourse.txt");
      Files.writeString(path, "継続は力なり！", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
    } catch (IOException e) {

    }
  }
}
