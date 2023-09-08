package Administrator;

import Operations.ProductsLinking;

public class JihadShop implements ProductsLinking{

    Pendrive pendrive[] = new Pendrive[100];
    Mouse mouse[] = new Mouse[100];
    Keyboard keyboard[] = new Keyboard[100];
    Monitor monitor[] = new Monitor[100];
    Customer Customer[]=new Customer[100];





    @Override
    public boolean insertKeyboard(Keyboard kb) {
        for(int i=0; i< keyboard.length; i++){
            if(keyboard[i]==null){

                keyboard[i]=kb;
                System.out.println("------- 1 KeyBoard Inserted To The List---------");
                return true;
            }
        }
        System.out.println("---Product Could Not Inserted --------");
        return false;
    }


    @Override
    public boolean insertMonitor(Monitor mr) {
        for(int i=0; i<monitor.length; i++){
            if(monitor[i]==null){

                monitor[i]=mr;
                System.out.println("------- 1 Monitor Inserted To The List---------");
                return true;
            }
        }
        System.out.println("-------Could Not Insert---------");
        return false;

    }


    @Override
    public boolean insertMouse(Mouse ms) {
        for (int i =0; i <mouse.length; i++) {
            if (mouse[i] == null) {

                mouse[i] = ms;
                System.out.println("------- 1 Mouse Inserted To The List---------");
                return true;
            }
        }
        System.out.println("-------Could Not Insert---------");
        return false;

    }




    @Override
    public boolean insertPendrive(Pendrive pd) {


        for(int i=0; i<pendrive.length; i++){
            if(pendrive[i]==null){

                pendrive[i]=pd;
                System.out.println("------- 1 Pendrive Inserted To The List---------");
                return true;
            }
        }
        System.out.println("-------Could Not Insert---------");
        return false;

    }



    public boolean insertCustomer(Customer cr) {
        for(int i=0; i<Customer.length; i++){
            if(Customer[i]==null){

                Customer[i]=cr;
                System.out.println("------- 1 Customer Inserted To The List---------");
                return true;
            }
        }
        System.out.println("---Product Could Not Inserted --------");
        return false;
    }



    @Override
    public boolean removeKeyboard(Keyboard kb) {

        for (int i=0; i<keyboard.length;i++){
            if(keyboard[i] != null && keyboard[i].getProductName().equals(kb.getProductName())){


                keyboard[i]=null;
                System.out.println("--------This Keyboard Has been Removed----------");
                return true;

            }
        }
        System.out.println("-------Could Not Dlete This Product--------" );
        return false;

    }


    @Override
    public boolean removeMouse(Mouse ms) {
        for (int i=0; i<mouse.length;i++){
            if(mouse[i] != null && mouse[i].getProductName().equals(ms.getProductName())){


                mouse[i]=null;
                System.out.println("--------This Mouse Has been Removed----------");
                return true;

            }
        }
        System.out.println("-------Could Not Dlete This Product--------" );
        return false;

    }


    @Override
    public boolean removeMonitor(Monitor mr) {
        for (int i=0; i< monitor.length;i++){
            if(monitor[i] != null && monitor[i].getProductName().equals(mr.getProductName())){


                monitor[i]=null;
                System.out.println("--------This Monitor Has been Removed----------");
                return true;

            }
        }
        System.out.println("-------Could Not Dlete This Product--------" );
        return false;

    }


    @Override
    public boolean removePendrive(Pendrive pd) {
        for (int i=0; i< pendrive.length;i++){
            if(pendrive[i] != null && pendrive[i].getProductName().equals(pd.getProductName())){


                pendrive[i]=null;
                System.out.println("--------This Pendrive Has been Removed----------");
                return true;

            }
        }
        System.out.println("-------Could Not Dlete This Product--------" );
        return false;

    }


    public void viewAllMonitor(){

        for(int i=0; i<monitor.length; i++){

            if (monitor[i]!=null){
                System.out.println("all Monitor Details");
                monitor[i].viewProductDetails();
                System.out.println();


            }
            else {
                System.out.println(" Product Not found");
            }
        }

    }

    public void viewAllKeyBoard() {

        for (int i = 0; i < keyboard.length; i++) {

            if (keyboard[i] != null) {
                System.out.println("All Keyboard Details");
                keyboard[i].viewProductDetails();
                System.out.println();


            } else {
                System.out.println(" Product Not found");
            }
        }
    }


        public void viewAllMouse() {

        for(int i=0; i<mouse.length; i++){

            if (mouse[i]!=null){
                System.out.println("All Mouse Details");
                mouse[i].viewProductDetails();
                System.out.println();



            }
            else {
                System.out.println(" Product Not found");
            }
        }
        }

    public void viewAllPendrive(){

        for(int i=0; i<pendrive.length; i++){

            if (pendrive[i]!=null){
                System.out.println("All Pendrive List :");
                pendrive[i].viewProductDetails();
                System.out.println();



            }
            else {
                System.out.println(" Product Not found");
            }
        }

      }






}