package com.dt.api.qa.Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import java.util.List;

import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.qa.helpers.UserServiceHelper;
import com.dt.api.qa.models.UserDetails;
import com.dt.api.qa.models.VerifyInvite;

import io.restassured.response.Response;

public class TestInvite {

	private UserServiceHelper UserServiceHelper;
	@BeforeClass
	public void init() {
		
		UserServiceHelper  = new UserServiceHelper();
	}
	
	@Test
	public void PostInvite() {
		UserServiceHelper.Invite().jsonPath().getString("");
		System.out.println("");
		assertNotNull("", "");
		
	}
}
