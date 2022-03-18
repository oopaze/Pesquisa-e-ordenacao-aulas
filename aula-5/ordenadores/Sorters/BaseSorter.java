package Sorters;

import java.util.ArrayList;

public abstract class BaseSorter {
  public ArrayList<Integer> unsortedArray;
  protected ArrayList<Integer> sortedArray;
  protected String name = "Sorter"; 
  
  public BaseSorter(ArrayList<Integer> array) {
    this.unsortedArray = array;
  }

  public ArrayList<Integer> run(Boolean cached) {
    ArrayList<Integer> sortedArray;

    if (this.sortedArray != null && cached) {
      sortedArray = this.sortedArray;
    } else {
      this.sortedArray = this.unsortedArray;
      sortedArray = this.sort();
    }
    
    System.out.println(this);
    
    return sortedArray;
  };

  public void updateArray(ArrayList<Integer> array) {
    this.unsortedArray = array;
    this.sortedArray = null;
  }
  
  protected String getName() {
    return this.name;
  };

  @Override
  public String toString() {
    ArrayList<Integer> sortedArray;

    if (this.sortedArray == null) {
      sortedArray = new ArrayList<>();
    } else {
      sortedArray = this.sortedArray;
    }

    return this.getName() + "<" + sortedArray.toString() + ">";
  }

  protected abstract ArrayList<Integer> sort();
}
