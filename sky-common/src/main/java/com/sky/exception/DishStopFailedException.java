package com.sky.exception;

import com.sky.exception.BaseException;

public class DishStopFailedException extends BaseException {

    public DishStopFailedException(){}
    public DishStopFailedException(String msg){
        super(msg);
    }
}
