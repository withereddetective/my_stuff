class Student{

    private String name;
    private double gpa;
    private int year;

    public Student(String name, double gpa, int year){
        this.name = name;
        this.gpa = gpa;
        this.year = year;
    }

    public String getName(){ return name; }

    public double getGPA(){ return gpa; }

    public int getYear(){ return year; }

    @Override public String toString(){ return "{\n\tname: " + name + ",\n\tgpa: " + gpa + ",\n\tyear: " + year + "\n}"; }

}

public class GPA {

    Student[] arr = new Student[3];

    public GPA(){
        arr = new Student[] {new Student("john", 3.2, 2), new Student("john2", 2.3, 3), new Student("cumquot", 0.5, 1)};
    }

    public double averageGPA(){

        double result = 0;
        for (Student student : arr) {
            result += student.getGPA();
        }
        return result / arr.length;

    }

    public double getGpaRange(){

        double max = 0;
        double min = 4;
        for (Student student : arr) {
            max = (student.getGPA() > max) ? student.getGPA() : max;
            min = (student.getGPA() < min) ? student.getGPA() : min;
        }
        return max - min;

    }

    public String getLongestName(){

        String longestName = "";
        for (Student student : arr) {
            longestName = (student.getName().length() > longestName.length()) ? student.getName() : longestName; 
        }
        return longestName;

    }

    public int getNumFreshman(){

        int num = 0;
        for (Student student : arr) {
            num = (student.getYear() == 1) ? num + 1 : num; 
        }
        return num;

    }

    public int search(String name){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getName() == name){
                return i;
            }
        }
        return -1;

    }

    public int search(double gpa){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getGPA() >= gpa){
                return i;
            }
        }
        return -1;

    }

    public int sortStatus(){

        boolean if_should_return = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].getGPA() > arr[i + 1].getGPA()) {
                if_should_return = false;
                break;
            }
        }
        if (if_should_return){ return 1; }

        if_should_return = true;
        for (int i = 0; i > arr.length - 1; i++) {
            if (arr[i].getGPA() > arr[i + 1].getGPA()) {
                if_should_return = false;
                break;
            }
        }
        if (if_should_return){ return -1; }

        return 0;

    }

    @Override public String toString(){

        String returnedstr = "[\n";
        for (Student student : arr) {
            returnedstr = returnedstr + student.toString() + ",\n";
        }
        return returnedstr + "\n]";

    }

    public static void main(String[] args) {
        GPA i_need_this_to_run = new GPA();
        System.out.println(i_need_this_to_run.toString());
    }
}
