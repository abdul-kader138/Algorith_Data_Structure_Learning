package Lambda.Annotation_Example;


public class FamilyMember {


    @FamilyBudget(budgetLimit = 100,userRole = "SENIOR")
    public void seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }


    @FamilyBudget(budgetLimit = 50,userRole = "JUNIOR")
    public void juniorUser(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
}
