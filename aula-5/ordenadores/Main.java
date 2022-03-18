import java.util.ArrayList;
import java.util.List;

import Sorters.BubbleSort.BubbleSort;
import Sorters.CountingSort.CountingSort;

public class Main {
  public static void main(String args[]) {
    List<Integer> baseArray = List.of(2, 3, 9, 6, 5, 1, 4);

    BubbleSort BubbleSortInstance = new BubbleSort(
      new ArrayList<>(baseArray)
    );
    BubbleSortInstance.run(true);

    CountingSort CountingSortInstance = new CountingSort(
      new ArrayList<>(baseArray)
    );
    CountingSortInstance.run(true);
  }
}
