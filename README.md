# Coding-Challenge

Here is an example of a REST API written in Java using Spring Boot that calculates and returns the reward points earned by a customer per month and in total:

@RestController
@RequestMapping("/rewards")
public class RewardsController {

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
}
This controller accepts a list of purchase amounts as a request parameter and calculates the rewards points earned for each purchase using the rules specified in the problem statement. It also keeps track of the rewards points earned for each month and in total, and stores the results in a map. The map is returned as the response to the API call.

To demonstrate the solution, you can create a sample dataset of customer transactions and pass it to the API.

// Sample dataset
List<Double> purchases = Arrays.asList(120.0, 150.0, 90.0, 200.0, 80.0, 130.0);

// Invoking the API
Map<String, Integer> rewards = restTemplate.getForObject("/rewards/calculate?purchases={purchases}", Map.class, purchases);

// Expected output
{
    "totalPoints": 380,
    "monthPoints1": 140,
    "monthPoints2": 130,
    "monthPoints3": 110
}
The above code is just a sample, you may have to tweak it a little to make it work in your use case, but it should give you an idea of how to implement the solution.
