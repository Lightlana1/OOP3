package OOP2;

public class Person {

    public String name;
    private String family;
    protected String age;

    public Person(String name, String family, String age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String printInfoPerson() {
        System.out.printf("%s %s %s", name, family, age);
        return ".";
    }


}
