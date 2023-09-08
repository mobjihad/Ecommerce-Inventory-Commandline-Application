package Display;
import Administrator.*;

import java.util.Scanner;

public class Display {
    public void show() {

        try {

            boolean loop = true;


                int adminPass = 10;
                String adminUserName = "Jihad";
                Scanner input = new Scanner(System.in);
                JihadShop jihadShop = new JihadShop();
                Customer customer = new Customer(123, "JihadPro", "Jihad");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(" Login As Am Admin \nUserName: Jihad  || Pass: 10");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                System.out.print("Give user Name :");
                String GivenName = input.nextLine();
                System.out.print("Give Pass : ");
                int GivenPass = input.nextInt();


                if (GivenPass == adminPass && GivenName.equals(adminUserName)) {
                    while (loop) {
                    System.out.println("Logged In Successfull");


                    System.out.println("");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("You are Logged In As An Admistrator ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------");

                    System.out.print("Total Category : 4");
                    System.out.print("\t Total Product :" + Products.numberOfProduct);
                    System.out.print("\t Total Customer :" + Customer.TotalCustomer);
                    System.out.println("\t Total Sales :");
                    System.out.println("-----------------------------------------------------------------------------");

                    System.out.println("");

                    System.out.println("1. Insert A Product");
                    System.out.println("2. Delete A product");
                    System.out.println("3. view All Product");
                    System.out.println("4. insert A Customer");
                    System.out.println("5.exit");
                    System.out.println("Enter Your Choice :");
                    int choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("1. insert KeyBoard ");
                            System.out.println("2. insert Monitor ");
                            System.out.println("3. insert Mouse");
                            System.out.println("4. insert  Pendrive ");
                            System.out.print(" Please Enter Your Choice :");
                            int addProductInput = input.nextInt();


                            switch (addProductInput) {

                                case 1:
                                    Keyboard keyboard = new Keyboard();
                                    System.out.print("Please Enter KeyBoard Model (Input Type String) : ");
                                    keyboard.setProductName(input.nextLine());
                                    System.out.print("Please Enter KeyBoard Brand (Input Type String) :");
                                    keyboard.setProductBrand(input.nextLine());
                                    System.out.print("Please Enter KeyBoard Colour (Input Type String) : ");
                                    keyboard.setKeyColour(input.nextLine());

                                    System.out.println("Please Enter Connection Status (Wired Or Wireless (Input Type :String)");
                                    keyboard.setConnectionStatus(input.nextLine());
                                    System.out.print("Please Enter KeyBoard Statuse (Available Or Not Available (Type:String) :");
                                    keyboard.setProductStatus(input.nextLine());
                                    System.out.print("Please Enter How Many Keys are There  (Input Type Int) :");
                                    keyboard.setKeys(input.nextInt());
                                    System.out.print("Please Enter KeyBoard Price (Input Type Double) :");
                                    keyboard.setProductPrice(input.nextDouble());
                                    System.out.print("Please Enter KeyBoard Discount Rate (Input Type Double) :");
                                    keyboard.setProductDiscountRate(input.nextDouble());
                                    jihadShop.insertKeyboard(keyboard);
                                    break;

                                case 2:
                                    Monitor monitor = new Monitor();
                                    System.out.print("Please Enter Monitor Name (Input Type String) : ");
                                    monitor.setProductName(input.nextLine());
                                    System.out.print("Please Enter Monitor Brand (Input Type String) : ");
                                    monitor.setProductBrand(input.nextLine());
                                    System.out.print("Please Enter Monitor Resolution (Input Type String ig: 1080px720p) : ");
                                    monitor.setResolution(input.nextLine());

                                    System.out.print("Please Enter Monitor Colour (Input Type String) : ");
                                    monitor.setProductColour(input.nextLine());

                                    System.out.print("Please Enter Monitor Status (Available or Not Available) (Input Type String) : ");
                                    monitor.setProductStatus(input.nextLine());
                                    System.out.print("Please Enter Monitor Screen Size (Input Type int) : ");
                                    monitor.setScreenSize(input.nextInt());

                                    System.out.print("Please Enter Monitor Price (Input Type double) : ");
                                    monitor.setProductPrice(input.nextDouble());
                                    System.out.print("Please Enter Monitor Refresh Rate (Input Type int) : ");
                                    monitor.setRefreshRate(input.nextInt());
                                    System.out.print("Please Enter Monitor Discount Rate (Input Type Double) : ");
                                    monitor.setProductDiscountRate(input.nextDouble());
                                    jihadShop.insertMonitor(monitor);
                                    break;

                                case 3:
                                    Mouse mouse = new Mouse();
                                    System.out.print("Please Enter mouse Model Name (Input Type String) : ");
                                    mouse.setProductName(input.nextLine());
                                    System.out.print("Please Enter mouse Brand (Input Type String) :");
                                    mouse.setProductBrand(input.nextLine());
                                    System.out.print("Please Entermouse Colour  (Input Type String) :");
                                    mouse.setMouseLight(input.nextLine());
                                    System.out.print("Please Enter mouse Connection Status (Wireless Or Wired) (Input Type String) : ");
                                    mouse.setConnectionStatus(input.nextLine());
                                    System.out.print("Please Enter  mouse Colour (Input Type String) :");
                                    mouse.setProductColour(input.nextLine());
                                    System.out.print("Please Enter mouse DPI (Type:int) :");
                                    mouse.setDpi(input.nextInt());
                                    System.out.print("Please Enter  mouse Price (Input Type Double) :");
                                    mouse.setProductPrice(input.nextDouble());
                                    System.out.print("Please Enter  mouse Discount Rate  (Input Type Double) :");
                                    mouse.setProductDiscountRate(input.nextDouble());
                                    jihadShop.insertMouse(mouse);
                                    break;


                                case 4:
                                    Pendrive pendrive = new Pendrive();
                                    System.out.print("Please Enter Pendrive Name (Input Type String) : ");
                                    pendrive.setProductName(input.nextLine());
                                    System.out.print("Please Enter Product Brand (Input Type String) :");
                                    pendrive.setProductBrand(input.nextLine());
                                    System.out.print("Please Enter Pendrive's ReadSpeed  (Input Type String) :");
                                    pendrive.setReadSpeed(input.nextLine());
                                    System.out.print("Please Enter Pendrive's Write Speed (Input Type String) : ");
                                    pendrive.setWriteSpeed(input.nextLine());
                                    System.out.print("Please Enter  Pendrive's Colour (Input Type String) :");
                                    pendrive.setProductColour(input.nextLine());
                                    System.out.print("Please Enter Product Statuse (Available Or Not Available (Type:String) :");
                                    pendrive.setProductStatus(input.nextLine());
                                    System.out.print("Please Enter  Pendrive's Storage (Input Type int) :");
                                    pendrive.setStorage(input.nextInt());
                                    System.out.print("Please Enter  Pendrive's Weight in KG (Input Type Double) :");
                                    pendrive.setWeight(input.nextDouble());
                                    System.out.print("Please Enter  Pendrive's Price (Input Type String) :");
                                    pendrive.setProductPrice(input.nextDouble());
                                    System.out.print("Please Enter  Pendrive's Discount Rate (Input Type Double) :");
                                    pendrive.setProductDiscountRate(input.nextDouble());
                                    jihadShop.insertPendrive(pendrive);
                                    break;


                            }
                            break;

                        case 2:
                            System.out.println();
                            System.out.println("1. Delete KeyBoard ");
                            System.out.println("2. Delete Monitor ");
                            System.out.println("3. Delete Mouse");
                            System.out.println("4. Delete  Pendrive ");
                            System.out.print(" Please Enter Your Choice");
                            int deleteProductInput = input.nextInt();

                            switch (deleteProductInput) {


                                case 1:

                                    Keyboard keyboardSearch = new Keyboard();

                                    jihadShop.viewAllKeyBoard();
                                    System.out.println("Enter Model Name :");
                                    keyboardSearch.setProductName(input.nextLine());
                                    jihadShop.removeKeyboard(keyboardSearch);

                                    break;


                                case 2:

                                    Monitor monitorSearch = new Monitor();


                                    jihadShop.viewAllMonitor();

                                    System.out.println("Input The Model Name :");
                                    monitorSearch.setProductName(input.nextLine());
                                    jihadShop.removeMonitor(monitorSearch);
                                    break;

                                case 3:
                                    Mouse mouseSearch = new Mouse();


                                    jihadShop.viewAllMouse();
                                    System.out.println("Enter ");
                                    mouseSearch.setProductName(input.nextLine());

                                    jihadShop.removeMouse(mouseSearch);
                                    break;

                                case 4:


                                    Pendrive pendriveSearch = new Pendrive();
                                    jihadShop.viewAllPendrive();
                                    System.out.println("Enter Model Name ");
                                    pendriveSearch.setProductName(input.nextLine());

                                    jihadShop.removePendrive(pendriveSearch);
                                    break;


                                default:
                                    System.out.println("Wrong Input");
                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("1.view All Monitor");
                            System.out.println("2.View All KeyBoard");
                            System.out.println("3.View All Mouse");
                            System.out.println("4.View All Pendrive");
                            int viewProductInput = input.nextInt();

                            switch (viewProductInput) {


                                case 1:
                                    jihadShop.viewAllMonitor();
                                    break;

                                case 2:
                                    jihadShop.viewAllKeyBoard();
                                    break;

                                case 3:
                                    jihadShop.viewAllMouse();
                                    break;

                                case 4:
                                    jihadShop.viewAllPendrive();

                                default:
                                    System.out.println("Wrong Option");
                                    break;
                            }
                            break;
                        case 4:
                            Customer newCustomer = new Customer();
                            System.out.print("Please Enter KeyBoard Model (Input Type String) : ");
                            newCustomer.setCustomerName(input.nextLine());
                            System.out.print("Please Enter KeyBoard Brand (Input Type String) :");
                            newCustomer.setUsername(input.nextLine());
                            System.out.print("Please Enter KeyBoard Colour (Input Type String) : ");
                            newCustomer.setPass(input.nextInt());

                            jihadShop.insertCustomer(newCustomer);
                            break;
                        case 5:
                            loop = false;
                            System.out.println("Logged Out");
                            break;

                        default:
                            System.out.println("Wrong input");
                            break;


                    }


                }
                }else {

                    System.out.println("Wrong Input ");
                }



        }catch (Exception exception) {

            System.out.println("Invalid Input ");
        }

    }
    }




