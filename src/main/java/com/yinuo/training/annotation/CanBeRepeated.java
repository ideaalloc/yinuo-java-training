package com.yinuo.training.annotation;

import java.lang.annotation.*;

/**
 * Title.
 * <p>
 * Description.
 *
 * @author Bill Lv {@literal <billcc.lv@hotmail.com>}
 * @version 1.0
 * @since 2016-07-11
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
@Repeatable(RepeatedValues.class)
public @interface CanBeRepeated {
    String value();
}
