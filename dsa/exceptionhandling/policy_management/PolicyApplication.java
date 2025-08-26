package dsa.exceptionhandling.policy_management;

import dsa.exceptionhandling.InvalidageException;

// Custom checked exceptions
class PoorDrivingRecordException extends Exception {
    public PoorDrivingRecordException(String message) {
        super(message);
    }
}

class HealthIssueException extends Exception {
    public HealthIssueException(String message) {
        super(message);
    }
}

public class PolicyApplication {
    public void validateAge(int age) throws InvalidageException {
        if (age < 18 || age > 75) {
            throw new InvalidageException("Invalid age for policy: " + age);
        } else
            System.out.println("Eligible for policy");
    }

    public void Experience_Accidents(int experience, int accidents) throws PoorDrivingRecordException {
        if (accidents > 2 && experience < 3) {
            throw new PoorDrivingRecordException("Bad Driving with Less Experience!");
        } else
            System.out.print("Good Experience:  ");
        System.out.println("Eligible for policy");
    }

    public void validateHealth(boolean hasSeriousIllness) throws HealthIssueException {
        if (hasSeriousIllness) {
            throw new HealthIssueException("Serious health issues detected.");
        }
    }

    public void applyForPolicy(int age, int experience, int accidents, boolean hasSeriousIllness) throws InvalidageException, PoorDrivingRecordException, HealthIssueException {
        validateAge(age);
        Experience_Accidents(experience, accidents);
        validateHealth(hasSeriousIllness);
        System.out.println("Policy is Approved..!");
    }

}

