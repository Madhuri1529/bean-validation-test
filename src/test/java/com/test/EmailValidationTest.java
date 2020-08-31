package com.test;

import com.Frequency;
import com.model.RegularAmount;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class EmailValidationTest {

    private static Validator validator;

    @BeforeClass
    public static void initGlobal()
    {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void whenFrequencyIsNull() {

        Set<ConstraintViolation<RegularAmount>> constraintViolations = null;
        RegularAmount regularAmount = new RegularAmount();
        regularAmount.setFrequency(null);

        constraintViolations = validator.validate(regularAmount);
        assertEquals(3, constraintViolations.size());
     }


    @Test
    public void whenFrequencyIsWeek() {

        Set<ConstraintViolation<RegularAmount>> constraintViolations = null;
        RegularAmount regularAmount = new RegularAmount();
        regularAmount.setFrequency(Frequency.WEEK);

        constraintViolations = validator.validate(regularAmount);
        assertEquals(2, constraintViolations.size());
    }

    @Test
    public void whenFrequencyIsMonth() {

        Set<ConstraintViolation<RegularAmount>> constraintViolations = null;
        RegularAmount regularAmount = new RegularAmount();
        regularAmount.setFrequency(Frequency.MONTH);

        constraintViolations = validator.validate(regularAmount);
        assertEquals(2, constraintViolations.size());
    }

}
