public class Students extends Person{

    public Students(String name, int age) {
        super(name, age);
    }

    public Students() {
    }
    @Override
    public void aboutMe() {
        System.out.println("I am student");
    }
}
