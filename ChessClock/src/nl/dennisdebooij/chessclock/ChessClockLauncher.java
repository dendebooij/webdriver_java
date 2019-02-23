package nl.dennisdebooij.chessclock;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChessClockLauncher extends Application {

	@Override
	public void start(Stage setUpStage) {
		Stage window = setUpStage;

		try {
			Parent root = FXMLLoader.load(getClass().getResource("/nl/dennisdebooij/chessclock/01_setUp.fxml"));
			Scene setUp = new Scene(root,900,700);
			
			window.setTitle("Chess Clock Game Set Up");
			window.setScene(setUp);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
