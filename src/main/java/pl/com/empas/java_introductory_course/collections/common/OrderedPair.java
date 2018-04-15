package pl.com.empas.java_introductory_course.collections.common;

public class OrderedPair<V,U> {
    private final V val1;
    private final U val2;

    @Override
    public String toString() {
        return
                "{" + val1.getClass().getSimpleName() + "=" + val1 +
                val2.getClass().getSimpleName() + "=" + val2 +
                '}';
    }

    public OrderedPair(V val1, U val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public V getVal1() {
        return val1;
    }

    public U getVal2() {
        return val2;
    }

}
