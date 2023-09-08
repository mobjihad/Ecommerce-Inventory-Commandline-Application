package Administrator;

public class Mouse extends Products{

    private int Dpi;
    private String MouseLight;
    private String ConnectionStatus;


    public Mouse() {
        numberOfProduct +=1;
    }

    public int getDpi() {
        return this.Dpi;
    }

    public void setDpi(int dpi) {
        this.Dpi = dpi;
    }

    public String getMouseLight() {
        return this.MouseLight;
    }

    public void setMouseLight(String mouseLight) {
        this.MouseLight = mouseLight;
    }

    public String getConnectionStatus() {
        return this.ConnectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.ConnectionStatus = connectionStatus;
    }

    @Override
    public void viewProductDetails() {

        System.out.println("Mouse Name :"+this.getProductName());
        System.out.println("Mouse Dpi :"+this.getDpi());
        System.out.println("Mouse Light  :"+this.getMouseLight());
        System.out.println("Mouse Connection Status  :"+this.getConnectionStatus());
        System.out.println("Mouse Brand : "+this.getProductBrand());
        System.out.println("Mouse Colour : "+this.getProductColour());
        System.out.println("Mouse  Price : "+this.getProductPrice());
        System.out.println("Mouse  Discount Rate : "+this.getProductDiscountRate());
        System.out.println("Mouse Status :"+this.isProductStatus());

    }
}