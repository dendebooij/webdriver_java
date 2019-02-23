package nl.dennisdebooij.chessclock;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ChessClockController {
	
	@FXML
	private Text backAction; //TO DO: remove when back functionality has been implemented
	
	@FXML
	private Text pauseAction; //TO DO: remove when back functionality has been implemented
	
	@FXML
	public Button backButton;
	
	@FXML
	public Button pauseButton; //TO DO when pause button is pressed it should change to a resume button
	
	@FXML
	public Button playButton;
	
	@FXML
	public Button closeButton;
	//TO DO add a resetButton and reset functionality
	//TO DO add a switchButton and switch functionality
	
	@FXML 
	protected void handlePlayButtonAction(ActionEvent event) {
		Stage chessClock;
		Parent root;
		if(event.getSource()==playButton) {
			chessClock=(Stage)playButton.getScene().getWindow();
			try {
				root = FXMLLoader.load(getClass().getResource("02_chessClock.fxml"));
				Scene scene = new Scene(root,900,700);
				chessClock.setTitle("Chess Clock");
				chessClock.setScene(scene);
				chessClock.show();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@FXML
	public void handleBackButtonAction(ActionEvent event) {
 		backAction.setText("TO DO: implement back functionality");
	}
	
	@FXML
	public void handleCloseButtonAction(ActionEvent event) {
	    Stage stage = (Stage) closeButton.getScene().getWindow();
	    stage.close();
	}
	
	@FXML
	public void handlePauseButtonAction(ActionEvent event) {
		pauseAction.setText("TO DO: implement pause functionality");
	}
}
