FROM openjdk:12 
VOLUME /tmp
ADD /target/invoice-service-0.0.1-SNAPSHOT.jar invoice-service.jar
ENTRYPOINT ["java","-jar","/invoice-service.jar"]

