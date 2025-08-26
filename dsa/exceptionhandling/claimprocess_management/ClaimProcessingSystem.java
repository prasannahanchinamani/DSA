package dsa.exceptionhandling.claimprocess_management;

// Custom unchecked exception for fraudulent claims
class FraudulentClaimException extends RuntimeException {
    public FraudulentClaimException(String message) {
        super(message);
//        System.out.println(message);
    }
}

// Custom unchecked exception for invalid claim amounts
class InvalidClaimAmountException extends RuntimeException {
    public InvalidClaimAmountException(String message) {
        super(message);
//        System.out.println(message);

    }
}

public class ClaimProcessingSystem {
    public void processClaim(Policy policy, Claim claim) {
        if (claim.getClaimAmount() > policy.getCoverageAmount()) {
            throw new FraudulentClaimException("Coverage Amount is Exceeded Please verify again with:" + claim.getClaimId());
        }
        if (claim.getClaimAmount() <= 0)
            throw new InvalidClaimAmountException("Claim amount must be greater than 0 and less than coveage amount:");
        if (claim.getClaimDate().compareTo(policy.getValidTill()) > 0)
            throw new FraudulentClaimException("Claim amount is taken after policy date check onece:" + claim.getClaimId());

        System.out.println(" Claim ID " + claim.getClaimId() + " processed successfully!");
    }


}
