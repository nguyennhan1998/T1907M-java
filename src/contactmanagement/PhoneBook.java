package contactmanagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    public PhoneBook(String name,String phone){
       super(name, phone);
    }
    public PhoneBook(){}

    ArrayList<PhoneBook> phoneList=new ArrayList<PhoneBook>();
    public int searchPhone(String name){
        for(int i=0;i<phoneList.size();i++){
            PhoneBook phoneName= phoneList.get(i);
            if(phoneName.getName().equals(name)){
                return i;
            }

        }
        return -1;

    }
    public void insertPhone(String name,String phone){
        out:
        {
            for (PhoneBook s : phoneList) {
                if (s.getName().equals(name)) {
                    if (s.getPhone().equals(phone)) {
                        System.out.println("the contact exist");

                    } else {
                        s.setPhone("\"" + s.getPhone() + ":" + phone + "\"");
                        System.out.println("new phone just add");


                    }
                    break out;
                }

            }
            phoneList.add(new PhoneBook(name,phone));
        }



    }
    public void displayList(){
        for(PhoneBook s: phoneList){
            System.out.println(s.getName()+" and "+s.getPhone());
        }
     //  System.out.println(phoneList);

    }

    public void removePhone(String name){
        if(searchPhone(name)>=0){
            phoneList.remove(searchPhone(name));
        }else{
            System.out.println("it doesn't exist in the list");
        }


    }
     void updatePhone(String name,String newName){
         int i=searchPhone(name);
        if(i>=0){

            phoneList.set(i,new PhoneBook(newName,phoneList.get(i).getPhone()));
        }
        else{
            System.out.println("your phone not exist in the list");
        }

     }
     public void  sortPhone(){
       Collections.sort(phoneList, new Comparator<PhoneBook>() {
           @Override
           public int compare(PhoneBook o1, PhoneBook o2) {
               if(o1.getName().compareTo(o2.getName())>0){
                   return 1;
               }else {
                   return -1;
               }
           }
       });
     }

}
