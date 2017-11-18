package pattern05_singleton.practice;

/**
 * Author: Rivers
 * Date: 2017/11/18 15:29
 */
public class Triple {

    private static Triple[] triples = new Triple[] {
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };

    private int id;
    private Triple(int id) {
        System.out.println("Triple id is " + id + " created.");
        this.id = id;
    }

    public static Triple getInstance(int index) {
        if (index >= triples.length) {
            throw new IllegalArgumentException("参数错误");
        }
        return triples[index];
    }

    @Override
    public String toString() {
        return "[Triple id is " + id + "]";
    }
}
