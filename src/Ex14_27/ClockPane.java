package Ex14_27;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
public class ClockPane extends Pane {
private int hour;
private int minute;
private int second;
// Clock pane's width and height
private double w = 250, h = 250;
/** Construct a default clock with the current time*/
public ClockPane() {
setCurrentTime();
}
/** Construct a clock with specified hour, minute, and second */
public ClockPane(int hour, int minute, int second) {
this.hour = hour;
this.minute = minute;
this.second = second;
paintClock();
}
/** Return hour */
public int getHour() {
return hour;
}
/** Set a new hour */
public void setHour(int hour) {
this.hour = hour;
paintClock();
}
/** Return minute */
public int getMinute() {
return minute;
}
/** Set a new minute */
public void setMinute(int minute) {
this.minute = minute;
paintClock();
}
/** Return second */
public int getSecond() {
return second;
}
/** Set a new second */
public void setSecond(int second) {
this.second = second;
paintClock();
}
/** Return clock pane's width */
public double getW() {
return w;
}
/** Set clock pane's width */
public void setW(double w) {
this.w = w;
paintClock();
}
/** Return clock pane's height */
public double getH() {
return h;
}
/** Set clock pane's height */
public void setH(double h) {
this.h = h;
paintClock();
}
/* Set the current time for the clock */
public void setCurrentTime() {
// Construct a calendar for the current date and tim
Calendar calendar = new GregorianCalendar();
// Set current hour, minute and second
this.hour = calendar.get(Calendar.HOUR_OF_DAY);
this.minute = calendar.get(Calendar.MINUTE);
this.second = calendar.get(Calendar.SECOND);
paintClock(); // Repaint the clock
}
/** Paint the clock */
protected void paintClock() {
// Initialize clock parameters
double clockRadius = Math.min(w, h) * 0.8 * 0.5;
double centerX = w / 2;
double centerY = h / 2;

Circle circle = new Circle(centerX, centerY, clockRadius);
circle.setFill(Color.WHITE);
circle.setStroke(Color.BLACK);
Text t1 = new Text(centerX - 5, centerY - clockRadius + 20, "1");
Text t2 = new Text(centerX - clockRadius + 10, centerY + 5, "2");
Text t3 = new Text(centerX + clockRadius - 20, centerY + 3, "3");
Text t4 = new Text(centerX - 3, centerY + clockRadius - 10, "4");

Text t5 = new Text(centerX - 5, centerY - clockRadius + 20, "5");
Text t6 = new Text(centerX - 3, centerY + clockRadius - 10, "6");
Text t7 = new Text(centerX + clockRadius - 20, centerY + 3, "7");
Text t8 = new Text(centerX - 3, centerY + clockRadius - 10, "8");

Text t9 = new Text(centerX - clockRadius + 10, centerY + 5, "9");
Text t10 = new Text(centerX - clockRadius + 10, centerY + 5, "10");
Text t11 = new Text(centerX + clockRadius - 20, centerY + 3, "11");
Text t12 = new Text(centerX - 5, centerY - clockRadius + 20, "12");


// Draw second hand
double sLength = clockRadius * 0.65;
double secondX = centerX + sLength *
Math.sin(second * (2 * Math.PI / 60));
double secondY = centerY - sLength *
Math.cos(second * (2 * Math.PI / 60));
Line sLine = new Line(centerX, centerY, secondX, secondY);
sLine.setStroke(Color.RED);
// Draw minute hand
double mLength = clockRadius * 0.5;
double xMinute = centerX + mLength *
Math.sin(minute * (2 * Math.PI / 60));
double minuteY = centerY - mLength *
Math.cos(minute * (2 * Math.PI / 60));
Line mLine = new Line(centerX, centerY, xMinute, minuteY);
mLine.setStroke(Color.BLUE);
// Draw hour hand
double hLength = clockRadius * 0.4;
double hourX = centerX + hLength *
Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
double hourY = centerY - hLength *
Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
Line hLine = new Line(centerX, centerY, hourX, hourY);
hLine.setStroke(Color.GREEN);
getChildren().clear();
getChildren().add(circle);
getChildren().add(sLine);
getChildren().add(mLine);
getChildren().add(hLine);
draw(clockRadius,centerX,centerY);
}
private void draw(double clockRadius, double centerX, double centerY) {

	for(int i=0; i<60; i++)
	{

		double firstX = centerX + clockRadius * Math.sin(i * (2 * Math.PI / 60));
		double firstY = centerY - clockRadius * Math.cos(i * (2 * Math.PI / 60));
		double sLength1;
		
		if(i%5==0)
			sLength1 = clockRadius * 0.9;
			
		else
			sLength1 = clockRadius * 0.95;
		
		double secondX1 = centerX + sLength1 * Math.sin(i * (2 * Math.PI / 60));
		double secondY1 = centerY - sLength1 * Math.cos(i * (2 * Math.PI / 60));
		
		if(i%5==0)
		{
			Text t= new Text(centerX-5 + sLength1 * Math.sin(i * (2 * Math.PI / 60))*0.85,
					centerY+5 - sLength1 * Math.cos(i * (2 * Math.PI / 60))*0.85,
					String.valueOf(i/5));
			
			if(i==0)
				t = new Text(centerX-5 + sLength1 * Math.sin(i * (2 * Math.PI / 60))*0.85,
						centerY+5 - sLength1 * Math.cos(i * (2 * Math.PI / 60))*0.85, "12");
 
			getChildren().add(t);
		}
		Line sLine1 = new Line(firstX, firstY, secondX1, secondY1);
		getChildren().add(sLine1);
	}

	
	
}
}