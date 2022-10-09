public class p5 {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer();
        // Creating a producer thread
        Thread pt = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // Creating consumer thread
        Thread ct = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // Start both threads
        pt.start();
        ct.start();

        // producer finishes before consumer pt.join();
        ct.join();
    }
}

public class ProducerConsumer {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 2; // assume the capacity is 2.

    synchronized void produce() throws InterruptedException {
        int value = 1;
        while (true) {
            // producer thread waits while list is full
            while (list.size() == capacity) {
                wait();
            }
            // producing a value...
            System.out.println("Value produced --> " + value);
            list.add(value++);
            // notifies that values are produced and ready to consume
            notify();
            Thread.sleep(3000);
        }
    }

    synchronized void consume() throws InterruptedException {
        while (true) {
            // waits till the list is empty
            while (list.size() == 0) {
                wait();
            }
            // to retrieve the first job in the list
            int val = list.removeFirst();
            System.out.println("Value consumed -->" + val);
            // notifies producer thread
            notify();
            Thread.sleep(3000);
        }
    }
}
