package Progress_250120;

public class ImmutableAddress {
    private final String VALUE;

    public ImmutableAddress(String VALUE) {
        this.VALUE = VALUE;
    }

    public String getVALUE() {
        return VALUE;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "VALUE='" + VALUE + '\'' +
                '}';
    }
}