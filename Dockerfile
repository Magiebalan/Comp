FROM openjdk:8
EXPOSE 8089
ADD target/EmployeeData-Comp-Springboot-0.0.1-SNAPSHOT.jar EmployeeData-Comp-Springboot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java""-jar","/EmployeeData-Comp-Springboot-0.0.1-SNAPSHOT.jar"]

