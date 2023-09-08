package Administrator;

public class Monitor extends Products{
    private String Resolution;
    private int ScreenSize;
    private int RefreshRate;


    public Monitor() {
        numberOfProduct +=1;


    }

    public String getResolution() {
        return Resolution;
    }

    public void setResolution(String resolution) {
        this.Resolution =resolution;
    }

    public int getScreenSize() {
        return this.ScreenSize;
    }

    public void setScreenSize(int screenSize) {
        this.ScreenSize = screenSize;
    }

    public int getRefreshRate() {
        return this.RefreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.RefreshRate = refreshRate;
    }

    @Override
    public void viewProductDetails() {


        System.out.println("Monitor Name :"+this.getProductName());
        System.out.println("Monitor Resolution :"+this.getResolution());
        System.out.println("Monitor Refresh Rate  :"+this.getRefreshRate());
        System.out.println("Monitor Screen Size  :"+this.getResolution());
        System.out.println("Monitor  Brand : "+this.getProductBrand());
        System.out.println("Monitor Colour : "+this.getProductColour());
        System.out.println("Monitor  Price : "+this.getProductPrice());
        System.out.println("Monitor  Discount Rate : "+this.getProductDiscountRate());
        System.out.println("Monitor Status :"+this.isProductStatus());





    }

}