package com.comcast.organization;

import org.testng.annotations.Test;

public class oragTest {

	@Test(groups = "Smoketest")
	public void createOrganizationTest() 
	{
		System.out.println("execute createOrganizationTest");
	}

	@Test(groups = "regressiontest")
	public void createOrgWithleadTest() 
	{
		System.out.println("execute createOrgWithleadTest");
	}

	@Test(groups = "regressiontest")
	public void delectorgTest() 
	{
		System.out.println("execute delectorgTest");
	}

}
