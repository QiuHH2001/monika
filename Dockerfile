FROM coding-public-docker.pkg.coding.net/public/docker/openjdk:8

ADD ./target/monika-0.0.1-SNAPSHOT.jar /root/workspace/monika-0.0.1-SNAPSHOT.jar

RUN bash -c 'touch /monika-0.0.1-SNAPSHOT.jar'

EXPOSE 8080

CMD ["java", "-jar", "./monika-0.0.1-SNAPSHOT.jar"]