package problema1;

public class Employee {
    private String name;
    private Integer workedMonths;
    
    public Employee(String name, Integer workedMonths) {
        this.name = name;
        this.workedMonths = workedMonths;
    }

    public String getName() {
        return this.name;
    }

    public Integer getWorkedMonths() {
        return this.workedMonths;
    }

    @Override
    public String toString() {
        return this.name + " com " + workedMonths.toString() + " meses de empresa";
    }
}
