package program.java.AssistedPractice;

public class ThreadRunnable implements Runnable {
public void run(){  
System.out.println("Thread is running by implementing Runnable...");  
}  
  
public static void main(String args[]){  
ThreadRunnable tr1 = new ThreadRunnable();  
Thread t1 =new Thread(tr1);   // Using the constructor Thread(Runnable r)  
t1.start();  
 }  
} 