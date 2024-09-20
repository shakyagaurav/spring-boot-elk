FROM openjdk:17-oracle
VOLUME /tmp
COPY target/spring-boot-elk-0.0.1-SNAPSHOT.jar spring-boot-elk.jar
ENTRYPOINT ["java","-jar","/spring-boot-elk.jar"]