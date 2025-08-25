package dsa.collections.collection_queue;

import java.util.LinkedList;
import java.util.Queue;

class PrintJob{
    String name;
    int priority;

    public PrintJob(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}
public class PriorityJob {
    public static  void basedOnPriority() {
        Queue<PrintJob> printerQueue = new LinkedList<>();
        printerQueue.add(new PrintJob("Job1", 2));
        printerQueue.add(new PrintJob("Job2", 5));
        printerQueue.add(new PrintJob("Job3", 1));
        printerQueue.add(new PrintJob("Job4", 3));
        System.out.println("Printing jobs in order of priority:");
        while (!printerQueue.isEmpty()) {
            PrintJob highest = null;
            for (PrintJob job : printerQueue) {
             if(highest==null||highest.priority<job.priority)
                 highest=job;
            }
            printerQueue.remove(highest);
            System.out.println(highest.name + " (Priority: " + highest.priority + ")");
        }
    }
    public static void main(String[] args) {
  basedOnPriority();
    }
}
