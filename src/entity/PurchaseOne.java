package entity;

public class PurchaseOne extends AbstractPurchase{

    private int discountForUnit;

    public PurchaseOne(int discountForUnit) {
        super();
        this.discountForUnit = discountForUnit;
    }

    public PurchaseOne(Product product,int numberOfPurchasedUnits, int discountForUnit) {
        super(product, numberOfPurchasedUnits);
        this.discountForUnit = discountForUnit;
    }

    @Override
    public Euro getCost(){
        int globalDiscount = super.getNumberOfPurchasedUnits() * discountForUnit;
        Euro discount = new Euro(globalDiscount);
        return super.getCost().sub(discount);
    }

    @Override
    public String toString(){
        return super.toString() + ", discount for unit: " +  discountForUnit + " and total cost:" + getCost();
    }

    @Override
    public int compareTo(AbstractPurchase purchase){
        return this.getCost().getValue() - purchase.getCost().getValue();
    }

}
