package perscholas.dependencyinjectionexample;

import org.springframework.stereotype.Component;

@Component
public class Worker2 {

    public void doWork(){
        System.out.println("Worker 2 is doing work");
    }
}
