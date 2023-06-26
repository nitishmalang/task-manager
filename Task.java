package com.example.taskmanager;

import java.time.LocalDate;

public class TaskManager {
    public static void main(String[] args) {
        // Create a Task instance
        Task task = new Task("Sample Task", "This is a sample task", LocalDate.now());

        // Perform operations on the task
        System.out.println("Title: " + task.getTitle());
        System.out.println("Description: " + task.getDescription());
        System.out.println("Due Date: " + task.getDueDate());
        System.out.println("Completed: " + task.isCompleted());

        // Mark the task as completed
        task.markAsCompleted();
        System.out.println("Marked as Completed: " + task.isCompleted());
    }
}

