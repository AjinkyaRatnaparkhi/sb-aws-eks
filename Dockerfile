FROM openjdk:17
ADD target/sb-aws-eks.jar sb-aws-eks.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","sb-aws-eks.jar"]