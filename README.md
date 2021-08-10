# Author 
## DennisKingsman
# Process
Step 2  
Creating Stream Cloud example with spring-kafka  
Using deprecated @EnableBinding and @StreamListener  
To check send `post` request to `http://localhost:8087/publish`
with json
```
{
    "empId": 1,
    "name": "name"
}
```
Step 3
If you want to work with rabbit then change 
```
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-stream-binder-kafka</artifactId>
</dependency>
```
to 
```
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-stream-binder-rabbit</artifactId>
</dependency>
```
int pom.xml file
# Issues 
When it comes to start the application with kafka on port 8080 then app's fails  
So in all kafka applications I have changed the port to 808X  
# Resources
[rabbitmq](https://www.rabbitmq.com/#getstarted)
[youtube-guide](https://www.youtube.com/playlist?list=PL4TnYdea-xTI-vUWgIoaDQOpC4PlK31md)
# Related repo
[first step](https://github.com/DennisKingsman/KafkaSpringBootDemo)
# TODO
Look up to migrate from deprecated elements.
