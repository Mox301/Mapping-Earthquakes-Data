# Mapping-Earthquakes-Data

The point of this project is to work with the real-world data of earthquakes. And applying the concept of mapping the sphere data (latitude and longitude) into two-dimension space (x and y).

# Installation

This project is written in java and processing 3, so be sure that Java SE and processing 3 is installed in your device.

To run the application, First download Java SE from this Link https://java.com/en/download/ . Second Download lib, source and Mapping_earthquakes_data.exe then put all those in the same folder and run Mapping_earthquakes.exe.

# Data

The data that project mapping is from USGS. So to update or change this data, go to https://earthquake.usgs.gov/earthquakes/feed/v1.0/csv.php then copy any Feed link and paste it 
in earthquakesData variable in the "Mapping_earthquakes_data.java" or in the "Mapping_earthquakes_data.pde".

# Map

This is dark-v9 map from https://www.mapbox.com/ . User can change the map by change dark-v9 in String url = "https://api.mapbox.com/styles/v1/mapbox/dark-v9/static/0,0,1,0,0/1024x512?access_token=pk.eyJ1IjoibW9lbWVuMzAwIiwiYSI6ImNrdHU1bTNrZzF4NGYzMG1wZnNwYWJvNjEifQ.dk9m-QSwnUXIvLGOgzaSPg"; in the "Mapping_earthquakes_data.java" or "Mapping_earthquakes_data.pde" to any style from mapbox.

# Mathematics equations
longitude to x-pixel:

x = 256/PI * 2^zoomlevel * (longitude + PI) Pixel

latitude to y-pixel:

y = 256/PI * 2^zoomlevel * (PI - log(tan(PI/4 + latitude/2))) Pixel


# Screenshots
![Screenshot (33)](https://user-images.githubusercontent.com/88712877/134257961-fe817c6f-4ff1-42eb-9af1-a9a2269e4ce0.png)
