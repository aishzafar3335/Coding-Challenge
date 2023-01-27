
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
    
Coding-Challenge
Here is an example of a REST API written in Java using Spring Boot that calculates and returns the reward points earned by a customer per month and in total:

@RestController @RequestMapping("/rewards") public class RewardsController {

@GetMapping("/calculate")
public Map<String, Integer> calculateRewards(@RequestParam List<Double> purchases) {
    Map<String, Integer> rewards = new HashMap<>();
    int totalPoints = 0;
    int monthPoints1 = 0;
    int monthPoints2 = 0;
    int monthPoints3 = 0;
    int month = 1;
    for (Double purchase : purchases) {
        int points = 0;
        if (purchase > 50) {
            points += purchase.intValue() - 50;
        }
        if (purchase > 100) {
            points += purchase.intValue() - 100;
        }
        if (month == 1) {
            monthPoints1 += points;
        } else if (month == 2) {
            monthPoints2 += points;
        } else {
            monthPoints3 += points;
        }
        totalPoints += points;
        month++;
        if (month > 3) {
            month = 1;
        }
    }
    rewards.put("totalPoints", totalPoints);
    rewards.put("monthPoints1", monthPoints1);
    rewards.put("monthPoints2", monthPoints2);
    rewards.put("monthPoints3", monthPoints3);
    return rewards;
}
} This controller accepts a list of purchase amounts as a request parameter and calculates the rewards points earned for each purchase using the rules specified in the problem statement. It also keeps track of the rewards points earned for each month and in total, and stores the results in a map. The map is returned as the response to the API call.

To demonstrate the solution, you can create a sample dataset of customer transactions and pass it to the API.

// Sample dataset List purchases = Arrays.asList(120.0, 150.0, 90.0, 200.0, 80.0, 130.0);

// Invoking the API Map<String, Integer> rewards = restTemplate.getForObject("/rewards/calculate?purchases={purchases}", Map.class, purchases);

// Expected output { "totalPoints": 380, "monthPoints1": 140, "monthPoints2": 130, "monthPoints3": 110 } The above code is just a sample, you may have to tweak it a little to make it work in your use case, but it should give you an idea of how to implement the solution.


Screenshots:


![PHOTO-2023-01-23-07-22-59](https://user-images.githubusercontent.com/51256245/214118282-c33f0491-3adf-4f54-be3f-c07c1d7531a2.jpg)
![PHOTO-2023-01-23-07-22-46](https://user-images.githubusercontent.com/51256245/214118284-406fca90-c05b-4d55-bc45-ac41fbef1529.jpg)
![PHOTO-2023-01-23-07-22-39](https://user-images.githubusercontent.com/51256245/214118287-e0536d88-96b2-4c6a-8885-17eac7845d68.jpg)
![PHOTO-2023-01-24-11-54-41 (1)](https://user-images.githubusercontent.com/51256245/214432261-fcd0bcc9-c5e2-41aa-9cc1-97cc67a44b9f.jpg)


    

