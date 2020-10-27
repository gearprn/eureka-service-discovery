# eureka-service-discovery

This git repository contains 3 Eclipse projects, one application for server side named 'service-discovery-server' and two applications for client side, first is student services application named 'service-discovery-client1' and another one is teacher services application named 'service-discovery-client2' which used RESTful services from the first application.

## Setup

1. Build and run App.java in _'service-discovery-server'_
2. Build and run App.java in _'service-discovery-client1'_
3. Build and run App.java in _'service-discovery-client2'_
4. Build and run App.java in _'service-discovery-client3'_
5. Build and run App.java in _'service-discovery-client4'_
6. Build and run App.java in _'service-discovery-client5'_
7. Check student services by calling **HTTP GET** [http://localhost:8081/v1/student/61070003](http://localhost:8081/v1/student/61070003)
8. Get result from teacher service which pass request through student service by calling **HTTP GET** [http://localhost:8082/v1/teacher/studentReport](http://localhost:8082/v1/teacher/studentReport)
9. Check service health status by run service dashboard `...`
