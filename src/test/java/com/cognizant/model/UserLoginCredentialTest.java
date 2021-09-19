package com.cognizant.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserLoginCredentialTest 
{
	UserLoginCredential loginCredential=new UserLoginCredential();
	
	@Test
	public void testUserLoginCredentialAllConstructor()
	{
		UserLoginCredential credential=new UserLoginCredential("abc", "abc");
		assertEquals(credential.getUid(), "abc");
	}
	
	@Test
	public void testGetUid()
	{
		loginCredential.setUid("abc");
		assertEquals(loginCredential.getUid(), "abc");
	}
	
	@Test
	public void testUserPassword()
	{
		loginCredential.setPassword("abc");
		assertEquals(loginCredential.getPassword(), "abc");
	}
	
	@Test
	public void testoString() {
		String string = loginCredential.toString();
		assertEquals(loginCredential.toString(),string);
	}
}
