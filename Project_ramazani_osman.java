import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_ramazani_osman {
    public static void main(String[] args) throws IOException {

        ArrayList<Policy> policies = new ArrayList<>();

        Scanner input = new Scanner(new File("PolicyInformation.txt"));

        while (input.hasNext()) {
            int policyNumber = input.nextInt();
            input.nextLine();

            String providerName = input.nextLine();
            String firstName = input.nextLine();
            String lastName = input.nextLine();

            int age = input.nextInt();
            input.nextLine();

            String smokingStatus = input.nextLine();

            double height = input.nextDouble();
            double weight = input.nextDouble();

            if (input.hasNextLine()) {
                input.nextLine();
            }

            Policy policy = new Policy(policyNumber, providerName, firstName,
                    lastName, age, smokingStatus, height, weight);

            policies.add(policy);
        }

        input.close();

        int smokerCount = 0;
        int nonSmokerCount = 0;

        for (Policy policy : policies) {
            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getLastName());
            System.out.println("Policyholder's Age: " + policy.getAge());
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policy.getSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f%n", policy.calculateBMI());
            System.out.printf("Policy Price: $%.2f%n%n", policy.calculatePolicyPrice());

            if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}