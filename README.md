### Spring Actuator


* Actuator endpoints let you monitor and interact with your application. 
* Spring Boot includes a number of built-in endpoints and lets you add your own.


You can enable or disable each individual endpoint and expose them (make them remotely accessible) over HTTP or JMX. 

An endpoint is considered to be available when it is both enabled and exposed. The built-in endpoints are auto-configured only when they are available. 

Most applications choose exposure over HTTP, where the ID of the endpoint and a prefix of /actuator is mapped to a URL. For example, by default, the health endpoint is mapped to /actuator/health.

---


##### Changing Logging Level at Runtime on the fly

* We need to send a POST request to the same logger URL:

```
curl --location --request POST 'http://localhost:8082/actuator/loggers/org.hibernate' \
--header 'Content-type: application/json' \
--data-raw '{
  "configuredLevel": "DEBUG"
}'
```