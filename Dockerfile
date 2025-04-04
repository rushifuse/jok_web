 
# Use OpenJDK as the base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the project files
COPY . .

# Build the application
RUN ./mvnw clean install

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/*.jar"]
