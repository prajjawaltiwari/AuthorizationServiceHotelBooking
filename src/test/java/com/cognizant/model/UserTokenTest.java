package com.cognizant.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTokenTest 
{
	UserToken userToken=new UserToken();
	
	@Test
	public void testUserTokenAllConstructor()
	{
		UserToken token=new UserToken("ab", "AB");
		assertEquals(token.getUid(), "ab");
	}
	
	@Test
	public void testGetUid()
	{
		userToken.setUid("abc");
		assertEquals(userToken.getUid(), "abc");
	}
	
	@Test
	public void testGetAuthToken()
	{
		userToken.setAuthToken("ABC");
		assertEquals(userToken.getAuthToken(), "ABC");
	}
	
	@Test
	public void testoString() {
		String string = userToken.toString();
		assertEquals(userToken.toString(),string);
	}
}
