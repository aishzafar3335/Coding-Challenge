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

