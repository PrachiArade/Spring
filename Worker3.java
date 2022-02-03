package perscholas.dependencyinjectionexample;


import org.springframework.stereotype.Component;

@Component
public class Worker3 {

    public static void doWork(){
        System.out.println("Worker 3 is doing work");
    }
}
