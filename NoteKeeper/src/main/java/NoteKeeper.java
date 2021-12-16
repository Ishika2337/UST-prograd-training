//1. As a note keeper I want to add items to my todo list.
//2. As a note keeper I want to remove items from my todo list.
//3. As a note keeper, I want to be able to bring back the removed items. (un remove)
//4. As a note keeper, I want to toggle between completed and not completed.

import java.util.*;

public class NoteKeeper {

    PriorityQueue<String> todoListCompleted = new PriorityQueue<String>();
    PriorityQueue<String> todoListNotCompleted = new PriorityQueue<String>();
    PriorityQueue<String> todoList = new PriorityQueue<String>();
    ArrayList<String> removedList = new ArrayList<>();


    public void addList(String item, boolean completedOrNotCompleted) {
        if (completedOrNotCompleted) {
            todoListCompleted.add(item);
            todoList.addAll(todoListCompleted);
        } else {
            todoListNotCompleted.add(item);
            todoList.addAll(todoListNotCompleted);
        }

    }

    public String checkList(String item) {
        String existingItem = null;
        for (String list : todoList) {
            if (list.contains(item) ) {
                existingItem = item;
                break;
            }
        }
        return existingItem;
    }


    public PriorityQueue removeList(String item) {
         todoList.removeIf(list -> list == item);
        return todoList;
    }


    public PriorityQueue<String> unRemoveList(String item) {
        //boolean task = false;
        removedList.add(item);
        todoList.removeIf(list -> list == item);
        todoList.addAll(removedList);
//        if (todoList.contains(item)) {
//            task = true;
//        }
        return todoList;
    }

    public boolean completedOrNotCompleted(String completedOrNotCompletedList) {
        boolean task = false;
        for (String list : todoListCompleted) {
            if (list == completedOrNotCompletedList) {
                task = true;
            }
        }
        for (String list : todoListNotCompleted) {
            if (list == completedOrNotCompletedList) {
                task = false;
            }

        }
        return task;
    }


}