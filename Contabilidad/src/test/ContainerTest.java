package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;


import org.junit.jupiter.api.Test;

import model.*;

class ContainerTest {
	private Container c;
	
	void stage1() {
		c = new Container();
		String actives = "CxC 3516,Inversiones 306,Efectivo 5136,Inventario 852,"
				+ "ArrendamientoPagoXAntcipado 594,DepreciacionAcumulada -3240,edificios 140004";
		c.addAnActive(actives);
	}
	
	void stage2() {
		c = new Container();
		String passives = "CxP 3630,IngresosxAnticipado 144,DeudaALargoPlazo 5400";
		c.addAPassive(passives);
	}
	
	void stage3() {
		c = new Container();
		String heritage = "CapitalSocial 10800,Ultilidad 882,UtilidadAcumulada 312";
		c.addAHeritage(heritage);
	}
	
	void stage4() {
		c = new Container();
		String entry = "Ventas 12330,CostoDeVentas -84969";
		c.addAnEntry(entry);
	}
	
	void stage5() {
		c = new Container();
		String spends = "Financieros 108,Sueldos 774,Depreciacion 990,Publicidad 1080";
		c.addASpend(spends);
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
		String expected3 = "Efectivo";
		String expected4 = "Inventario";
		String expected5 = "ArrendamientoPagoXAntcipado";
		String expected6 = "DepreciacionAcumulada";
		String expected7 = "edificios";
		assertEquals(expected1,c.getActive().get(0).getName());
		assertEquals(expected2,c.getActive().get(1).getName());
		assertEquals(expected3,c.getActive().get(2).getName());
		assertEquals(expected4,c.getActive().get(3).getName());
		assertEquals(expected5,c.getActive().get(4).getName());
		assertEquals(expected6,c.getActive().get(5).getName());
		assertEquals(expected7,c.getActive().get(6).getName());
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
	
	@Test
	void addAHeritageTest1() {
		stage3();
		assertNotNull(c.getHeritage());
	}
	
	@Test
	void addAHeritageTest2() {
		stage3();
		String expected1 = "CapitalSocial";
		String expected2 = "Ultilidad";
		String expected3 = "UtilidadAcumulada";
		assertEquals(expected1,c.getHeritage().get(0).getName());
		assertEquals(expected2,c.getHeritage().get(1).getName());
		assertEquals(expected3,c.getHeritage().get(2).getName());
	}
	
	@Test
	void addAnEntryTest1() {
		stage4();
		assertNotNull(c.getEntry());
	}
	
	@Test
	void addAnEntryTest2() {
		stage4();
		String expected1 = "Ventas";
		String expected2 = "CostoDeVentas";
		assertEquals(expected1,c.getEntry().get(0).getName());
		assertEquals(expected2,c.getEntry().get(1).getName());
	}
	
	@Test
	void addASpendTest1() {
		stage5();
		assertNotNull(c.getSpend());
	}
	
	@Test
	void  addASpendTest2() {
		stage5();
		String expected1 = "Financieros";
		String expected2 = "Sueldos";
		String expected3 = "Depreciacion";
		String expected4 = "Publicidad";
		assertEquals(expected1,c.getSpend().get(0).getName());
		assertEquals(expected2,c.getSpend().get(1).getName());
		assertEquals(expected3,c.getSpend().get(2).getName());
		assertEquals(expected4,c.getSpend().get(3).getName());
	}
}
