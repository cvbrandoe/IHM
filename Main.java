package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

	// C'est le PrimaryStage (Il contient tout)
	private Stage primaryStage;

	// C'est le container principal
	private AnchorPane employeeOperationsView;

	@Override
	public void start(Stage primaryStage) {

		this.primaryStage = primaryStage;

		this.primaryStage.setTitle("Gestion de personnel");

		showEmployeeView();
	}

	// Shows the employee operations view inside.
	public void showEmployeeView() {
		try {
			// First, load EmployeeView from EmployeeView.fxml
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/view/EmployeeView.fxml"));
			employeeOperationsView = (AnchorPane) loader.load();

			Scene scene = new Scene(employeeOperationsView); 
			primaryStage.setScene(scene); // Set the scene in primary stage.

			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
