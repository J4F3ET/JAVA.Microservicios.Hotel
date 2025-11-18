FROM maven:3.9-eclipse-temurin-25
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests
ENTRYPOINT ["mvn"]
CMD ["spring-boot:run"]