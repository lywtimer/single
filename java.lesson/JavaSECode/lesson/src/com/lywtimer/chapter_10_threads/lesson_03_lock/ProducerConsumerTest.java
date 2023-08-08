package com.lywtimer.chapter_10_threads.lesson_03_lock;

/**
 * ClassName: ProducerConsumerTest
 * Package: com.lywtimer.chapter_10_threads.lesson_03_lock
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/8 14:17
 */
public class ProducerConsumerTest {

    public static void main(String[] args) {
        Clerk c = new Clerk();
        Producer p1 = new Producer(c);
        Consumer c1 = new Consumer(c);
        p1.start();
        c1.start();

    }
}

class Clerk{
    private int productNum = 0;

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public synchronized void addProduct(){
        if (productNum >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            productNum++;
            System.out.println(Thread.currentThread().getName() + " 生产了第" + productNum + "个产品");
            notifyAll();
        }
    }
    public synchronized void minusProduct(){
        if (productNum <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " 消费了第" + productNum + "个产品");
            productNum--;
            notifyAll();
        }
    }

}
class Producer extends Thread{

    private final Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("生产者开始生产产品...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.addProduct();
        }
    }
}

class Consumer extends Thread{
    private final Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("消费者开始消费产品...");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.minusProduct();
        }
    }
}
