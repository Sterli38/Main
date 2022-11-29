package NewPackage;

public class Identifier<T, A> {
    private T value;
    private A value1;

    public void setValue1(A value1) {
        this.value1 = value1;
    }

    public A getValue1() {
        return value1;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
