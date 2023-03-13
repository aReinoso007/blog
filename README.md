# Blog REST API
REST API for blog App

### Dependencies
 - gradle: 7.4.1
 - JAVA JDK: 15
 - PostgreSQL
 
## Getting started :rocket:
1. Make sure you got all you dependencies right.
```console
  gradle --v
  > Gradle 7.4.1
```

2. Make sure you got the right JDK
  
3. Have a database created with the name of `blog`
4. Add credentials to the  `application.properties` file in the following directory `src/main/resources/`
```properties
 spring.datasource.username=username
 spring.datasource.password=password
```
5. Make sure there is no other app or process running on the port 500, if you want to change the port make sure you change the port
in the `BASE_URL` in the frontend application in the Api.js file inside the config folder.

6. Enjoy 😊
