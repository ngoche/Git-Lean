package jav.study.collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelDemo {

    public static void main(String[] args) {
        Salary salary = new Salary();
        List<Employee> empList = createList();
        empList.parallelStream().forEach(salary::doProcess);
        
        System.out.println("Total - " + salary.getTotalSalary());

    }
    // Stub method to create list of employee objects
    private static List createList(){
        List<Employee> empList = IntStream.rangeClosed(1, 500).mapToObj(Employee::new)
          .collect(Collectors.toList());
        return empList;
    }
}

class Salary{
    //shared variable
    private int total = 0;
    
    public void doProcess(Employee emp){
        addSalary(emp.getSalary());
    }
    
    public void addSalary(int salary){
        total = total + salary;
    }
    public int getTotalSalary(){
        return total;
    }
}
 class Employee {
    private String lastName;
    private String firstName;
    private String empId;
    private int age;
    private int salary;
    
    Employee(int salary){
     this.salary = salary;
    }
    
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getFullName(){
     return this.firstName + " " + this.lastName;
    }
   
    public int getSalary() {
      return salary;
    }
}