package problema1;

import java.util.ArrayList;
import java.util.Scanner;

public class Business {
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    public Employee mostRecentEmployee; 
    public Employee mostOldEmployee; 

    public void addEmployeeObject(Employee employee) {
        employees.add(employee);
        this.setMostRecentAndOldEmployee();
    }

    public void addEmployee(Scanner scanner) {
        System.out.print("Nome do Funcionário: ");
        String name = scanner.next();

        System.out.print("Número de meses trabalhados: ");
        Integer workedMonths = scanner.nextInt();

        this.employees.add(new Employee(name, workedMonths));

        System.out.print(name + " adicionado com " + workedMonths.toString() + " meses de empresa");

        this.setMostRecentAndOldEmployee();
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    public void setMostRecentAndOldEmployee() {
        this.mostRecentEmployee = employees.get(0);
        this.mostOldEmployee = employees.get(0);
        
        employees.forEach((instance) -> {
            if (instance.getWorkedMonths() > this.mostOldEmployee.getWorkedMonths()) {
                this.mostOldEmployee = instance;
            }

            if (instance.getWorkedMonths() < this.mostRecentEmployee.getWorkedMonths()) {
                this.mostRecentEmployee = instance;
            }
        });
    }
}
