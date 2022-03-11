import java.util.Scanner;
import java.util.ArrayList;

import modules.DataGenerator;
import modules.Person;
import modules.Sex;

public class Main {
  public static void main(String[] args) {
    double maxHeight = 0;
    double minHeight = 30000;
    double womanHeightMean = 0;
    int menAmount = 0;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite a quantidade de pessoas: ");
    int amount = scanner.nextInt();

    DataGenerator generator = new DataGenerator(amount);
    ArrayList<Person> data = generator.getPersons();

    for(int i = 0; i < data.size(); i++) {
      Person person = data.get(i);

      if (person.sex.equals(Sex.F)) {
        womanHeightMean = womanHeightMean + person.height;
      } else {
        menAmount = menAmount + 1;
      }

      if (person.height < minHeight) {
        minHeight = person.height;
      }

      if (person.height > maxHeight) {
        maxHeight = person.height;
      }

    }
    
    System.out.println("Média de altura das mulheres: " + womanHeightMean / (amount - menAmount));
    System.out.println("Maior altura: " + maxHeight);
    System.out.println("Menor altura: " + maxHeight);
    System.out.println("Quantidade de Homens: " + menAmount);
    scanner.close();
  }
}
