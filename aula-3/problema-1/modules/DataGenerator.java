package modules;

import java.util.ArrayList;
import java.util.Random;

public class DataGenerator {
  private ArrayList<Person> persons = new ArrayList<>();
  private Random random = new Random();

  public DataGenerator(int amount) {
    this.generateRandomPersons(amount);
  }

  public void addPerson(double height, Sex sex) {
    persons.add(
      new Person(height, sex)
    );
  }

  public ArrayList<Person> getPersons() {
    return persons;
  }

  private void generateRandomPersons(int amount) {
    for (int i = 0; i < amount; i++) {
      double height = (double) this.random.nextInt(200) / 100;
      Sex sex;
      
      if (this.random.nextBoolean()) {
        sex = Sex.F; 
      } else {
        sex = Sex.M;
      }
      this.addPerson(height, sex);
    }
  }
}
