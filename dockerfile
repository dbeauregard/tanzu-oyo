FROM adoptopenjdk/openjdk11

COPY build/libs/tanzu-oyo-0.0.1-SNAPSHOT.jar /usr/src/tanzu-oyo.jar

CMD java -jar /usr/src/tanzu-oyo.jar
