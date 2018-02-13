import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class bekind extends PApplet {

public void setup() {
  
  textSize(78);
  }
  public void draw() {
    stroke(255, 79, 51);
    fill(255, 79, 51);
    textMode(SHAPE);
    text("hello",mouseX,mouseY);
    delay(1000);
    text("you are kind",mouseX,mouseY);
    delay(1000);
    text("you can do anything",mouseX,mouseY);
    delay(1000);
    text("you are amazing",mouseX,mouseY);
    delay(1000);
    text("you can do the thing",mouseX,mouseY);
     delay(1000);
     text("you are nice",mouseX,mouseY);
      delay(1000);
      text("you do kind things",mouseX,mouseY);
     }
  public void settings() {  fullScreen(P3D,2); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "bekind" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
