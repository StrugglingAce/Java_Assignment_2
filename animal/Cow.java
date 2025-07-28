
package animal;

public class Cow extends Animal {
    private int milkPerDay;

    public Cow() {
        super("Cow");
    }

    public void setMilkPerDay(int milkPerDay) {
        this.milkPerDay = milkPerDay;
    }//setters

    public int getMilkPerDay() {
        return this.milkPerDay;
    }//getter
}

