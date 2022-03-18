package Sorters.CountingSort;

import java.util.ArrayList;
import java.util.Collections;

import Sorters.BaseSorter;

public class CountingSort extends BaseSorter {
  protected String name = "CountingSort";
  
  public CountingSort(ArrayList<Integer> array) {
    super(array);
  }

  private ArrayList<Integer> getAcumulatorArray() {
    Integer arrayLength = this.sortedArray.size();
    Integer maxValue = Collections.max(this.unsortedArray);
    Integer acumulatorItems = maxValue + 1;
    ArrayList<Integer> acumulator = new ArrayList<>(
      Collections.nCopies(acumulatorItems, 0)
    );
      
    int i;
    for (i = 0; i < arrayLength; i++) {
      Integer item = this.sortedArray.get(i);
      Integer acumulatorItem = acumulator.get(item);
      acumulator.set(item, acumulatorItem + 1);
    }
    
    return acumulator;
  }

  @Override
  protected ArrayList<Integer> sort() {
    Integer maxValue = Collections.max(this.unsortedArray);
    Integer acumulatorItems = maxValue + 1;
    ArrayList<Integer> acumulator = getAcumulatorArray();
    
    int i = 0;
    for (int j = 0; j < acumulatorItems; j++) {
      for(int k = 0; k < acumulator.get(j); k++) {
        this.sortedArray.set(i, j);
        i += 1;
      }
    }

    return this.sortedArray;
  }

  @Override
  public String getName() {
    return this.name;
  }
}
