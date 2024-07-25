package Project;

public class Pojo {
    int id;
    String pName;
    int quantity;
    int rate1;
    int rate2;

    public Pojo(int id, String pName, int quantity, int rate1, int rate2) {
        this.id = id;
        this.pName = pName;
        this.quantity = quantity;
        this.rate1 = rate1;
        this.rate2 = rate2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRate1() {
        return rate1;
    }

    public void setRate1(int rate1) {
        this.rate1 = rate1;
    }

    public int getRate2() {
        return rate2;
    }

    public void setRate2(int rate2) {
        this.rate2 = rate2;
    }

    public Pojo() {
    }

}
