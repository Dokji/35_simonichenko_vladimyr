package Task06;

import java.util.LinkedList;
import java.util.Queue;

public class WorkerThreadDemo {
    public static void main(String[] args) {
        Queue<Runnable> queue = new LinkedList<>();

        queue.offer(() -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 1 to 100: " + sum);
        });

        queue.offer(() -> {
            double result = Math.pow(2, 10);
            System.out.println("2^10 = " + result);
        });

        queue.offer(() -> {
            int factorial = 1;
            for (int i = 1; i <= 5; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of 5: " + factorial);
        });

        WorkerThread workerThread = new WorkerThread(queue);
        workerThread.start();
    }
}

class WorkerThread extends Thread {
    private final Queue<Runnable> queue;

    public WorkerThread(Queue<Runnable> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!queue.isEmpty()) {
            Runnable task = queue.poll();
            task.run();
        }
    }
}
