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
	
	public void initialize() {
		
		activeList();
		passiveList();
	}
	
	public void activeList() {
		
		List<String> list=new ArrayList<String>();
		for(int i=0;i<Main.getContainer().getActive().size();i++) {
			list.add(Main.getContainer().getActive().get(i).getName());
		}		
		ObservableList<String> activeList=FXCollections.observableList(list);
		active.setItems(activeList);
	}
	
	public void passiveList() {
		
		List<String> list=new ArrayList<String>();
		for(int i=0;i<Main.getContainer().getPassive().size();i++) {
			list.add(Main.getContainer().getPassive().get(i).getName());
		}		
		ObservableList<String> passiveList=FXCollections.observableList(list);
		passive.setItems(passiveList);
	}
	

}
