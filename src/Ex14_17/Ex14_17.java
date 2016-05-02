package Ex14_17;

import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Ex14_17 extends Application{
	
public void start(Stage primaryStage) {
	
	Pane pane=new Pane();
	Button on=new Button("On");
	on.setLayoutX(200);
	on.setLayoutY(200);
	on.setMinSize(100, 100);
	
//	on.setStyle("-fx-border-color: white; -fx-background-color: blue; ");
	
	pane.getChildren().add(on);
	on.setOnMouseClicked(e->{
		for(int i=0; i<=360000 ; ++i)
		{
			on.getTransforms().add(new Rotate(i%360, Rotate.Y_AXIS));
			//for(  long  j=0; j<1000000000; ++j);		
		}
		for(int i=0; i<=120 ; ++i)
		{
	//		on.getTransforms().add(new Rotate(-i, Rotate.Y_AXIS));
			//for(  long  j=0; j<1000000000; ++j);		
		}
	});
	
	Scene scene = new Scene(pane, 500,500);
		
		primaryStage.setTitle("Ex14_17"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
		
	
	}


private void method(Line line8) {
	line8.setStrokeWidth(5);
	line8.setStroke(Color.BLUE);
	
}


public static void main(String[] args) {
Application.launch(args);
}

}
