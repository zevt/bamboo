package com.zeroexception.common.bamboo.instrument;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = Valid.Validator.class)
public @interface Valid {


  class Validator implements ConstraintValidator<Valid, Long> {

    @Override
    public boolean isValid(Long o, ConstraintValidatorContext constraintValidatorContext) {

      return o != 1;
    }


  }

}
