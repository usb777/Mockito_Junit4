package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.meanbean.test.BeanTester;

public class UsersTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGettersAndSetters() {
		new BeanTester().testBean(Users.class);
	}
	
	
	@After
	public void tearDown() throws Exception {
	}



}
