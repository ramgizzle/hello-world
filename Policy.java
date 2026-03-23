/**
 * The Policy class stores information about an insurance policy
 * and provides methods to calculate BMI and policy price.
 */
public class Policy {

    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     * Constructs a Policy object with all required information.
     *
     * @param policyNumber the policy number
     * @param providerName the insurance provider name
     * @param firstName the policyholder's first name
     * @param lastName the policyholder's last name
     * @param age the policyholder's age
     * @param smokingStatus the smoking status (smoker/non-smoker)
     * @param height the height in inches
     * @param weight the weight in pounds
     */
    public Policy(int policyNumber, String providerName, String firstName,
                  String lastName, int age, String smokingStatus,
                  double height, double weight) {

        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Calculates and returns the BMI of the policyholder.
     *
     * @return the BMI value
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * Calculates and returns the policy price based on age,
     * smoking status, and BMI.
     *
     * @return the calculated policy price
     */
    public double calculatePolicyPrice() {
        double price = 600;

        if (age > 50)
            price += 75;

        if (smokingStatus.equalsIgnoreCase("smoker"))
            price += 100;

        if (calculateBMI() > 35)
            price += (calculateBMI() - 35) * 20;

        return price;
    }

    /**
     * @return the policy number
     */
    public int getPolicyNumber() { return policyNumber; }

    /**
     * @return the provider name
     */
    public String getProviderName() { return providerName; }

    /**
     * @return the policyholder's first name
     */
    public String getFirstName() { return firstName; }

    /**
     * @return the policyholder's last name
     */
    public String getLastName() { return lastName; }

    /**
     * @return the policyholder's age
     */
    public int getAge() { return age; }

    /**
     * @return the smoking status
     */
    public String getSmokingStatus() { return smokingStatus; }

    /**
     * @return the height in inches
     */
    public double getHeight() { return height; }

    /**
     * @return the weight in pounds
     */
    public double getWeight() { return weight; }
}
  