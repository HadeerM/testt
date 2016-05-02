package Ex14_26;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;




public class Ex14_26 extends Application {
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {

	
ClockPane clock1 = new ClockPane();
clock1.setHour(4);
clock1.setMinute(20);
clock1.setSecond(45);

ClockPane clock2 = new ClockPane();
clock2.setHour(22);
clock2.setMinute(46);
clock2.setSecond(15);

BorderPane pane = new BorderPane();
pane.setLeft(clock1);
pane.setRight(clock2);


Scene scene = new Scene(pane, 500, 250);
primaryStage.setTitle("Ex14_26"); 
primaryStage.setScene(scene); 
primaryStage.show(); 
}



	public static void main(String[] args) {
	
Application.launch(args);
	}

}
