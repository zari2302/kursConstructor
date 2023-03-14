public class Main {
    public static void main(String[] args) {
        Course course = new Course("It kg",2,"Muratov Azamat"
                ,"01.02.23");
        System.out.println(course);
        Student student = new Student("23.02","Zarina","Kalmatova",30);
        Student student1 = new Student("25.07","Nursalin","Musaev",19);
        Student student2 = new Student("19.02","Nurdolot","Mamasaliev",-1);
        System.out.println(student+"\n"+ student1+"\n"+student2);
    }
}