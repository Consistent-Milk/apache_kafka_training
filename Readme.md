Apache Kafka training projects.

Tech Stack
----------

Eclipse

Tomcat

Maven

Springboot

Kafka

Zookeeper

JDK 17

Oracle XE

Postman


Reminder
--------

Add notes related to setting up local environment for kafka and zookeeper.


Important:
----------
Never delete kafka topics when using windows CLI. If necessary delete them manually from data/kafka


API:
----

Springboot web has been integrated to enable API endpoints. Endpoints serve data directly on specific Kafka Topics from specific kafka brokers/kafka cluster managed by zookeeper.

Kafka topics are created using a replication factor of 3. Thus it can be assumed that one broker serves data as the leader of that topic, but two other brokers remain as ISR.

Instead of looking up endpoints directly through browser, postman is used to test them.

Available endpoints for kafka-producer:
---------------------------------------

1. http://localhost:8080/api/commodity/v1/all