package pl.com.empas.java_introductory_course.collections;

import java.util.*;

public class TreeMapExample {
    // key is a number of employee with zeros added
    Map<String, Employee> map;

    public TreeMapExample(Map<String, Employee> map){
        this.map = map;
    }

    public Set<Employee> getEmployeesWithNumberGretertThan(int number){
        Iterator<Employee> iterator = map.values().iterator();
        Set<Employee> employees = new HashSet<>();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(employee.employeeID > number){
                employees.add(employee);
            }
        }
        return employees;
    }

    public static class Employee{
        int employeeID;
        String employeeName;

        public Employee(int employeeID, String employeeName) {
            this.employeeID = employeeID;
            this.employeeName = employeeName;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "employeeID=" + employeeID +
                    ", employeeName='" + employeeName + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {;
        Map<String,Employee> map = new HashMap<>();
        String sNumber = "001";
        int number = Integer.parseInt(sNumber);
        Employee andrzej = new Employee(number,"Andrzej Kowalski");
        map.put(sNumber,andrzej);
        number = number+1;
        sNumber = "00"+number;
        Employee maciek = new Employee(number,"maciek Kowalski");
        map.put(sNumber,maciek);
        number = number+1;
        sNumber = "00"+number;
        Employee grzesiek = new Employee(number,"grzesiek Kowalski");
        map.put(sNumber,grzesiek);
        number = number+1;
        sNumber = "00"+number;
        Employee krzysiek = new Employee(number,"krzysiek Kowalski");
        map.put(sNumber,krzysiek);
        number = number+1;
        sNumber = "00"+number;
        Employee slawek = new Employee(number,"slawek Kowalski");
        map.put(sNumber,slawek);
        TreeMapExample example = new TreeMapExample(map);
       // System.out.println(map.keySet());
       // System.out.println(map.values().toString());
       // System.out.println(map.entrySet());


        System.out.println(example.getEmployeesWithNumberGretertThan(2));
    }
}
