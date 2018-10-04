package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<ToDoItem> items = new ArrayList<ToDoItem>();
        String anyItem;
        do {
            ToDoItem item = new ToDoItem();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the item you ha to do:");
            String name = input.nextLine();
            item.setName(name);
            System.out.println("Enter the category of this item:");
            String category = input.nextLine();
            item.setCategory(category);
            System.out.println("Your Assigned Priority is:");
            String priority = input.nextLine();
            item.setPriority(priority);
            System.out.println("Is This Item Completed?");
            boolean isDone = input.nextBoolean();
            item.setDone(isDone);

            items.add(item);

            System.out.println("Do you have another item? Enter q or quit to exit. ");
            anyItem = input.nextLine();
        } while (!anyItem.equalsIgnoreCase("quit") || !anyItem.equalsIgnoreCase("q"));
    }
}
