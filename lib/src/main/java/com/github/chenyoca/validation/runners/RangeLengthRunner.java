package com.github.chenyoca.validation.runners;

/**
 * User: chenyoca@gmail.com
 * Date: 2014-06-26
 * Length in range
 */
public class RangeLengthRunner extends TestRunner{

    public RangeLengthRunner(String message){
        super(message);
    }

    @Override
    public boolean test(String inputValue) {
        checkIntValues("RangeLength Test");
        int minLength = extraInt[0];
        int maxLength = extraInt[1];
        int length = inputValue.length();
        return minLength <= length && length <= maxLength;
    }

}
