package controller;
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
		active = new ListView<>();
		active.getItems().addAll("dsadsd","dsdqwd");
		active.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}

}
