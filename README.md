# Overview
* This project is about Bank related operation which provide two REST API endpoints to interact with data.
* __`1. Fetch Bank Branches:`__ Retreives details of 10 branches of a Bank located in specific city.
* __`2. Fetch Bank Services:`__ Retrieve the list of services provided by each branch.
* This project is developed usin __`Spring Boot`__ for backend development and __`Thymeleaf`__ for rendering frontend views. 
----------

# Features
* Display the data on web page using Thyeleaf templates.
* Connects to a __`MySQL`__ database to fetch the data.
----------
# Technologies used
* __`Java`__ : Language used for backend logic.
* __`Spring Boot`__ : Framework for building RESTful Web services.
* __`Spring Data JPA`__ : For handling database interaction.
* __`Thymeleaf`__ : Template engine to render data in HTML views.
* __`MySQL`__ : Database used to store the data.
* __`Maven`__ : Dependency management and build automation.
-----------
# API Endpoints
1. ### Fetch Bank Branches in a city
  * ##### URL : `/api/branches?city=Bangalore`
  * ##### HTTP Method : `Get`
  * __Response__ : Returns a view displaying the list of bank branches located in Bangalore city.

2. ### Fetch Services for each branch
   * ##### URL : `/api/services`
   * ##### HTTP Method : `Get`
   * __Response__ : Returns a list of services provided by each branch.
---------
# Hosting
* This project is hosted on __`AWS Elastic Beanstalk`__. This application can be accessed using the following URL's.
* __Project Domain__ : __`cuvette-assignment-env-1.eba-mqumyjhj.ap-south-1.elasticbeanstalk.com/`__.
   ### REST API Endpoints:
   1. __Branches API__ : Fetch bank branches.
   * __`cuvette-assignment-env-1.eba-mqumyjhj.ap-south-1.elasticbeanstalk.com/api/branches?city=Bangalore`__.
   2. __Services API__ : Fetch services by each branch
   * __`cuvette-assignment-env-1.eba-mqumyjhj.ap-south-1.elasticbeanstalk.com/api/services`__.
   
-------
# Run the project
 ### Prerequisites
 * Java 21
 * Maven
 * MySQL Database
 ### Steps
 ##### 1. Clone the Repository
 * using the command __`git clone https://github.com/THARUN-KUMAR-GOULI/Springboot-assignment`__.
 ##### 2. Configure the Database
 * update your MySQL connections in the __`application.properties`__ file with your database credentials.
 ##### 3. Run the application
 * The application will start on port __`8080`__ by default.
 * we can specify the port in the application.properties file.
 ##### 4. Access the endpoints
 * Go to __`http://localhost:8080/api/branches?city=Bangalore`__ to view branches table.
 * Go to __`http://localhost:8080/api/services`__ to view services table.
------
# Conclusion
* This project successfully demonstrates a Spring-Boot based web application that allow users to view bank related data.
* It utilizes AWS Beanstalk for hosting, offering flexibility in deploying web applications.
* The API-driven approach, coupled with Thymeleaf templates, provides a user-friendly interface for accessing data.
