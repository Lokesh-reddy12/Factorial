class Student{
    String name="Lokesh Reddy";
    int roll=257;
    String branch="EEE";
    float cgpa=8.19f;
}
class Employee{
    String name="Sai";
    String role="Python";
    int id=111;
    float salary=78990f;
}
class Main{
    public static void main(String args[]){
        Employee e=new Employee();
        System.out.println("Name:"+e.role);
    }
}    