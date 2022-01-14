FROM amazoncorretto:11-alpine

COPY target/rdpview-0.0.1-SNAPSHOT.jar app.jar

ENV GUACD_HOST "127.0.0.1"
ENV GUACD_PORT "4822"

EXPOSE 8082
CMD ["java", "-jar", "./app.jar", "--spring.profiles.active=prod","--guacd.host=${GUACD_HOST}","--guacd.port=${GUACD_PORT}"]