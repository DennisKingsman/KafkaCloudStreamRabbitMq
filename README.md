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
# Issues 
When it comes to start the application with kafka on port 8080 then app's fails  
So in all kafka applications I have changed the port to 808X  
