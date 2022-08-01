package program.java.AssistedPractice;
import java.lang.Object;

public class SleepAndWait {
    private static Object obj = new Object();   
  
    //main() method starts with handling InterruptedException  
    public static void main(String[] args)throws InterruptedException   
    {   
          
        //pause process for two second  
        Thread.sleep(2000);   
          
        System.out.println( Thread.currentThread().getName() +   
        "This Thread gets woken up after two second");   
          
        synchronized (obj)    
        {   
            obj.wait(2000);   
  
            System.out.println(obj + "This Object is in waiting state and woken after 2 seconds");   
        }   
    }   
}  