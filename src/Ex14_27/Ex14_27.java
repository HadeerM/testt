package Ex14_27;

import Ex14_27.ClockPane;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Ex14_27 extends Application {
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {

ClockPane clock1 = new ClockPane();
clock1.setHour(22);
clock1.setMinute(44);
clock1.setSecond(37);
BorderPane pane = new BorderPane();
pane.setLeft(clock1);

Label lblCurrentTime = new Label("22:44:37");
pane.setBottom(lblCurrentTime);
BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
Scene scene = new Scene(pane, 250, 250);
primaryStage.setTitle("Ex14_27"); 
primaryStage.setScene(scene); 
primaryStage.show(); 
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
