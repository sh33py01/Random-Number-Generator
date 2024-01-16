# Use an official Java runtime as a parent image
FROM openjdk:11-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the .jar file from your target folder to the Docker image
COPY target/RandomNumberGenerator-0.0.1-SNAPSHOT.jar /app/my-app.jar

# Run the jar file 
ENTRYPOINT ["java", "-jar", "/app/my-app.jar"]
