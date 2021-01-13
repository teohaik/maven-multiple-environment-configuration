package gr.teohaik.version.tester.persistence;

import gr.teohaik.version.tester.domain.MyDomainClass;
import gr.teohaik.version.tester.jpa.MyJpaClass;

public class MyEjbService {

    private String name;

    private static MyJpaClass jpaClass = new MyJpaClass();

    public String getEjbResult(){

        MyDomainClass domainClass = new MyDomainClass();

        String domain = domainClass.getDomainName();

        return jpaClass.getJpaName() + "_ "+ domain;
    }

    public MyDomainClass getDomain(){
        return new MyDomainClass();
    }


    @Override
    public String toString() {
        return "MyEjbService{" +
                "name='" + name + '\'' +
                '}';
    }
}
