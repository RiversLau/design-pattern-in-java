package pattern10_strategy.practice;

/**
 * Author: Rivers
 * Date: 2017/11/19 20:27
 */
public class QuickSorter extends Sorter {

    Comparable[] data;

    @Override
    public void sort(Comparable[] data) {
        this.data = data;
        qsort(0, data.length - 1);
    }

    public void qsort(int pre, int post) {
        int saved_pre = pre;
        int saved_post = post;
        Comparable mid = data[(pre + post) / 2];
        do {
            while (data[pre].compareTo(mid) < 0) {
                pre++;
            }
            while (mid.compareTo(data[post]) < 0) {
                post--;
            }
            if (pre <= post) {
                Comparable tmp = data[pre];
                data[pre] = data[post];
                data[post] = tmp;
                pre++;
                post--;
            }
        } while (pre <= post);

        if (saved_pre <= post) {
            qsort(saved_pre, post);
        }
        if (pre < saved_post) {
            qsort(pre, saved_post);
        }
    }
}