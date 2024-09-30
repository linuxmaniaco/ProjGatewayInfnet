FROM amazoncorretto:21
LABEL authors="eduardo"
EXPOSE 9999
WORKDIR /app
COPY app.jar ./
ENTRYPOINT ["java", "-jar", "app.jar"]