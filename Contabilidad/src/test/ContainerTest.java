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
		String actives = "CxC 3516,Inversiones 306,Inventario 852";
		c.addAnActive(actives);
	}
	
	void stage2() {
		c = new Container();
		String passives = "CxP 3630,IngresosxAnticipado 144,DeudaALargoPlazo 5400";
		c.addAPassive(passives);
	}
	
	@Test
	void addAnActiveTest1() {
		stage1();
		assertNotNull(c.getActive());
	}
	
	@Test
	void addAnActiveTest2() {
		stage1();
		String expected1 = "CxC";
		String expected2 = "Inversiones";
		String expected3 = "Inventario";
		assertEquals(expected1,c.getActive().get(0).getName());
		assertEquals(expected2,c.getActive().get(1).getName());
		assertEquals(expected3,c.getActive().get(2).getName());
	}
	
	@Test
	void addAPassiveTest1() {
		stage2();
		assertNotNull(c.getPassive());
	}
	
	@Test
	void addAPassiveTest2() {
		stage2();
		String expected1 = "CxP";
		String expected2 = "IngresosxAnticipado";
		String expected3 = "DeudaALargoPlazo";
		assertEquals(expected1,c.getPassive().get(0).getName());
		assertEquals(expected2,c.getPassive().get(1).getName());
		assertEquals(expected3,c.getPassive().get(2).getName());
	}
	
}
