FROM openjdk:17

WORKDIR ./

COPY ./target/Shreeya_Mini_Project-1.0-SNAPSHOT-jar-with-dependencies.jar ./

CMD ["java", "-jar", "Shreeya_Mini_Project-1.0-SNAPSHOT-jar-with-dependencies.jar"]