Apache CXF and Spring Boot Simple Example
===

Download maven
- https://maven.apache.org/download.cgi

Install maven
- https://maven.apache.org/install.html

Build the project
- mvn package

Run using Spring Boot Maven plugin
- mvn spring-boot:run

Run using standalone JAR
- java -jar target/jax-rs-cxf-spring-boot-0.0.1-SNAPSHOT.jar         

Invoke People REST service  
- curl http://localhost:8080/api/people