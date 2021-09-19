package com.cognizant.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserHospitalTest 
{
	UserHospital userHospital=new UserHospital();
	
	@Test
	public void testUserHospitalAllConstructor()
	{
		UserHospital hospital=new UserHospital("ab", "ab", "ab");
		assertEquals(hospital.getUserid(), "ab");
	}
	
	@Test
	public void testUserid()
	{
		userHospital.setUserid("abc");
		assertEquals(userHospital.getUserid(), "abc");
	}
	
	@Test
	public void testUserPassword()
	{
		userHospital.setUpassword("abc");
		assertEquals(userHospital.getUpassword(), "abc");
	}
	
	@Test
	public void testUserName()
	{
		userHospital.setUname("abc");
		assertEquals(userHospital.getUname(), "abc");
	}
	
	@Test
	public void testoString() {
		String string = userHospital.toString();
		assertEquals(userHospital.toString(),string);
	}
}
