package com.cg.OnlineMovieTicketSystem.exception;

public class EntityAlreadyPresentException extends RuntimeException{
	public EntityAlreadyPresentException(String msg)
	{
		super(msg);
	}

}
