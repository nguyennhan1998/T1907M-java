package contactmanagement;

import java.awt.print.PrinterJob;
import java.util.ArrayList;

abstract public class Phone {
    private   String name,phone;
    public Phone(String name,String phone){
        this.name=name;
        this.phone=phone;
    }
    public Phone(){}

    abstract  void insertPhone(String name,String phone);
   abstract void removePhone(String name);
   abstract  void updatePhone(String name,String newName);
  abstract void sortPhone();
  abstract  int searchPhone(String name);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
