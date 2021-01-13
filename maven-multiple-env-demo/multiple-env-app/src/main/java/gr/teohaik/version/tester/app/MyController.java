package gr.teohaik.version.tester.app;

import gr.teohaik.version.tester.domain.MyDomainClass;
import gr.teohaik.version.tester.persistence.MyEjbService;

public class MyController {


    private MyEjbService ejbService;


    public MyController(){
        ejbService = new MyEjbService();

        String ejbResult = ejbService.getEjbResult();

        MyDomainClass domain = ejbService.getDomain();

        System.out.println("Domain = "+domain);

        System.out.println("EJB RESULT in Controller = "+ejbResult);
    }


    @Override
    public String toString() {
        return "MyController";
    }
}
