package entity;

public class Euro {
    private int value;

    public Euro(int value) {
        this.value = value;
    }
    public Euro(Euro value){
        this.value = value.value;
    }


    public int getValue() {
        return value;
    }

    public String toString(){
        return String.format("%d.%02d", value / 100, value % 100);
    }

    public Euro mul(int numberOfUnits){
        value *= numberOfUnits;
        return this;
    }
    public Euro mul(double discount){
        value = (int) (value * discount);
        return this;
    }

    public Euro add(Euro euro){
        value += euro.value;
        return this;
    }
    public Euro sub(Euro euro){
        value = this.value - euro.value;
        return this;
    }

}
