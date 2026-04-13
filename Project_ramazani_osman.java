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

            PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            Policy policy = new Policy(policyNumber, providerName, holder);

            policies.add(policy);
        }

        input.close();

        int smokerCount = 0;
        int nonSmokerCount = 0;

        for (Policy policy : policies) {
            System.out.println(policy);
            System.out.println();

            if (policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}