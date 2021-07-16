package CaseStudy1;

import java.lang.Comparable;

/**
 *
 * @author Kyro
 */
public class Employee implements Comparable {

    private String code;
    private String name;
    private int salary;

    public Employee(String c, String n, int s) {
        code = c;
        name = n;
        salary = s;
    }

    public void print() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object emp) {
        return this.getCode().compareTo(((Employee) emp).getCode());
    }

}
