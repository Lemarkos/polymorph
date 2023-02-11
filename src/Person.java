public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void aboutMe(){
        System.out.println("I am person");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (age <0){
            throw new RuntimeException("Error");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
