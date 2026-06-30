package com.kodewala.oops.inheritance.override;

public class GenericResponse {

	GenericResponse(String message) {
		super();
	}

}

class UPIResponse extends GenericResponse {

	UPIResponse(String message, String code) {
		super(message);
	}

}

class Parent
{
	
}

class Child extends Parent
{
	
}