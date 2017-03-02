
# Introduction

This is a basic example of the [Zuul gateway service](https://github.com/Netflix/zuul) and spring. 
 It is very simple. I just wanted to play a little with these technologies.

## How to start the services

To start the web service just run the main method of the WebServiceApplication class.

To start the zuul service just run the main method of the ZuulApplication class.

## Access the webservice

If the service is running you can access the web service directly using [http://localhost:9000/movies](http://localhost:9000/movies)

If Zuul service is also running you can access the web service via Zuul using [http://localhost:8080/service/movies](http://localhost:8080/service/movies)