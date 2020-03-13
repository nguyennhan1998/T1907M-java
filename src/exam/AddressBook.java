package exam;

import assignment1.PhoneNumber;

import java.util.ArrayList;

public class AddressBook {
    public ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact(String name, String company, String email, String phone) {
        for (Contact p : contactList) {
            if (p.name.equals(name)) {
                if (p.phone.equals(phone)) {
                    return;
                }
                p.phone = p.phone + ":" + phone;
                return;
            }
        }
        contactList.add(new Contact(name, company, email, phone));

    }
    public Contact searchContact(String name){
        for(Contact p:contactList){
            if(p.name.equals(name)){
                if(p.getName().equals(name)){
                    return p;
                }
            }
        }
        return  null;

    }
    public void displayContact(){
        System.out.println("name     company        mail         phone");
        for(Contact p:contactList){
            System.out.println(p.name+"   "+p.company+"   "+p.email+"    "+p.phone);
        }
    }

}
