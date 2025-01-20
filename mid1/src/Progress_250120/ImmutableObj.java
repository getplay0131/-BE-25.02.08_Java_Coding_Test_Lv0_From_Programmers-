package Progress_250120;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ImmutableObj add(int addValue) {
        int result = this.value + addValue;
        return new ImmutableObj(result);
    }
}