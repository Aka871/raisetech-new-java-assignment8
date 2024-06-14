package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

  public static void main(String[] args) {
    try {
      Path path = Path.of("JavaCourse.txt");
      Files.writeString(path, "コツコツやろう！");
    } catch (IOException e) {

    }
  }
}
