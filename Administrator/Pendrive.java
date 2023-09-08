package Administrator;

public class Pendrive extends Products{

    private double weight;
    private int storage;
    private String readSpeed;
    private String writeSpeed;

    public Pendrive() {

        numberOfProduct +=1;
    }


    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getStorage() {
        return this.storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getReadSpeed() {
        return this.readSpeed;
    }

    public void setReadSpeed(String readSpeed) {
        this.readSpeed = readSpeed;
    }

    public String getWriteSpeed() {
        return this.writeSpeed;
    }

    public void setWriteSpeed(String writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    @Override
    public void viewProductDetails() {
        System.out.println("Pendrive Name : "+this.getProductName());
        System.out.println("Pendrive Weight :"+this.getWeight()+"Kg");
        System.out.println("Pendrive Storage :"+this.getStorage());
        System.out.println("Pendrive ReedSpeed :"+this.getReadSpeed());
        System.out.println("Pendrive WriteSpeed :"+this.getWriteSpeed());
        System.out.println("Pendrive Brand : "+this.getProductBrand());
        System.out.println("Pendrive Colour : "+this.getProductColour());
        System.out.println("Pendrive Price : "+this.getProductPrice());
        System.out.println("Pendrive Discount Rate : "+this.getProductDiscountRate());
        System.out.println("Pendrive Status :"+this.isProductStatus());



    }
}