package pattern10_strategy.practice;

/**
 * Author: Rivers
 * Date: 2017/11/19 20:33
 */
public class SorterTest {

    public static void main(String[] args) {
        String[] data = {"Dumpty", "Bowman", "Carroll", "Elfland", "Alice"};

        SortAndPrint sp1 = new SortAndPrint(data, new SelectionSorter());
        sp1.execute();

        String[] data2 = {"Dumpty", "Bowman", "Carroll", "Elfland", "Alice"};
        SortAndPrint sp2 = new SortAndPrint(data2, new QuickSorter());
        sp2.execute();
    }
}
