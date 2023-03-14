public class Course {
    String name;
    int number;
    String theTeachersName;
    String startDate;

    public Course(String name, int number, String theTeachersName, String startDate) {
        this.name = name;
        this.number = number;
        this.theTeachersName = theTeachersName;
        this.startDate = startDate;

    }

    @Override
    public String toString() {
        return "Course : " +
                "name : " + name + "\n" +
                "number: " + number + "\n" +
                "theTeachersName : " + theTeachersName + "\n" +
                "startDate : " + startDate ;
    }
}
