# zuul-demo
Demo of Spring-Cloud-Netflix Zuul

The 'zuul-demo' repository contains 2 Spring-Boot applications demonstrating the use of 
Spring-Cloud-Netflix Zuul and how it can be used in an API Gateway to filter requests 
and responses and as a reverse proxy to route requests.

* The **book-service** project is a simple Spring-Boot application. 
It runs on port 8090.
* The **zuul-sandbox** project acts as an API gateway, using Zuul to 
filter and route requests to book-service. It runs on port 8080.

## How to Build
From the book-service and zuul-sandbox directories:
`gradle clean build`
	
## How to run
From the book-service and zuul-sandbox directories:
`gradle bootRun`

## How to access
From a browser (or curl) send a GET request to:

<http://localhost:8080/api/book/checked-out> or

<http://localhost:8080/api/book/available>