public class Main {
    public static void main(String[] args) {

        Courses courses = new Courses("English");
        Person person = new Person();


        Students s1 = new Students("Tom", 22);
        Students s2 = new Students("Tom1", 24);
        Students s3 = new Students("Tom2", 26);
        Students s4 = new Students("Tom3", 21);
        Students s5 = new Students("Tom4", 20);
        Students[] students = new Students[5];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;
        Mentor m1 = new Mentor("Mike", 40);
        Person[] persons = new Person[6];
        persons[0] = s1;
        persons[1] = s2;
        persons[2] = s3;
        persons[3] = s4;
        persons[4] = s5;
        persons[5] = m1;

        courses.startCourse(students,m1);
        person.aboutMe();
        m1.aboutMe();
        s1.aboutMe();
        System.out.println(courses.avarageAge(persons));
//        System.out.println(courses.isYounger(s1, persons));

    }
}
