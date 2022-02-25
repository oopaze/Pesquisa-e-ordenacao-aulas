package problema1;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Employee employeeOne = new Employee("José Pedro", 10);
        Employee employeeTwo = new Employee("Pedro José", 11);
        Employee employeeThree = new Employee("João Pedro", 12);
        
        Business business = new Business();
        business.addEmployeeObject(employeeOne);
        business.addEmployeeObject(employeeTwo);
        business.addEmployeeObject(employeeThree);

        String startMessage = "\n1. Adicionar novo funcionário\n";
        startMessage += "2. Ver funcionário com maior tempo de empresa\n";
        startMessage += "3. Ver funcionário com menor tempo de empresa\n";
        startMessage += "0. Sair\n";
        startMessage += "Digite: ";

        String chosenOption = "1";
        Scanner scanner = new Scanner(System.in);
        while(!chosenOption.equals("0")) {
            System.out.print(startMessage);
            chosenOption = scanner.next();

            switch(chosenOption) {
                case "0":
                    System.out.println("Parando...");
                    break;
                case "1": 
                    business.addEmployee(scanner);
                    break;
                case "2":
                    System.out.println(business.mostOldEmployee);
                    break;
                case "3":
                    System.out.println(business.mostRecentEmployee);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        scanner.close();
    }
}
