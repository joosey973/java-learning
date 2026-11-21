package EighthPractice.Tasks;

public class Worker {
    private OnTaskDoneListener doneCallback;
    private OnTaskNotDoneListener notDoneCallback;

    public Worker(OnTaskDoneListener doneCallback, OnTaskNotDoneListener notDoneCallback) {
        this.doneCallback = doneCallback;
        this.notDoneCallback = notDoneCallback;
    }

    public void start() {
        for (int i = 1; i < 101; i++) {
            if (i == 33) this.notDoneCallback.notDone("Task " + i + " isn't done!!!");
            else this.doneCallback.onDone("Task " + i + " is done.");
        }
    }
}
