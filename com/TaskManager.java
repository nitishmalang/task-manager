package com.example.taskmanager;

import java.time.LocalDate;

public class TaskManager {
    public static void main(String[] args) {
        Task task = new Task("Sample Task", "This is a sample task", LocalDate.now());

        System.out.println("Task Title: " + task.getTitle());
        System.out.println("Task Description: " + task.getDescription());
        System.out.println("Task Due Date: " + task.getDueDate());
        System.out.println("Task Completed: " + task.isCompleted());
        
        task.markAsCompleted();
        System.out.println("Task Completed: " + task.isCompleted());
    }
}
