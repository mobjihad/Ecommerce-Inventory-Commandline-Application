package Operations;

import Administrator.*;

public interface ProductsLinking {


    boolean insertPendrive(Pendrive pd);
    boolean insertMouse(Mouse ms);
    boolean insertKeyboard(Keyboard kb);
    boolean insertMonitor(Monitor mr);


    boolean removePendrive(Pendrive pd);
    boolean removeMouse(Mouse ms);
    boolean removeKeyboard(Keyboard kb);
    boolean removeMonitor(Monitor mr);
//    boolean removeCustomer(Customer cr);
    boolean insertCustomer(Customer cr);
}
