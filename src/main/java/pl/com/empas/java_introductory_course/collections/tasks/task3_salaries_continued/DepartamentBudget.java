package pl.com.empas.java_introductory_course.collections.tasks.task3_salaries_continued;

import pl.com.empas.java_introductory_course.collections.common.Departament;
import pl.com.empas.java_introductory_course.collections.common.DepartamentGenerator;
import pl.com.empas.java_introductory_course.collections.common.Employee;
import pl.com.empas.java_introductory_course.collections.common.OrderedPair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DepartamentBudget {

    Map<Departament, List<Employee>> departaments = DepartamentGenerator.getDepartamentsWithEmployeesMap();
    List<Departament> listOfDepartments = DepartamentGenerator.getDepartaments();

    public static void main(String[] args) {
        DepartamentBudget budget = new DepartamentBudget();
        List<Departament> budgetViolations = budget.getBudgetViolatingDepartaments();
        System.out.println(budgetViolations);

        //Dla chętnych
        List<OrderedPair<Departament, Long>> budgetViolationsWithAmounts = budget.getBudgetViolationsWithAmounts();
        System.out.println(budgetViolationsWithAmounts);
    }

    public long SumOfSalaries(List<Employee> listOfEmployee) {
        long sumOfSalaries = 0;
        for (Employee e : listOfEmployee) {
            sumOfSalaries = sumOfSalaries + e.getSalary();
        }
        return sumOfSalaries;
    }

    public List<Departament> getBudgetViolatingDepartaments() {
        List<Departament> violationList = new ArrayList<>();
        List<Employee> listOfEmployee = new ArrayList<>();

        for (Departament i : listOfDepartments) {
            long sumOfSalaries = 0;
            listOfEmployee = departaments.get(i);
            sumOfSalaries = SumOfSalaries(listOfEmployee);
            if (sumOfSalaries > i.getBudget()) {
                violationList.add(i);
            }
        }
        return violationList;
    }

    public List<OrderedPair<Departament, Long>> getBudgetViolationsWithAmounts() {
        List<Departament> violationList = getBudgetViolatingDepartaments();
        List<OrderedPair<Departament, Long>> listViolationAmount = new ArrayList<>();
        //OrderedPair<Departament,Long> depPair = new OrderedPair<>();
        for (Departament i : violationList) {
            long difference = 0;

            List<Employee> listOfEmployee = departaments.get(i);
            difference = Math.abs(i.getBudget() - SumOfSalaries(listOfEmployee));
            OrderedPair<Departament, Long> depPair = new OrderedPair<>(i, difference);
            listViolationAmount.add(depPair);

        }
        return listViolationAmount;
    }
}
