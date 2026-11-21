package EighthPractice;

import EighthPractice.Tasks.OnTaskDoneListener;
import EighthPractice.Tasks.OnTaskNotDoneListener;
import EighthPractice.Tasks.Worker;

public class Prog2 {
    public static void main(String[] args) {
        OnTaskDoneListener listenerDone = System.out::println;
        OnTaskNotDoneListener listenerNotDone = System.out::println;

        Worker worker = new Worker(listenerDone, listenerNotDone);

        worker.start();
    }
}
