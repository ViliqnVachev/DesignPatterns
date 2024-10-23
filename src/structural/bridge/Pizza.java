package structural.bridge;

public abstract class Pizza {
    protected String sauce;
    protected String toppings;
    protected String crust;

    protected abstract void assemble();

    protected abstract void qualityCheck();

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }
}
