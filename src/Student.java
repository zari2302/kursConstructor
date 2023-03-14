public class Student {
    String birthday;
    String name;
    String surName;
    int age;

    public Student(String birthday, String name, String surName, int age) {
        this.birthday = birthday;
        this.name = name;
        this.surName = surName;
        if (age > 0) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student: \n" +
                "birthday: " + birthday + "\n" +
                "name: " + name + "\n" +
                "surName: " + surName + "\n" +
                "age: " + age ;
    }
}
