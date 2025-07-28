
package animal;

public class Chicken extends Animal {
    private int eggsLaid;

    public Chicken() {
        super("Chicken");
    }

    public void setEggsLaid(int eggsLaid) {
        this.eggsLaid = eggsLaid;
    }//setters

    public int getEggsLaid() {
        return this.eggsLaid;
    }
}