package comp110;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application{
	
	Stage _stage;
	Circle _circle;
	
	public static void main(String[] args){
		Application.launch(args);
	}
	
	public void start(Stage stage){
		_stage = stage;
		BorderPane pane = new BorderPane();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("COMP523");
		stage.setHeight(300);
		stage.setWidth(300);
		Button button = new Button("Click here");
		//button.setOnAction((e) -> new Alert(AlertType.INFORMATION, "Button Pressed").show());
		button.setOnAction(this::changeColor);
		pane.setBottom(button);
		
		_circle = new Circle(50.0, Color.RED);
		pane.setTop(_circle);
		
		stage.show();
		
	}
	
	private void changeColor(ActionEvent e){
		_circle.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
	}
}
