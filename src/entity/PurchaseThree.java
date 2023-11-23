package entity;

public class PurchaseThree extends AbstractPurchase{

    private Euro transportExpenses;

    public PurchaseThree(Euro transportExpenses) {
        this.transportExpenses = transportExpenses;
    }

    public PurchaseThree(Product product, int numberOfPurchasedUnits, Euro transportExpenses) {
        super(product, numberOfPurchasedUnits);
        this.transportExpenses = transportExpenses;
    }

    @Override
    public Euro getCost(){
        return super.getCost().add(transportExpenses);
    }
    @Override
    public String toString(){
        return super.toString() + ", transport expenses: " + transportExpenses + " and total cost:" + getCost();
    }

    @Override
    public int compareTo(AbstractPurchase purchase){
        return this.getCost().getValue() - purchase.getCost().getValue();
    }

}
