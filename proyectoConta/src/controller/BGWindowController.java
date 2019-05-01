package controller;
import java.util.ArrayList;
import java.util.List;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import model.*;

public class BGWindowController {
	
	@FXML
	private ListView<String> active;
	@FXML
	private ListView<String> passive;
	@FXML
	private ListView<String> heritage;
	@FXML
	private ListView<String> activeV;
	@FXML
	private ListView<String> passiveV;
	@FXML
	private ListView<String> heritageV;
	
	public void initialize() {
		
		activeList();
		passiveList();
		heritageList();
	}
	
	public void activeList() {
		
//		LOS ACTIVOS
		List<String> list=new ArrayList<String>();
		for(int i=0;i<Main.getContainer().getActive().size();i++) {
			list.add(Main.getContainer().getActive().get(i).getName());
		}		
		ObservableList<String> activeList=FXCollections.observableList(list);
		active.setItems(activeList);
		
//		LOS VALORES DE LOS ACTIVOS
		List<String> list2=new ArrayList<String>();
		for(int i=0;i<Main.getContainer().getActive().size();i++) {
			list2.add(Main.getContainer().getActive().get(i).toString());
		}		
		ObservableList<String> activeVList=FXCollections.observableList(list2);
		activeV.setItems(activeVList);
	}
	
	public void passiveList() {
		
//		LOS PASIVOS
		List<String> list=new ArrayList<String>();
		for(int i=0;i<Main.getContainer().getPassive().size();i++) {
			list.add(Main.getContainer().getPassive().get(i).getName());
		}		
		ObservableList<String> passiveList=FXCollections.observableList(list);
		passive.setItems(passiveList);
		
//		LOS VALORES DE LOS PASIVOS
		List<String> list2=new ArrayList<String>();
		for(int i=0;i<Main.getContainer().getPassive().size();i++) {
			list2.add(Main.getContainer().getPassive().get(i).toString());
		}		
		ObservableList<String> passiveVList=FXCollections.observableList(list2);
		passiveV.setItems(passiveVList);
	}
	
	public void heritageList() {
		
//		PATRIMONIO
		List<String> list=new ArrayList<String>();
		for(int i=0;i<Main.getContainer().getHeritage().size();i++) {
			list.add(Main.getContainer().getHeritage().get(i).getName());
		}		
		ObservableList<String> heritageList=FXCollections.observableList(list);
		heritage.setItems(heritageList);
		
//		LOS VALORES DEL PATRIMONIO
		List<String> list2=new ArrayList<String>();
		for(int i=0;i<Main.getContainer().getHeritage().size();i++) {
			list2.add(Main.getContainer().getHeritage().get(i).toString());
		}		
		ObservableList<String> heritageVList=FXCollections.observableList(list2);
		heritageV.setItems(heritageVList);
	}
	

}
