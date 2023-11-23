package entity;

public class PurchaseTwo extends AbstractPurchase{

    private final int AMOUNT_TO_GET_DISCOUNT = 4;
    private double discountPercent;

    public PurchaseTwo(double discountPercent) {
        super();
        this.discountPercent = discountPercent;
    }

    public PurchaseTwo(Product product,int numberOfPurchasedUnits, double discountPercent) {
        super(product, numberOfPurchasedUnits);
        this.discountPercent = discountPercent;
    }


    @Override
    public Euro getCost() {
        if(super.getNumberOfPurchasedUnits() > AMOUNT_TO_GET_DISCOUNT){
            Euro initialValue = super.getCost();
            double discount = discountPercent / 100;
            Euro discountToEuro = initialValue.mul(discount);
            return super.getCost().sub(discountToEuro);
        }
        else{
            return super.getCost();
        }
    }
    @Override
    public String toString(){
        return super.toString() + ", amount to get discount:" + AMOUNT_TO_GET_DISCOUNT +
                ", discount: " + discountPercent + " and total cost:" + getCost();
    }

    @Override
    public int compareTo(AbstractPurchase purchase){
        return this.getCost().getValue() - purchase.getCost().getValue();
    }

}
