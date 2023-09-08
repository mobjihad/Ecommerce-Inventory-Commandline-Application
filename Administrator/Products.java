package Administrator;

public abstract class Products {

    private String productName;
    private String productBrand;
    private String productColour;
    private double productPrice;
    private double productDiscountRate;
    private String productStatus;
    public static int numberOfProduct;

    public Products(){
    }

    public Products(String productName, String productBrand, String productColour, double productPrice, double productDiscountRate, String productStatus) {
        this.productName = productName;
        this.productBrand = productBrand;
        this.productColour = productColour;
        this.productPrice = productPrice;
        this.productDiscountRate = productDiscountRate;
        this.productStatus = productStatus;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public void setProductColour(String productColour) {
        this.productColour = productColour;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductDiscountRate(double productDiscountRate) {
        this.productDiscountRate = productDiscountRate;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public String getProductColour() {
        return productColour;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getProductDiscountRate() {
        return productDiscountRate;
    }

    public String isProductStatus() {
        return productStatus;
    }


    public abstract void viewProductDetails();



}