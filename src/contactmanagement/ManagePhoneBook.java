package contactmanagement;

import java.util.Collection;
import java.util.Scanner;

public class ManagePhoneBook {
    private  static Scanner scanner= new Scanner(System.in);
    private static PhoneBook phoneList= new PhoneBook();

    public static void main(String[] args) {
        boolean quit=false;
        while(!quit){
            System.out.println("\nEnter action: ");
            int action= scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    addNewContact();
                    break;
                case 1:
                    removeContact();
                    break;
                case 2:
                    updatePhone();
                    break;
                case 3:
                    searchPhone();
                    break;
                case 4:
                    sortPhone();
                    break;
                case 5:
                    System.out.println("exit");
                    quit=true;
                    break;
            }
        }

    }
    private static void addNewContact(){
        System.out.println("Enter name");
        String name=scanner.nextLine();
        System.out.println("Enter phone");
        String phone = scanner.nextLine();
        phoneList.insertPhone(name,phone);

    }
    private static void removeContact(){
        System.out.println("Enter a name");
        String name= scanner.nextLine();
        phoneList.removePhone(name);
    }
    private static void updatePhone(){
        System.out.println("Enter name");
        String name=scanner.nextLine();
        System.out.println("Enter new name");
        String newName=scanner.nextLine();
        phoneList.updatePhone(name,newName);
    }
    private static void searchPhone(){
        System.out.println("Enter name");
        String name=scanner.nextLine();
        int t=phoneList.searchPhone(name);
        if(t>=0)
        {
            System.out.println("your Contact exist in the list ");
        }else{
            System.out.println("your contact not exist in the list");
        }
    }
    private static  void sortPhone(){
        phoneList.sortPhone();
    }

}
