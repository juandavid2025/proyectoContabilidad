package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Container;

public class MainWindowController {

	@FXML
    private Button nextButton;

    @FXML
    private TextField ActivosTextField;

    @FXML
    private TextField PasivosTextField;

    @FXML
    private TextField PatrimonioTextField;

    @FXML
    private TextField GastosTextField;

    @FXML
    private TextField IngresosTextField;

    @FXML
    void nextClicked(ActionEvent event) {

    checkInvariants();
    	
    Container container = read();
    	
    }
    
    public void checkInvariants() {
    	
    	
    	
    }
    
    public Container read() {
    	
    	Container conta = new Container();
    	 
    	conta.addAnActive(ActivosTextField.getText());
    	conta.addAPassive(PasivosTextField.getText());
    	conta.addAHeritage(PatrimonioTextField.getText());
    	conta.addAnEntry(IngresosTextField.getText());
    	conta.addASpend(GastosTextField.getText());
    	
    	return conta;
    }
    
    
}
