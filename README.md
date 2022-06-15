Welcome to your new Kafka Connect Github Source Connector!

# Running in docket

```
mvn clean package
```

```
docker run -it --rm -p 2181:2181 -p 3030:3030 -p 8081:8081 -p 8082:8082 -p 8083:8083 -p 9092:9092 -e ADV_HOST=127.0.0.1 -e RUNTESTS=0 -v ~/kafka-course/kafka-connect/target/kafka-connect-1.0-SNAPSHOT-package/share/java/kafka-connect:/connectors/GitHub landoop/fast-data-dev:cp3.3.0
```
