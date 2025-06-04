# we'll use the latest java jdk image i.e. 24
FROM openjdk:24

#metadata for the project
LABEL authors="devamkumar"
LABEL project="MVCInputApp"

#set the work directory of the application
WORKDIR /app

#copy jar files from the build/lib directory
COPY build/libs/MVCInputApp-0.0.1-SNAPSHOT.jar app.jar

#Expose the port of the application from where we can access it
EXPOSE 8082

#Create entrypont for the application to run
ENTRYPOINT ["java", "-jar", "app.jar"]