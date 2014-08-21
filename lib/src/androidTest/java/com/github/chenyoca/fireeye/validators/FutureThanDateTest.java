package com.github.chenyoca.fireeye.validators;

import com.github.chenyoca.fireeye.Type;
import com.github.chenyoca.fireeye.supports.AbstractValidator;

/**
 * Created by YooJia.Chen
 * YooJia.Chen@gmail.com
 * 2014-08-13
 */
public class FutureThanDateTest extends GroupTester {

    @Override
    protected AbstractValidator setUpValidator() {
        final DateTimeValidator v = new DateTimeValidator(Type.IsFuture, null);
        v.debug(true);
        return v;
    }

    @Override
    protected String[] setUpStringValues() {
        return new String[]{
                "yyyy/MM/dd",
                "2014/08/13"
        };
    }

    @Override
    protected String[] thisShouldAllAssertTrue() {
        return new String[]{
                "2088/01/01",
                "2016/07/20",
                "2014/08/14",
        };
    }

    @Override
    protected String[] thisShouldAllAssertFalse() {
        return new String[]{
                "2000/01/01",
                "2014/07/20",
                "2014/08/12",
        };
    }
}
