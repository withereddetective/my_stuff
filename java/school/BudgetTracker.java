public class BudgetTracker {

    // Part A: Instance variables

    int items;
    double totalCost;

    // Part B: Constructor
    public BudgetTracker() {
        items = 0;
        totalCost = 0;
    }

    // Part C: addPurchase
    public void addPurchase(int quantity, double price) {

        items += quantity;
        totalCost += price * quantity;

    }

    // Part D: averageCostPerItem
    public double averageCostPerItem() {
        if (items == 0) {
            return 0.0;
        }
        return totalCost / items;
    }
}