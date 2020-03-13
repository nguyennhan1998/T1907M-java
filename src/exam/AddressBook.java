package exam;

import assignment1.PhoneNumber;

import java.util.ArrayList;

public class AddressBook {
    public ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact(String name, String company, String email, String phone) {
        for (Contact p : contactList) {
            if (p.getName().equals(name)) {
                if (p.getPhone().equals(phone)) {
                    return;
                }
                p.phone = p.getPhone() + ":" + phone;
                return;
            }
        }
        contactList.add(new Contact(name, company, email, phone));

    }
    public Contact searchContact(String name){
        for(Contact p:contactList){
            if(p.getName().equals(name)){
                if(p.getName().equals(name)){
                    return p;
                }
            }
        }
        return  null;

    }
    public void displayContact(){
        System.out.println("my contact list");
        for(Contact p:contactList){
            System.out.println(p.getName()+"   "+p.getCompany()+"   "+p.getEmail()+"    "+p.getPhone());
        }
    }

}
