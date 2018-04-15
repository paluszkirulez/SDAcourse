package pl.com.empas.java_introductory_course.collections.tasks.task2_salaries;

import pl.com.empas.java_introductory_course.collections.common.Departament;
import pl.com.empas.java_introductory_course.collections.common.DepartamentGenerator;
import pl.com.empas.java_introductory_course.collections.common.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Salaries {


    //Ta mapa zawiera jako klucze departamenty w firmie. Dla każdego departamentu,
    //zawiera listę pracowników. Każdy pracownik ma określoną pensję - salary. Możemy ją pobrać używając na pracowniku metody Employee.getSalary
    Map<Departament, List<Employee>> departamentMap = DepartamentGenerator.getDepartamentsWithEmployeesMap();

    public static void main(String[] args) {
        Salaries salaries = new Salaries();
        //System.out.println(departamentMap);
        System.out.println("Best earning emloyee in all departaments: " + salaries.findBestEarningEmployee());

        for (Departament departament : DepartamentGenerator.getDepartaments()) {
            System.out.println("Best earning employee in departament " + departament.getName() + " is " + salaries.findBestEarningEmployee(departament).getName());
        }
    }

    /**
     * @param departament - departament to check
     * @return highest earning employee in a departament;
     */
    public Employee findBestEarningEmployee(Departament departament) {

        List<Employee> tmpListEmployee = new ArrayList<>();
        tmpListEmployee.addAll(departamentMap.get(departament));
        //System.out.println(tmpListEmployee);

        long biggestSalary = 0;
        int bestEmployee = 0;

        for (int i = 0; i < tmpListEmployee.size(); i++) {

            if (tmpListEmployee.get(i).getSalary() > biggestSalary) {
                biggestSalary = tmpListEmployee.get(i).getSalary();
                bestEmployee = i;
            }

        }
        return tmpListEmployee.get(bestEmployee);
    }

    //Użyj poprzedniej metody!
    public Employee findBestEarningEmployee() {
        long bestSalary = 0;
        Employee bestEmployee = new Employee(0, "", (long) 0.0);
        for (Departament departament : DepartamentGenerator.getDepartaments()) {
            Employee employee = findBestEarningEmployee(departament);
            if (employee.getSalary() > bestSalary) {
                bestSalary = employee.getSalary();
                bestEmployee = employee;
            }
        }

        return bestEmployee;
    }
}
