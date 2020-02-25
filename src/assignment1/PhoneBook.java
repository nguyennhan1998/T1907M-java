package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> phoneList= new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
//        for(int i=0;i<phoneList.size();i++){
//            phoneList.get(i);
//        }
        for(PhoneNumber p: phoneList){
            if(p.name.equals(name)){
                if(p.phone.equals(phone)){
                    return ;
                }
                p.phone=p.phone+":"+phone;
                return ;
            }
        }
        phoneList.add(new PhoneNumber(name,phone));
    }

    @Override
    public void removePhone(String name) {
        for(PhoneNumber p:phoneList){
            if(p.name.equals(name)){
                phoneList.remove(p);
                return;
            }
        }

    }

    @Override
    public void updatePhone(String name, String newPhone) {
         for(PhoneNumber p:phoneList){
             if(p.name.equals(name)){
                 p.phone=newPhone;
                 return;
             }
         }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for(PhoneNumber p:phoneList){
            if(p.name.equals(name)){
                if(p.name.equals(name)){
                    return p;
                }
            }
        }return null;

    }

    @Override
    public void sort() {
        Collections.sort(phoneList, new Comparator<PhoneNumber>(){
                    @Override
                    public int compare(PhoneNumber o1,PhoneNumber o2){
                        return o1.name.compareTo(o2.name);
                    }

        }
        );
        for(PhoneNumber p:phoneList){
            System.out.println(p.name+":"+p.phone);
        }
    }
}
