package com.test;

import com.model.RegularAmount;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.Set;

import static org.junit.Assert.*;

public class NotNullValidationTest {

    private Validator validator;

    @Before
    public void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }


    @Test
    public void testAmountAndFrequencyIsNull() {

        RegularAmount regularAmount = new RegularAmount();
        regularAmount.setAmount(null);
        regularAmount.setFrequency(null);

        Set<ConstraintViolation<RegularAmount>> violations = validator.validate(regularAmount);
        assertTrue(violations.size() > 0);
        assertEquals(3, violations.size());
        assertEquals("Amount can't be null", violations.iterator().next().getMessage());
    }
}
