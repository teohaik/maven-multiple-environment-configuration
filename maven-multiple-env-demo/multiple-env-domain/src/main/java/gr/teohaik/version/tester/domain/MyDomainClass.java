package gr.teohaik.version.tester.domain;

public class MyDomainClass {

    private static String domainName = "Domain Name";


    public String getDomainName() {
        return domainName;
    }

    @Override
    public String toString() {
        return "MyDomainClass{" +
                "name='" + domainName + '\'' +
                '}';
    }
}
