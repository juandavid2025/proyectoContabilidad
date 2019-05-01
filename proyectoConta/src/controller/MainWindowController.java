package controller;

import application.Main;
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
    	
    Container container = simulate();
    Main.anotherScreen();
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
    
 public Container simulate() {
    	
    	Container conta = new Container();
    	
    	ActivosTextField.setText("CxC 3516,Inversiones 306,Efectivo 5136,Inventario 852,"
				+ "ArrendamientoPagoXAntcipado 594,DepreciacionAcumulada -3240,edificios 140004");
    	PasivosTextField.setText("CxP 3630,IngresosxAnticipado 144,DeudaALargoPlazo 5400"); 
    	PatrimonioTextField.setText("CapitalSocial 10800,Ultilidad 882,UtilidadAcumulada 312");
    	IngresosTextField.setText("Ventas 12330,CostoDeVentas -84969");
    	GastosTextField.setText("Financieros 108,Sueldos 774,Depreciacion 990,Publicidad 1080");
    	conta.addAnActive(ActivosTextField.getText());
    	conta.addAPassive(PasivosTextField.getText());
    	conta.addAHeritage(PatrimonioTextField.getText());
    	conta.addAnEntry(IngresosTextField.getText());
    	conta.addASpend(GastosTextField.getText());
    	 
    	return conta;
    }
    

    

    
    
}
