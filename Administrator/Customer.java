package Administrator;

public  class Customer {
    private  int pass;
    private String username;
    private String CustomerName;

    public static int TotalCustomer;

    public Customer(int pass, String username, String customerName) {
        this.pass = pass;
        this.username = username;
        CustomerName = customerName;
        TotalCustomer +=1;
    }

    public Customer() {
        TotalCustomer +=1;

    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void showCustomerDetails(){
        System.out.println("Customer name :"+this.CustomerName);
        System.out.println("User Name "+this.username);
        System.out.println("Pass Word "+this.pass);

    }

}
