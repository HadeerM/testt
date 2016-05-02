package Ex14_28;

import Ex14_28.ClockPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LoanCalculator extends Application {
	
	int temp=0;
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
// Create UI
	
	BorderPane bpane = new BorderPane();
	
	
	GridPane pane1=new GridPane();
	pane1.setPadding(new Insets(2,2,2,2));
	pane1.setVgap(5);
	
	pane1.add(new Label("Color Pick"), 0, 0);
	Rectangle r1 = new Rectangle(0,0,40,40); r1.setFill(Color.RED); pane1.add(r1, 0, 1); 
	Rectangle r2 = new Rectangle(30,0,40,40); r2.setFill(Color.BLACK); pane1.add(r2, 1, 1); 
	Rectangle r3 = new Rectangle(0,30,40,40); r3.setFill(Color.BLUE); pane1.add(r3, 0, 2); 
	Rectangle r4 = new Rectangle(30,30,40,40); r4.setFill(Color.ORANGE); pane1.add(r4, 1, 2); 
	Rectangle r5 = new Rectangle(0,60,40,40); r5.setFill(Color.GREEN); pane1.add(r5, 0, 3); 
	Rectangle r6 = new Rectangle(30,60,40,40); r6.setFill(Color.YELLOW); pane1.add(r6, 1, 3); 
	
	
	GridPane pane2=new GridPane();
	pane2.setVgap(10);
	pane2.setPadding(new Insets(2,2,2,2));
	Rectangle s = new Rectangle(10,10,70,70); s.setStroke(Color.BLACK); s.setFill(Color.WHITE);
	Circle circle = new Circle(100,100,30); circle.setStroke(Color.BLACK); 	circle.setFill(Color.WHITE);
	Line l=new Line(100,100,130,130);
	s.setOnMouseClicked(e ->
	{
		temp=1;
		s.setStroke(Color.YELLOW);
		circle.setStroke(Color.BLACK);
		l.setStroke(Color.BLACK);
	});
	
	
	circle.setOnMouseClicked(e ->{
		temp=2;
		s.setStroke(Color.BLACK);
		circle.setStroke(Color.YELLOW);
		l.setStroke(Color.BLACK);
	});
	
	l.setOnMouseClicked(e ->{
		temp=3;
		s.setStroke(Color.BLACK);
		circle.setStroke(Color.BLACK);
		l.setStroke(Color.YELLOW);
	});
	
	pane2.add(new Label("shapes"), 0, 0);
	pane2.add(s, 0, 1);
	pane2.add(circle, 0, 2);
	pane2.add(l, 0, 3);
	
	Pane r=new Pane();
	r.setStyle("-fx-border-color: blue; -fx-background-color: white; ");
	pane1.setStyle("-fx-border-color: blue");
	pane2.setStyle("-fx-border-color: blue");
	
	Button b = new Button("clear all");
	b.setMinHeight(10);
	b.setMinWidth(500);
	b.setOnMouseClicked(e->{
		r.getChildren().clear();
	});
	
	
	r.setOnMouseClicked(e ->
	{
		if(temp==1)
		{
			Rectangle st = new Rectangle(e.getX(),e.getY(),70,70);  st.setFill(Color.BLACK);
			r.getChildren().add(st);
		}
		else if(temp==2)
		{
			Circle st = new Circle(e.getX(),e.getY(),30);  	st.setFill(Color.BLACK);
			r.getChildren().add(st);
		}
		else if(temp==3)
		{	
			Line st=new Line(e.getY(),e.getY(),130,130);
			r.getChildren().add(st);
		}
		
	});
		
	bpane.setRight(pane2); bpane.setStyle("-fx-border-color: blue");
	bpane.setBottom(b); 
	bpane.setLeft(pane1); 
	bpane.setCenter(r);

 Scene scene = new Scene(bpane, 500, 500);
 primaryStage.setScene(scene); 
 primaryStage.show();

}

public static void main(String[] args) {
Application.launch(args);
}
}