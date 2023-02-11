public class Mentor extends Person{

    public Mentor(String name, int age) {
        super(name, age);
    }

    public Mentor() {
    }

    @Override
    public void aboutMe() {
        super.aboutMe();
        System.out.println("I am mentor");
    }
}
