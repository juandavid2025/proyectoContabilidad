package application;
	
import java.io.IOException;

import controller.MainWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Container;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static Container c;
	
	public Main() {
		c = new Container();
	}
	
	@Override
	public void start(Stage window) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/application/MainWindow.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		window.setScene(scene);
		window.setTitle("Chequeo de balance");
		window.show();
		
	}
	
    public static void anotherScreen() {
    	try {
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(Main.class.getResource("BGWindow.fxml"));
			BorderPane root2 = (BorderPane)loader.load();
			Stage stage=new Stage();
			stage.setTitle("Balance general");
			Scene scene2=new Scene(root2);
			stage.setScene(scene2);
			stage.show();		
			
		}catch(Exception e) {
			e.fillInStackTrace();
		}
	}
    
    public static Container getContainer() {
		return c;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
