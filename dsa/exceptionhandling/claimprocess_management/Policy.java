package dsa.exceptionhandling.claimprocess_management;

class Policy {
    private int policyId;
    private double coverageAmount;
    private String validTill; // YYYY-MM-DD format for simplicity

    public Policy(int policyId, double coverageAmount, String validTill) {
        this.policyId = policyId;
        this.coverageAmount = coverageAmount;
        this.validTill = validTill;
    }

    public int getPolicyId() {
        return policyId;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public String getValidTill() {
        return validTill;
    }
}