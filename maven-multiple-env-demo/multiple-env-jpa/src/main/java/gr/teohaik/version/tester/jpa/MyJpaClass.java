package gr.teohaik.version.tester.jpa;

public class MyJpaClass {

    private static String jpaName = "JPA NAME";

    public String getJpaName() {
        return jpaName;
    }

    @Override
    public String toString() {
        return "MyDomainClass{" +
                "jpaName='" + jpaName + '\'' +
                '}';
    }
}
