public class Courses {
    private String courseName;

    public Courses(String courseName) {
        this.courseName = courseName;
    }

    public void startCourse(Students[]students, Mentor mentor){
        System.out.println("Course name: " + getCourseName());
        System.out.println("Mentor name: " +  mentor.getName());
        System.out.println("Students: " + students.length);
        for (Students s : students){
            int counter = 0;
            System.out.println(++counter + s.getName());
        }
    }

    public float avarageAge(Person[] person){
        int ageSum = 0;
        int numP = 0;
        for (Person p : person){
            ageSum += p.getAge();
            numP++;
        }
        return (float) ageSum/numP;
    }

    public boolean isYounger(Person p, Person[] people){
        return p.getAge() < avarageAge(people);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


}


