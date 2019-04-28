package model;

import java.util.ArrayList;

public class Container {

	ArrayList<Account> active;
	ArrayList<Account> passive;
	ArrayList<Account> heritage;
	ArrayList<Account> entry;
	ArrayList<Account> spend;
	
	public Container() {
		active = new ArrayList<Account>();
		passive = new ArrayList<Account>();
		heritage = new ArrayList<Account>();
		entry = new ArrayList<Account>();
		spend = new ArrayList<Account>();
	}
	
	public void addAnActive(String actives) {
		
		String [] temp = actives.split(",");
		
		for(int i=0;i<temp.length;i++) {
			
			String[] accion = temp[i].split(" ");
			
			Account newAccount = new Account(accion[0],Long.parseLong(accion[1]));
			
			active.add(newAccount);
		}
		
		
	}
	
	public void addAPassive(String passives) {
     
	String [] temp = passives.split(",");
		
		for(int i=0;i<temp.length;i++) {
			
			String[] accion = temp[i].split(" ");
			
			Account newAccount = new Account(accion[0],Long.parseLong(accion[1]));
			
			passive.add(newAccount);
		}
	}
	
	public void addAHeritage(String heritages) {

	String [] temp = heritages.split(",");
		
		for(int i=0;i<temp.length;i++) {
			
			String[] accion = temp[i].split(" ");
			
			Account newAccount = new Account(accion[0],Long.parseLong(accion[1]));
			
			heritage.add(newAccount);
		}
	}
	
	public void addAnEntry(String entry) {

	String [] temp = entry.split(",");
		
		for(int i=0;i<temp.length;i++) {
			
			String[] accion = temp[i].split(" ");
			
			Account newAccount = new Account(accion[0],Long.parseLong(accion[1]));
			
			this.entry.add(newAccount);
		}
	}
	
	public void addASpend(String spends) {
		

	String [] temp = spends.split(",");
		
		for(int i=0;i<temp.length;i++) {
			
			String[] accion = temp[i].split(" ");
			
			Account newAccount = new Account(accion[0],Long.parseLong(accion[1]));
			
			spend.add(newAccount);
		}
		
	}
}
