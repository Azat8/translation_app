package application.router;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Router {
	public static void changeRoute(String view) {
		FXMLLoader loader = new FXMLLoader();
		Router router = new Router();
		loader.setLocation(router.getClass().getResource("/application/views/" + view + ".fxml"));
		
		try {
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Parent root = loader.getRoot();
		Stage stage = new Stage();
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(router.getClass().getResource("/application/application.css").toExternalForm());
		stage.setScene(scene);
		stage.showAndWait();
	}
}
