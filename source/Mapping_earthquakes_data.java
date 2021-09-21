import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Mapping_earthquakes_data extends PApplet {


float centerLat = 0;
float centerLon = 0;
String[] earthquakesData;
PImage mapImg;

public void preLoad() {
   String url = "https://api.mapbox.com/styles/v1/mapbox/dark-v9/static/0,0,1,0,0/1024x512?access_token=pk.eyJ1IjoibW9lbWVuMzAwIiwiYSI6ImNrdHU1bTNrZzF4NGYzMG1wZnNwYWJvNjEifQ.dk9m-QSwnUXIvLGOgzaSPg";
   mapImg = loadImage(url, "png");
   earthquakesData = loadStrings("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/1.0_month.csv");
}

public float xLocation(float lon) {
  lon = (float)(Math.toRadians(lon));
  float a = (float)((256/Math.PI) * Math.pow(2,1));
  float b = (float)(lon + Math.PI);
  return a*b;
}

public float yLocation(float lat) {
  lat = (float)(Math.toRadians(lat));
  float a = (float)((256/Math.PI)* Math.pow(2,1));
  float b = (float)(Math.tan(Math.PI/4 + (lat/2)));
  float c = (float)(Math.PI - Math.log(b));
  return a*c;
}

public void setup() {
  
  translate(width/2, height/2);
  imageMode(CENTER);
  preLoad();
  image(mapImg, 0, 0);
  
  for(int i = 1; i < earthquakesData.length; i++) {
    String[] data = earthquakesData[i].split(",");
    float x = xLocation(Float.parseFloat(data[2])) - xLocation(centerLon);
    float y = yLocation(Float.parseFloat(data[1])) - yLocation(centerLat);
    float mag = Float.parseFloat(data[4]);
    mag = (float) Math.pow(10, mag);
    mag = (float) Math.sqrt(mag);
    
    float magMax = (float) Math.sqrt(Math.pow(10, 10));
    
    float d = map(mag, 0, magMax, 0, 180);
    fill(255,0,0);
    stroke(255, 0, 0);
    ellipse(x, y, d, d);
  }
  
}
  public void settings() {  size(1024, 512); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Mapping_earthquakes_data" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
