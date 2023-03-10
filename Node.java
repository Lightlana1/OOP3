package OOP2;

public class Node{
    public Node (Person p1, Status st, Person p2){
        this.p1 = p1;
        this.st = st;
        this.p2 = p2;
    }

    public Person getP1() {
        return p1;
    }

    public void setP1(Person p1) {
        this.p1 = p1;
    }

    public Status getSt() {
        return st;
    }

    public void setSt(Status st) {
        this.st = st;
    }

    public Person getP2() {
        return p2;
    }

    public void setP2(Person p2) {
        this.p2 = p2;
    }

    Person p1;
    Status st;
    Person p2;

    public String printInfo() {
        System.out.printf("%s %s персоны %s", p1.getName(), st, p2.getName());
        return ".";
    }

}
