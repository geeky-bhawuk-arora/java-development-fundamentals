/* Defines an interface or abstract class for creating an object but
let the subclasses decide which class to instantiate.
*/

import java.io.*;

abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}

/*
A concrete class is a class that has an implementation for all of its methods. They cannot have any unimplemented methods. It can also extend an abstract class or implement an interface as long as it implements all their methods. It is a complete class and can be instantiated.
 */

// Concrete classes that extends Plan abstract class
class DomesticPlan extends Plan {
    public void getRate() {
        rate = 3.50;
    }
}

class CommercialPlan extends Plan {
    public void getRate() {
        rate = 7.50;
    }
}

class InstitutionalPlan extends Plan {
    public void getRate() {
        rate = 5.50;
    }
}

// Generate object of concrete classes
class GetPlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        /*
        Compares this String to another String, ignoring case considerations. Two strings are considered equal ignoring case if they are of the same length and corresponding characters in the two strings are equal ignoring case.
         */
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}

class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();

        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=0;
        Plan p =null;
        try {
            units = Integer.parseInt(br.readLine());

             p = planFactory.getPlan(planName);
            if (p != null) {
                System.out.print("Bill amount for " + planName + " of " + units + " units is: ");
            } else {
                System.out.println("Invalid plan name entered.");
            }

        } catch (Exception e) {
            System.out.println("Invalid unirs name entered");
        }

        try {
            p.getRate();
            p.calculateBill(units);
        } catch (Exception e) {
            System.out.println("An error occurred while getting the rate");
        }
    }
}





