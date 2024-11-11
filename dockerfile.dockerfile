FROM openjdk:17-jdk-alpine
WORKDIR /usr/src/app
COPY Main_1.java .
RUN javac Main_1.java
CMD ["java", "Main_1"]
