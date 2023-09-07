package me.ggicci.app;

import me.ggicci.misc.Greeting;

public class Main {
  public static void main(String[] args) {
    var message = Greeting.hello("Ant");
    System.out.println(message);
  }
}
