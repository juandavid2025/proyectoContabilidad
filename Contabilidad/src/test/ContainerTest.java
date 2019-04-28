package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import model.*;

class ContainerTest {
	private Container c;
	
	void stage1() {
		c = new Container();
	}
	
	@Test
	void addAnActiveTest1() {
		stage1();
		String actives = "CxC 3516,Inversiones 306,Inventario 852";
		c.addAnActive(actives);
		assertNotNull(c.getActive());
	}
	
	@Test
	void addAnActiveTest2() {
		stage1();
		String actives = "CxC 3516,Inversiones 306,Inventario 852";
		c.addAnActive(actives);
		String expected1 = "CxC";
		String expected2 = "Inversiones";
		String expected3 = "Inventario";
		assertEquals(expected1,c.getActive().get(0).getName());
		assertEquals(expected2,c.getActive().get(1).getName());
		assertEquals(expected3,c.getActive().get(2).getName());
	}
	
}
