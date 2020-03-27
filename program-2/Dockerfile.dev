# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
MAINTAINER Manish Pundir <mapundir7@gmail.com>

# Add a volume pointing to /tmp
VOLUME /tmp

# The application's jar file
ARG JAVA_CLASS=StringBuilderEx.java

# Add the application's jar to the container
ADD ${JAVA_CLASS} .

RUN javac StringBuilderEx.java

# Run the jar file 
CMD ["java", "StringBuilderEx"]

