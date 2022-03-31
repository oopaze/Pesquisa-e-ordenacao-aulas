package Sorters.MergeSort;

import java.util.ArrayList;

import Sorters.BaseSorter;

public class MergeSort extends BaseSorter {
  protected String name = "MergeSort";

  public MergeSort(ArrayList<Integer> array) {
    super(array);
  }

  @Override
  protected ArrayList<Integer> sort() {
    return this.sortedArray;
  }
  
}
