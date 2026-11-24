package com.epam.mjc;

public class StudentManager {

  public Student find(long id) {
    for (Student student : Student.values()) {
      if (student.getId() == id) {
        return student;
      }
    }
    throw new StudentNotFoundException(id);
  }

  public static class StudentNotFoundException extends IllegalArgumentException {
    public StudentNotFoundException(long id) {
      super("Could not find student with ID " + id);
    }
  }
}