/**
 * The Policy class stores information about an insurance policy
 * and provides methods to calculate BMI and policy price.
 */
public class Policy {

    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    private static int policyCount = 0;
       /**
     * Constructs a Policy object with all required information.
     *
     * @param policyNumber the policy number
     * @param providerName the insurance provider name
         */
    public Policy(int policyNumber, String providerName, PolicyHolder p) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = p;
        policyCount++;
    }

        public double calculatePolicyPrice() {
    double price = 600;

    if (policyHolder.getAge() > 50)
        price += 75;

    if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
        price += 100;

    if (policyHolder.calculateBMI() > 35)
        price += (policyHolder.calculateBMI() - 35) * 20;

    return price;
}  

    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }  
    public PolicyHolder getPolicyHolder() {
     return policyHolder;
    }
    public static int getPolicyCount() { return policyCount; }

     
}
  