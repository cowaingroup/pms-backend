package com.cowain.pms.modules.sys.entity;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelColumn {

    String columnName() default "";

    boolean require() default true;
    int col() default 0;
}
