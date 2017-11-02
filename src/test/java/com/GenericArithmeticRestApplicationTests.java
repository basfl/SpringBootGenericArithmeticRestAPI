package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

//@RunWith(SpringRunner.class)
@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class GenericArithmeticRestApplicationTests {
	@Mock
	private RestApp restApp;


	@Test
	public void contextLoads() {
		restApp=new RestApp();
		restApp.getAdd("10", "1", "1");
	
//		System.out.println("*********"+result);
	}

}
