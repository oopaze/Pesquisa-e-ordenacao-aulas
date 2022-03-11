package modules;

public class Person {
  public double height;
  public Sex sex;

  public Person (double height, Sex sex) {
    this.height = height;
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "sex: " + this.sex.toString() + " | height: " + this.height;
  }
}
