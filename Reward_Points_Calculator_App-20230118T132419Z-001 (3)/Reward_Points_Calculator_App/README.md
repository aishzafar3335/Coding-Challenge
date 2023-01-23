
# Getting Started
Before running the application, you may import the project into your favourite IDE or run below command to build the application locally and then Run it

    mvn clean install

### Running application locally
There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in 
the com.assessment.reward.Reward.RewardPointsCalculatorApplication class from your IDE.

Alternatively you can use the 
https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html
like so:

mvn spring-boot:run
#Validating App using Actuator End points

End point will give  http://localhost:8080/actuator/env all the environmental configuration about the server.

End point will give http://localhost:8080/actuator/beans all the spring beans loaded in the context.

End point will give http://localhost:8080/actuator/threaddump give the current server thread dump.






#Lauching your app using swagger

After successful run of the spring boot application, navigate to
http://localhost:8080/swagger-ui.html and view your end points in Rewards Controller

To Run : 
    http://localhost:8080/swagger-ui.html#/rewards-com.assessment.reward.Reward.controller/getRewardsByCustomerIdUsingGET : Input customer Id and then Run.
    http://localhost:8080/swagger-ui.html#/rewards-com.assessment.reward.Reward.controller/getAllRewardsUsingGET : TO view All your rewards.
    http://localhost:8080/swagger-ui.html#/rewards-com.assessment.reward.Reward.controller/getAllTransactionsUsingGET : To get all Transactions.

API Screenshots:
![PHOTO-2023-01-23-07-22-59](https://user-images.githubusercontent.com/51256245/214118282-c33f0491-3adf-4f54-be3f-c07c1d7531a2.jpg)
![PHOTO-2023-01-23-07-22-46](https://user-images.githubusercontent.com/51256245/214118284-406fca90-c05b-4d55-bc45-ac41fbef1529.jpg)
![PHOTO-2023-01-23-07-22-39](https://user-images.githubusercontent.com/51256245/214118287-e0536d88-96b2-4c6a-8885-17eac7845d68.jpg)
    

