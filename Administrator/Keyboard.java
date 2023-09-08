package Administrator;

public class Keyboard extends Products{

    private int Keys;
    private String ConnectionStatus;
    private String KeyColour;

    public Keyboard() {
        numberOfProduct +=1;
    }


    public int getKeys() {
        return this.Keys;
    }

    public void setKeys(int keys) {
        this.Keys = keys;
    }

    public String getConnectionStatus() {
        return this.ConnectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.ConnectionStatus = connectionStatus;
    }

    public String getKeyColour() {
        return this.KeyColour;
    }

    public void setKeyColour(String keyColour) {
        this.KeyColour = keyColour;
    }

    @Override
    public void viewProductDetails() {

        System.out.println("KeyBoard  Name :"+this.getProductName());
        System.out.println("Monitor  Brand : "+this.getProductBrand());
        System.out.println("KeyBoard Key Colour :"+this.getKeyColour());
        System.out.println("KeyBoard Connection Status  :"+this.getConnectionStatus());
        System.out.println("KeyBoard Key Number  :"+this.getKeys());
        System.out.println("KeyBoard Colour : "+this.getProductColour());
        System.out.println("KeyBoard  Price : "+this.getProductPrice());
        System.out.println("KeyBoard  Discount Rate : "+this.getProductDiscountRate());
        System.out.println("KeyBoard Status :"+this.isProductStatus());

    }
}