package Sorters.BubbleSort;

import java.util.ArrayList;

import Sorters.BaseSorter;

public class BubbleSort extends BaseSorter {
  protected String name = "BubbleSort";
  
  public BubbleSort(ArrayList<Integer> array) {
    super(array);
  }

  @Override
  protected ArrayList<Integer> sort() {
    Integer i; 
    Integer j;
    Integer length = this.sortedArray.size() - 1;
    Integer progress = 0;

    for (j = 0; j < length; j++) {
      for (i = 0; i < length - progress; i++) {
        Integer num = this.sortedArray.get(i);
        Integer nextNum = this.sortedArray.get(i + 1);
        
        if (num > nextNum) {
          this.sortedArray.set(i, nextNum);
          this.sortedArray.set(i + 1, num);
        }
      }

      progress += 1;
    }

    return this.sortedArray;
  }

  @Override
  public String getName() {
    return this.name;
  }
}
