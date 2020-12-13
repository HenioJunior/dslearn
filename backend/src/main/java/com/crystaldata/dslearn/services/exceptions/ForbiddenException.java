package com.crystaldata.dslearn.services.exceptions;

public class ForbiddenException extends RuntimeException{
	private static final long serialVersionUID = 5198135507614653307L;

	public ForbiddenException(String msg){
        super(msg);
    }
}
