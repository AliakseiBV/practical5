package entity;

public abstract class AbstractPurchase implements java.lang.Comparable<AbstractPurchase> {

    private Product product;
    private int numberOfPurchasedUnits;

    public AbstractPurchase(){
        this.product = new Product();
        this.numberOfPurchasedUnits = 1;
    }

    public AbstractPurchase(Product product, int numberOfPurchasedUnits){
        this.product = product;
        this.numberOfPurchasedUnits = numberOfPurchasedUnits;
    }

    public int getNumberOfPurchasedUnits() {
        return numberOfPurchasedUnits;
    }

    public Product getProduct() {
        return product;
    }

    public Euro getCost(){
        Euro purchaseCost = product.getPrice().mul(numberOfPurchasedUnits);
        return purchaseCost;
    }
    @Override
    public String toString() {
        return "AbstractPurchase{" +
                "PRODUCT_NAME=" + product.getName() +
                ", PRICE=" + product.getPrice() +
                ", NUMBER_OR_PURCHASED_UNITS=" + numberOfPurchasedUnits +
                '}';
    }

    public int compareTo(AbstractPurchase purchase){
        return 0;
    }
}
