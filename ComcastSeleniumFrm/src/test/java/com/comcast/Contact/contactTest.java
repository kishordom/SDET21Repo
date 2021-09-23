package com.comcast.Contact;

import org.testng.annotations.Test;

public class contactTest {

	@Test(groups = "Smoketest")
	public void createContactTest() 
	{
		System.out.println("execute createContactTest");
	}

	@Test(groups = "Smoketest")
	public void validateContactTest() 
	{
		System.out.println("execute validateContactTest");
	}

	@Test(groups = "regressiontest")
	public void createContactWithOrgTest() 
	{
		System.out.println("execute createContactWithOrgTest");
	}

	@Test(groups = "regressiontest")
	public void delectContactTest() 
	{
		System.out.println("execute delectContactTest");
	}

}
