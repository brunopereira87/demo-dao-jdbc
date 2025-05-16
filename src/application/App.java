package application;

import model.entities.Department;

public class App {
  public static void main(String[] args) throws Exception {
    Department dep = new Department(1, "Informatics");
    System.out.println(dep);
  }
}
