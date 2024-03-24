package domain;

import java.util.Objects;

public class carName {

    private final String value;

    public carName(final String name) {
        this.value = name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        carName name = (carName) o;
        return Objects.equals(getValue(), name.getValue());
    }
}