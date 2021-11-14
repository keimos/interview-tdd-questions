package com.mosley.interview;

import java.math.BigDecimal;
import java.util.Objects;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount = amount * multiplier);
    }

    public boolean equals(Object object) {

        Dollar dollar = (Dollar) object;

        return amount == dollar.amount;
    }

}
