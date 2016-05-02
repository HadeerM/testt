package Ex14_06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Ex14_06 extends Application{
public void start(Stage primaryStage) {
	
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_LEFT);
		pane.setPadding(new Insets(0, 0, 0, 0));
		
		boolean flag=true;
		for(int i=0; i<8; ++i)
		{
			for(int j=0; j<8; ++j)
			{
				Rectangle r1 = new Rectangle(i*10,j*10,60,60);
				if(flag==false)
				{
					r1.setStroke(Color.BLACK);
					r1.setFill(Color.BLACK);
				}
				else
				{
					r1.setStroke(Color.WHITE);
					r1.setFill(Color.WHITE);
				}
				flag = !flag;
				pane.add(r1, j, i);
			}
			flag = !flag;
		}
		
		Scene scene = new Scene(pane, 480,480);
		
		primaryStage.setTitle("Ex14_06"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
		
	
	}

public static void main(String[] args) {
Application.launch(args);
}
}
