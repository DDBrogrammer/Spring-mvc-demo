package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
private String firstName;
@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 chars/digits")
private String postalCode;
public String getPostalCode() {
	return postalCode;
}
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}
@NotNull(message = "is not null ")
@Min(value=0,message = "must greater than 0")
@Max(value=10,message="must less than 10")
private Integer freePasses;

public Integer getFreePasses() {
	return freePasses;
}
public void setFreePasses(Integer freePasses) {
	this.freePasses = freePasses;
}
@NotNull(message = "is not null ")
@Size(min=1,message="u must enter last name")
private String lastName;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@CourseCode(value = "DAI",message = "must starr with DAI")
private String courseCode;
public String getCourseCode() {
	return courseCode;
}
public void setCourseCode(String courseCode) {
	this.courseCode = courseCode;
}
}
