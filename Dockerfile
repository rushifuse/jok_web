# Use OpenJDK as the base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the project files
COPY . .

# Give executable permission to mvnw and build the application
RUN chmod +x mvnw && ./mvnw clean install

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/YOUR_APP.jar"]
