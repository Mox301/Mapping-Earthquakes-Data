# Mapping-Earthquakes-Data

The point of this project is to work with the real-world data of earthquakes. And applying the concept of mapping the sphere data (latitude and longitude) into two-dimension space (x and y).

# Installation

This project is written in java and processing 3, so be sure that Java SE and processing 3 is installed in your device.

To run the application, First download Java SE from this Link https://java.com/en/download/ . Second Download lib, source and Mapping_earthquakes_data.exe then put all those in the same folder and run Mapping_earthquakes.txt.

# Data

The data that project mapping is from USGS. So to update or change this data, go to https://earthquake.usgs.gov/earthquakes/feed/v1.0/csv.php then copy any Feed link and paste it 
in earthquakesData variable in the "Mapping_earthquakes_data.java" or in the "Mapping_earthquakes_data.pde".


# Mathematics equations
longitude to x-pixel:

x = 256/PI * 2^zoomlevel * (longitude + PI) Pixel

latitude to y-pixel:

y = 256/PI * 2^zoomlevel * (PI - log(tan(PI/4 + latitude/2))) Pixel
