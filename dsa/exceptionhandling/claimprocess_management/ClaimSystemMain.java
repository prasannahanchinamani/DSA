package dsa.exceptionhandling.claimprocess_management;

public class ClaimSystemMain {
    private static void processSafely(ClaimProcessingSystem cps, Policy policy, Claim claim) {
        try {
            cps.processClaim(policy, claim);
        } catch (FraudulentClaimException | InvalidClaimAmountException ex) {
            System.out.println(" Error: " + ex.getMessage());
            System.out.println(" Notification sent to claims department for investigation.\n");
        }
    }

    public static void main(String[] args) throws FraudulentClaimException, InvalidClaimAmountException {
        Policy policy = new Policy(101, 100000, "2025-12-31");

        Claim validClaim = new Claim(50000, "2025-06-01", 101);
        Claim invalidAmountClaim = new Claim(1000, "2025-07-10", 202);
        Claim overLimitClaim = new Claim(200000, "2025-08-20", 203);
        Claim expiredClaim = new Claim(30000, "2026-01-15", 204);
        ClaimProcessingSystem cps = new ClaimProcessingSystem();
        processSafely(cps, policy, validClaim);
        processSafely(cps, policy, invalidAmountClaim);
        processSafely(cps, policy, overLimitClaim);
        processSafely(cps, policy, expiredClaim);
    }
}
