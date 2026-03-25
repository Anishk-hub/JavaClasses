package PractiseProblems;

public class MainEmployeeClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1051;
        e1.salary = 60000;

        System.out.println("ID: " + e1.id);
        System.out.println("Salary: " + e1.salary);

        if(e1.salary > 50000){
            System.out.println("High salary");
        } else{
            System.out.println("Low salary");
        }

    }
}
