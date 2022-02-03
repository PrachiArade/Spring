package perscholas.dependencyinjectionexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Manager {

    @Autowired
    private Worker1 worker1;
    @Autowired
    private Worker2 worker2;
    @Autowired
    private Worker3 worker3;

    public Manager() {
        System.out.println("I am in the manager constructor");

        //This executes before autowired
        //These lines of code will fail
      //  this.worker1 = worker1;
      //  this.worker2 = worker2;
      //  this.worker3 = worker3;





        }

    @PostConstruct
    public void init(){
        worker1.doWork();
        worker2.doWork();
        worker3.doWork();

    }


}