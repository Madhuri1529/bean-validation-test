package com.model;

import com.Frequency;
import com.constraints.EnumNamePattern;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class RegularAmount {

    @EnumNamePattern(regexp = "WEEK|TWO_WEEK|FOUR_WEEK|MONTH|QUARTER|YEAR")
    @NotNull(message = "Frequency can't be null")
    private Frequency frequency;

    @NotNull(message = "Amount can't be null")
    @NotBlank(message = "Amount can't be null")
    private String amount;

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
