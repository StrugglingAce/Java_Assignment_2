package animal;

public abstract class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }//constructor

    public void setType(String type) {
        this.type = type;
    }//setter

    public String getType() {
        return this.type;
    }//getter
    
}
