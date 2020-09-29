# feature-request-api

## How to build the project
You must install maven plugin to build the project. Use the following command:

mvn clean install

Once the project is successfully built, you will see feature-request-0.0.1-SNAPSHOT.jar file in the /target directory

## How to run the unit tests

mvn test

## How to run the app
Use the following command to run the application

java -jar feature-request-0.0.1-SNAPSHOT.jar


## How to invoke an endpoint
Get request: http://localhost:8082/api/features

Post request: http://localhost:8082/api/features

{
	"title": "Feature 2",
	"description": "Desc 1",
	"client": "CLIENT_B",
	"clientPriority": 2,
	"productArea": "Policies"
	
	
}
