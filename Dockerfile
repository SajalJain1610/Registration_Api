# Use the official OpenJDK 17 IMage for Docker Hub
FROM openjdk:17
# Set working directory inside  the container
WORKDIR /app
#copy the compiled java applictaion JAR file into the COntainer
COPY ./target/course-service.jar /app
# Expose the port the spring boot application will run on
EXPOSE 8080
#Command to run the application
CMD ["java", "-jar", "course-service.jar"]