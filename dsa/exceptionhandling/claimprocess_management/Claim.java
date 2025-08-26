package dsa.exceptionhandling.claimprocess_management;

public class Claim {
    private int claimId;
    private double claimAmount;
    private String claimDate; // YYYY-MM-DD format

    public Claim(double claimAmount, String claimDate, int claimId) {
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.claimId = claimId;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public String getClaimDate() {
        return claimDate;
    }

    public int getClaimId() {
        return claimId;
    }
}
