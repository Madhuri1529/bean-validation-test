package contraints;

import java.sql.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.NotNull;

public class NotNullValidator implements ConstraintValidator<NotNull, String> {

    @Override
    public void initialize(NotNull arg0) {
    }

    @Override
    public boolean isValid(String amount, ConstraintValidatorContext ctx) {
        if (amount == null) {
            return false;
        }
        return true;
    }

}
